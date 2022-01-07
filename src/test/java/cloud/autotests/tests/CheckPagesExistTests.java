package cloud.autotests.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class CheckPagesExistTests {
    @Test
    @Tag("ApiTests")
    public void test1() {
        step("OnlyOneAssert", () -> {
            Assertions.assertEquals(1,1);
        });
    }
}
