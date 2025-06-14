package ru.geosteering.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import ru.geosteering.tests.ui.BaseTest;
import static com.codeborne.selenide.Selenide.$x;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainPage extends BaseTest {

    public String url() {
        return BasePage.url();
    }

    public SelenideElement softwareProductsTab() {
        return $x("//a[text()='Программные продукты']").as("Вкладка Программные продукты");
    }

    public SelenideElement softwareProductsClick() {
        return $x("//a[text()='GEOSTEERING OFFICE']").as("Клик на GEOSTEERING OFFICE");
    }

    public void isOpenPage(String actualUrl) {
        String currentUrl = Selenide.webdriver().driver().url();
        assertEquals(currentUrl, actualUrl);
    }

    public SelenideElement buttonContacts() {
        return $x("//span[text()='Контакты']").as("Вкладка Контакты");
    }

}

