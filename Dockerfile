FROM openjdk:17-jdk-slim

EXPOSE 27004

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

# Команда для запуска приложения
ENTRYPOINT ["java", "-jar", "app.jar"]