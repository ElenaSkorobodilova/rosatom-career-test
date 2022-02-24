package rosatom.autotests.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class MainPage {
    // locators & elements
    private SelenideElement
    headerSubs = $("div.css-9bz79c"),
    mainText = $("p.chakra-text.css-853lye"),
    searchInputField = $("input.chakra-input.css-nwb3dv"),
    findButton = $("button.chakra-button.css-3diha"),
    topElement = $("div.css-0"),
    searchElementsArea = $("div.chakra-input__group.css-4302v8"),
    searchResultField = $("input.chakra-input.css-1nbfqhc");


    // actions
    public MainPage openPage(String urlForTests) {
        open(urlForTests);
        return this;
    }

    public void openAndInputSearchText(String searchVacancy) {
        getTopElement().scrollIntoView(true);
        getSearchElementsArea().click();
        getSearchInputField().click();
        getSearchInputField().sendKeys(searchVacancy);
        getFindButton().click();
    }

    public SelenideElement selectElementByName(String elemName) {
        return $(elemName);
    }

    public SelenideElement selectElementByLinkText(String linkText) {
        return $(linkText(linkText));
    }

    public SelenideElement selectElementByText(String text) {
        return $(byText(text));
    }

    public SelenideElement getHeaderSubs() {
        return headerSubs;
    }

    public SelenideElement getMainText() {
        return mainText;
    }

    public SelenideElement getSearchInputField() {
        return searchInputField;
    }

    public SelenideElement getSearchElementsArea() {
        return searchElementsArea;
    }

    public SelenideElement getFindButton() {
        return findButton;
    }

    public SelenideElement getTopElement() {
        return topElement;
    }

    public SelenideElement getSearchResultField() {
        return searchResultField;
    }
}
