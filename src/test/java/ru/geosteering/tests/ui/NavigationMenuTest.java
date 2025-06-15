package ru.geosteering.tests.ui;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static ru.geosteering.repository.PageRepository.mainPage;

public class NavigationMenuTest {

    @Test
    @DisplayName("Переход на страницу GEOSTEERING OFFICE из меню навигации на главной странице")
    public void userCanNavigateToGeosteeringOfficePage() {
        step("Открываем главную страницу сайта", () -> {
            open(mainPage.url());
        });
        step("Переходим к разделу 'GEOSTEERING Office'", () -> {
            mainPage.softwareProductsTab().click();
            mainPage.softwareProductsClick().click();
        });
        step("Убедиться, что открыта страница GEOSTEERING Office", () -> {
            mainPage.isOpenPage("https://geosteering.ru/geosteering-software-ru/");
        });
    }

    @Test
    @DisplayName("Переход на страницу 'Контакты' из меню навигации на главной странице")
    public void userCanNavigateToContactsPage() {
        step("Открываем главную страницу сайта", () -> {
            open(mainPage.url());
        });
        step("Кликаем на кнопку 'Контакты'", () -> {
            mainPage.buttonContacts().click();
        });
        step("Убедиться, что открыта страница Контакты", () -> {
            mainPage.isOpenPage("https://geosteering.ru/contact/");
        });
    }
}