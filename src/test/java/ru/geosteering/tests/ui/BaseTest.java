package ru.geosteering.tests.ui;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public abstract class BaseTest {
    protected static Properties properties = new Properties();

    @BeforeAll
    public static void setUp() throws IOException {
        try (InputStream input = BaseTest.class.getClassLoader().getResourceAsStream("application.properties")) {
            if (input == null) {
                throw new RuntimeException("Файл application.properties не найден в resources");
            }
        }

        Configuration.browser = properties.getProperty("browser");
        Configuration.baseUrl = properties.getProperty("base.url");
        Configuration.holdBrowserOpen = Boolean.parseBoolean(properties.getProperty("holdBrowserOpen"));
        Configuration.headless = Boolean.parseBoolean(properties.getProperty("headless"));



    }
}
