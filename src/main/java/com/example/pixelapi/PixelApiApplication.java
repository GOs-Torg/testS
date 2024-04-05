package com.example.pixelapi;

import com.example.pixelapi.controllers.DBController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class PixelApiApplication {
	public static void main(String[] args) {
		DBController controller = new DBController();
		try {
			controller.runQuery("CREATE DATABASE IF NOT EXISTS PixelAPI");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		SpringApplication.run(PixelApiApplication.class, args);
	}

}
