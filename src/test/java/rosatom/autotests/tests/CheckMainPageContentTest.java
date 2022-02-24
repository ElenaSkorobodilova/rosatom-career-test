package rosatom.autotests.tests;

import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.text;
import static io.qameta.allure.Allure.step;

@DisplayName("Тесты на проверку содержимого главной страницы сайта rosatom-career.ru")
public class CheckMainPageContentTest extends TestBase {
    private final String youngText = "Молодым специалистам";
    private final String headerText = "Вакансии\nМолодым специалистам\nНаправления бизнеса\nВойти";
    private final String mainText = "Всё начинается \n с атома, а Росатом \n начинается с людей";
    private final String subMenu1 = "Возможности Росатома";
    private final String subMenu2 = "Мероприятия";
    private final String subMenu3 = "Образование";

    @BeforeEach
    public void openCheckPage() {
        step(String.format("Открываем страницу %s", urlForTest), () -> {
            testPage.openPage(urlForTest);
        });
    }

    @Test
    @Tag("UITests")
    @DisplayName("Проверка содержимого заголовков в верхнем меню главной страницы")
    void menuItemTest() {
        step("Проверяем, что на странице есть заданный header", () -> {
            Assertions.assertTrue(testPage.selectElementByName("header").exists(),
                    "Ошибка: на странице отсутствует ожидаемый header");
        });

        step("Проверяем, что header страницы содержит необходимые подзаголовки", () -> {
            testPage.getHeaderSubs().shouldHave(
                    text(headerText)
                            .because("Ошибка: в header нет ожидаемых пунктов меню"));
        });
    }

    @Test
    @Tag("UITests")
    @DisplayName("Проверка, что заданный пункт меню содержит подменю")
    void submenuItemTest() {
        step(String.format("Проверяем, что у меню '%s' есть подменю", youngText), () -> {
            testPage.selectElementByText(youngText).click();

            Assertions.assertTrue(testPage.selectElementByLinkText(subMenu1).exists(),
                    String.format("Ошибка: отсутствует пункт подменю '%s'", subMenu1));

            Assertions.assertTrue(testPage.selectElementByLinkText(subMenu2).exists(),
                    String.format("Ошибка: отсутствует пункт подменю '%s'", subMenu2));

            Assertions.assertTrue(testPage.selectElementByLinkText(subMenu3).exists(),
                    String.format("Ошибка: отсутствует пункт подменю '%s'", subMenu3));
        });
    }

    @Test
    @Tag("UITests")
    @DisplayName("Проверка наличия блока подписки на соцсети в подвале страницы")
    void selectionTextTest() {
        step("Проверяем, что на главной странице есть footer", () -> {
            Assertions.assertTrue(testPage.selectElementByName("footer").exists(),
                    "Ошибка: footer не найден");
        });

        testPage.selectElementByName("footer").scrollIntoView(true);

        step("Проверяем, что в нём есть раздел с подпиской на соцсети", () -> {
            Assertions.assertTrue(testPage.selectElementByText("Подписывайтесь на наши соцсети:").exists(),
                    "Ошибка: раздел ссылок на соцсети отсутствует или не имеет заголовка");
        });
    }


    @Test
    @Tag("UITests")
    @DisplayName("Проверка наличия имиджевого текста на первой странице сайта")
    void mainTextTest() {
        step("Проверяем, что на главной странице есть нужный текст", () -> {
            Assertions.assertTrue(mainText.equals(testPage.getMainText().getOwnText()),
                    "Ошибка: неверный текст на главной странице");
        });
    }
}
