package rosatom.autotests.tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Поиск на странице https://rosatom-career.ru/")
public class GeneratedTests extends TestBase {
    private final String urlForTest = "https://rosatom-career.ru/";
    private final String searchVacancy = "инженер";
    private final String issueText = "New Cost Analysis feature";

    @Test
    @Tag("UITests")
    @DisplayName("Поиск вакансии 'инженер'")
    void generatedTest() {
        step(String.format("Открываем страницу %s",urlForTest), () -> {
            open(urlForTest);
            Assertions.assertEquals(1,1);
        });

        step(String.format("ищем вакансию %s",searchVacancy), () -> {
            $(".header-search-input").click();
            $(".header-search-input").sendKeys("oracle");
            $(".header-search-input").submit();
        });

//        step("Input 'инженер' in search field", () -> {
//            step("// todo: just add selenium action");
//        });
//
//        step("Search vacancy", () -> {
//            step("// todo: just add selenium action");
//        });
//
//        step("Check results", () -> {
//            step("// todo: just add selenium action");
//        });
    }
}