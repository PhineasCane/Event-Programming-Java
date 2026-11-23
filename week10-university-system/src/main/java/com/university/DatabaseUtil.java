package com.university;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// This class handles the connection to the database
public class DatabaseUtil {
    private static final Dotenv DOTENV = Dotenv.configure()
            .directory(".")
            .ignoreIfMissing()
            .load();
    private static final String URL = DOTENV.get("DB_URL", "jdbc:mysql://localhost:3306/university_db");
    private static final String USER = DOTENV.get("DB_USER", "root");
    private static final String PASSWORD = requiredSetting("DB_PASSWORD");

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    private static String requiredSetting(String name) {
        String value = DOTENV.get(name);
        if (value == null || value.isBlank()) {
            throw new IllegalStateException(
                    "Missing required setting " + name
                            + " in week10-university-system/.env or the process environment."
            );
        }
        return value;
    }
}