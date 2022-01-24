package otameshi;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.Dimension;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
public class SearchTest_Selenide {
  private Map<String, Object> vars;


  //出力したときはBeforeEachだったけどSystem.setPropertyを追加してBeforeに変更しないとうまくdriverの設定が働かなかった
  @Before
  public void setUp() {

    Configuration.browser = WebDriverRunner.CHROME;
	System.setProperty("webdriver.chrome.driver", "C:\\pleiades\\webdriver\\Chrome\\97\\chromedriver.exe");
    //Configuration.browserBinary = "C:\\pleiades\\webdriver\\Chrome\\97\\chromedriver.exe";
    vars = new HashMap<>();
  }
  @AfterEach
  public void tearDown() {
  }
  @Test
  public void search() {
    open("https://www.hogehoge.go.jp/jma/index.html");
    $(byXpath("//img[@alt=\'防災情報\']")).click();
    $("form:nth-child(2) > input").click();
    $("form:nth-child(2) > input").val("東京");
    $(byLinkText("東京都")).click();
    $(".breadcrumb-offices").shouldHave(text("東京都の防災情報"));
    WebDriverRunner.getWebDriver().manage().window().setSize(new Dimension(955, 737));
  }
}
