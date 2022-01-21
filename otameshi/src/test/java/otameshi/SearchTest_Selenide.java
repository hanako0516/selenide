package otameshi;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.Dimension;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
public class SearchTest_Selenide {
  private Map<String, Object> vars;
  @BeforeEach
  public void setUp() {
    Configuration.browser = "chrome";
    vars = new HashMap<>();
  }
  @AfterEach
  public void tearDown() {
  }
  @Test
  public void search() {
    open("https://www.jma.go.jp/jma/index.html");
    $(byXpath("//img[@alt=\'防災情報\']")).click();
    $("form:nth-child(2) > input").click();
    $("form:nth-child(2) > input").val("東京");
    $(byLinkText("東京都")).click();
    $(".breadcrumb-offices").shouldHave(text("東京都の防災情報"));
    WebDriverRunner.getWebDriver().manage().window().setSize(new Dimension(955, 737));
  }
}
