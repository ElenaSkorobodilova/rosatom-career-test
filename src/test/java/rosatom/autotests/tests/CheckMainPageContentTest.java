package rosatom.autotests.tests;

import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;

public class CheckMainPageContentTest extends TestBase {
    @BeforeEach
    public void openCheckPage() {
        step(String.format("Открываем страницу %s", urlForTest), () -> {
            open(urlForTest);
            Assertions.assertEquals(1, 1);
        });
    }

    private final String urlForTest = "https://rosatom-career.ru/";
    private final String youngText = "Молодым специалистам";
    private final String headerText = "Вакансии\nМолодым специалистам\nНаправления бизнеса\nВойти";
    private final String mainText = "Всё начинается \n с атома, а Росатом \n начинается с людей";
    private final String subMenu1 = "Возможности Росатома";
    private final String subMenu2 = "Мероприятия";
    private final String subMenu3 = "Образование";

    @Test
    @Tag("UITests")
    @DisplayName("Проверка содержимого header главной страницы")
    void menuItemTest() {
        step("Проверяем, что на странице есть заданный header", () -> {
            boolean exist = $("header.css-x62upb").exists();
            Assertions.assertTrue(exist, "Ошибка: на странице отсутствует ожидаемый header");
        });

        step("Проверяем, что header страницы содержит необходимые подзаголовки", () -> {
            String getTitle = $("div.css-9bz79c").getText();
            Assertions.assertTrue(headerText.equals(getTitle), "Ошибка: в header нет ожидаемых пунктов меню");
        });
    }

    @Test
    @Tag("UITests")
    @DisplayName("Проверка, что пункт меню содержит подменю")
    void submenuItemTest() {
        step(String.format("Проверяем, что у меню %s есть подменю", youngText), () -> {
            $(byText(youngText)).click();

            Assertions.assertTrue($(linkText(subMenu1)).exists(),
                    String.format("Ошибка: отсутствует пункт подменю %s", subMenu1));

            Assertions.assertTrue($(linkText(subMenu2)).exists(),
                    String.format("Ошибка: отсутствует пункт подменю %s", subMenu2));

            Assertions.assertTrue($(linkText(subMenu3)).exists(),
                    String.format("Ошибка: отсутствует пункт подменю %s", subMenu3));
        });
    }


    @Test
    @Tag("UITests")
    @DisplayName("Проверка текста на первой странице сайта")
    void mainTextTest() {
        step("Проверяем, что на главной странице есть нужный текст", () -> {
            String getText = $("p.chakra-text.css-853lye").getOwnText();
            Assertions.assertTrue(mainText.equals(getText),
                    String.format("Ошибка: неверный текст на главной странице. Вместо %s получили %s", mainText, getText));
        });
    }
}
