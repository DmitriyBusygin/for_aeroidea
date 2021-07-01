package ru.aeroidea.tests;

import ru.aeroidea.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @DisplayName("Проверка надписи на сайте")
    void generatedTest() {
        step("Открыть https://aeroidea.ru/", () -> {
            open("https://aeroidea.ru/");
        });

        step("Проверка что есть надпись \"Специализация на крупнейших eCommerce-проектах\"", () -> {
            $x("//div[@data-sr='data-sr' and @class='row']").shouldHave(text("Специализация на крупнейших eCommerce-проектах"));
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://aeroidea.ru/'", () ->
            open("https://aeroidea.ru/"));

        step("Page title should have text 'Aero eCommerce агентство – Ваш бизнес-партнер в сфере электронной коммерции'", () -> {
            String expectedTitle = "Aero eCommerce агентство – Ваш бизнес-партнер в сфере электронной коммерции";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://aeroidea.ru/'", () ->
            open("https://aeroidea.ru/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}