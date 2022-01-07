package rosatom.autotests.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class CheckPagesExistTests {
    @Test
    @Tag("ApiTests")
    public void test1() {
        //заготовка для размещения следующей группы тестов
        //ассерт фейковый, чтобы гонять на сборщике эту пустую группу
        step("OnlyOneAssert", () -> {
            Assertions.assertEquals(1,1);
        });
    }
}
