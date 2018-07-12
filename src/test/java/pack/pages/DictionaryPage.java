package pack.pages;

import io.restassured.RestAssured;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

import static io.restassured.RestAssured.given;

@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary")
public class DictionaryPage extends PageObject {
	

    @FindBy(name="search")
    private WebElementFacade searchTerms;

    @FindBy(name="go")
    private WebElementFacade lookupButton;

    public void enter_keywords(String keyword) {
        searchTerms.type(keyword);
    }

    public void lookup_terms() {
        lookupButton.click();
    }

    public List<String> getDefinitions() {
        WebElementFacade definitionList = find(By.tagName("ol"));
        return definitionList.findElements(By.tagName("li")).stream()
                             .map( element -> element.getText() )
                             .collect(Collectors.toList());
    }

    public void launchBaseURL() {
        RestAssured.baseURI = "https://maps.googleapis.com";
    }

    public void enterParameters() {
        given().param("location","-33.8670522,151.1957362").
                param("radius","500").
                param("key","AIzaSyA9izRBfSoy3k6f6oQ8kepLNJR39D3HNJo").
        when().get("maps/api/place/nearbysearch/xml");
    }

    public boolean verifyStatusCode() {
        boolean status = false;

        return status;
    }
}