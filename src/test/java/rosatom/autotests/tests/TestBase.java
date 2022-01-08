package rosatom.autotests.tests;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import rosatom.autotests.config.CredentialConfig;
import rosatom.autotests.helpers.Attaches;

import static java.lang.String.format;

public class TestBase {
    @BeforeAll
    static void setup() {
        CredentialConfig credentials =
                ConfigFactory.create(CredentialConfig.class);
        String login = credentials.login();
        String password = credentials.password();

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        Configuration.startMaximized = true;
        //Configuration.remote = format("https://%s:%s@%s",login,password,System.getProperty("testUrl"));
        Configuration.remote = "http://65.108.161.82:4444/wd/hub";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);

        Configuration.browserCapabilities = capabilities;
    }

    @AfterEach
    public void tearDown() {
        Attaches.screenshotAs("Last screenshot");
        Attaches.pageSource();
        Attaches.browserConsoleLogs();
        Attaches.addVideo();
    }

}
