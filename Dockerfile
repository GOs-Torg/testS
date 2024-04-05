# Этап 1: Стадия сборки
FROM ubuntu:latest AS build

# Установка зависимостей и Java
RUN apt-get update && \
apt-get install -y openjdk-17-jdk maven && \
apt-get clean;

# Установка рабочей директории
WORKDIR /app

# Копирование файлов проекта Maven и сборка приложения
COPY . .

# Сборка приложения с помощью Maven
RUN mvn clean package

# Этап 2: Стадия выполнения
FROM openjdk:17-jdk-slim

# Открытие порта 8080 (предполагается, что ваше приложение слушает на этом порту)
EXPOSE 8080

# Установка рабочей директории
WORKDIR /app

# Копирование собранного JAR-файла из стадии сборки
COPY —from=build /app/target/*.jar app.jar

# Команда для запуска приложения
ENTRYPOINT ["java", "-jar", "app.jar"]