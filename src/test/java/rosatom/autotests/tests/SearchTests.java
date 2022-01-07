package rosatom.autotests.tests;

import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;

@DisplayName("Поиск на странице https://rosatom-career.ru/")
public class SearchTests extends TestBase {
    @BeforeEach
    public void openCheckPage() {
        step(String.format("Открываем страницу %s", urlForTest), () -> {
            open(urlForTest);
            Assertions.assertEquals(1, 1);
        });
    }

    private final String urlForTest = "https://rosatom-career.ru/";
    private final String searchVacancy = "инженер";
    private final String titleText = "Вакансии";

    @Test
    @Tag("UITests")
    @DisplayName("Поиск конкретной вакансии")
    void vacancySearchTest() {
        step(String.format("Вводим в строке поиска вакансию '%s'", searchVacancy), () -> {
            $("input.chakra-input.css-nwb3dv").click();
            $("input.chakra-input.css-nwb3dv").sendKeys(searchVacancy);
            $("button.chakra-button.css-3diha").click();
        });

        step(String.format("Проверяем, что открылась страница '%s'", titleText), () -> {
            String getTitle = $("h1").getText();
            Assertions.assertTrue(titleText.equals(getTitle), "Ошибка: заголовок не тот, который ожидали");
        });

        step(String.format("Проверяем, что в поле поиска вакансия '%s'", searchVacancy), () -> {
            String result = $("input.chakra-input.css-1nbfqhc").getValue();
            Assertions.assertTrue(searchVacancy.equals(result), "Ошибка: неверное значение в поле поиска");
        });
    }


}