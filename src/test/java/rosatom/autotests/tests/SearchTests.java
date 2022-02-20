package rosatom.autotests.tests;

import org.junit.jupiter.api.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

@DisplayName("Поиск на странице rosatom-career.ru")
public class SearchTests extends TestBase {
    @BeforeEach
    public void openCheckPage() {
        step(String.format("Открываем страницу %s", testPage.gerUrl()), () -> {
            testPage.openPage();
        });
    }

    private final String searchVacancy = "инженер";
    private final String titleText = "Вакансии";

    @Test
    @Tag("UITests")
    @DisplayName("Поиск конкретной вакансии")
    void vacancySearchTest() {
        step(String.format("Вводим в строке поиска вакансию '%s'", searchVacancy), () -> {
            testPage.getTopElement().scrollIntoView(true);
            testPage.getSearchElementsArea().click();
            testPage.getSearchInputField().click();
            testPage.getSearchInputField().sendKeys(searchVacancy);
            testPage.getFindButton().click();
        });

        step(String.format("Проверяем, что открылась страница '%s'", titleText), () -> {
            String getTitle = testPage.selectElementByName("h1").getText();
            Assertions.assertTrue(titleText.equals(getTitle), "Ошибка: заголовок не тот, который ожидали");
        });

        step(String.format("Проверяем, что в поле поиска вакансия '%s'", searchVacancy), () -> {
            String result = testPage.getSearchResultField().getValue();
            Assertions.assertTrue(searchVacancy.equals(result), "Ошибка: неверное значение в поле поиска");
        });
    }
}
