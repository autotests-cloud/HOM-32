package cloud.autotests.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class AppTests extends TestBase {

    @Test
    @DisplayName("Selenide search test")
    void test() {

        step("Open https://google.com", () -> {
            // todo
        });

        step("Type 'Selenide' to search input", () -> {
            // todo
        });

        step("Verify, search results have text 'selenide.org'", () -> {
            // todo
        });

    }
}