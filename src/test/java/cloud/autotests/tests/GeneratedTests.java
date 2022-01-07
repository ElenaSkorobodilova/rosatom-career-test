package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Tag("UITests")
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Search in https://rosatom-career.ru/")
    void generatedTest() {
        step("Open 'https://rosatom-career.ru/'", () -> {
            open("https://rosatom-career.ru");
//            step("// todo: just add selenium action");
            Assertions.assertEquals(1,1);
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