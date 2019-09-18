package TestNg.demo.wpeverest.com;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class NewTest {
	
  WebDriver wd;	
 
  @Test(dataProvider = "data-provider", dataProviderClass=DataProvider.class)
  public void Registration(String UserName , String Password) {

  wd.findElement(By.id("j_username")).sendKeys(UserName);
  wd.findElement(By.id("j_password")).sendKeys(Password);
  wd.findElement(By.xpath("//*[@type='submit']")).click();
  System.out.println("This is" +wd.getTitle()); 
  wd.findElement(By.className("hidden-xs")).click();
  wd.findElement(By.linkText("ustat?action=logoff")).click();  
  }
  
  
  @BeforeClass
  public void OpenBrowser() {
	  
	    String currentdirectory = System.getProperty("user.dir");	
		String driverspath = currentdirectory + "\\src\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", "driverspath");
	    wd = new ChromeDriver(); 
	  
  }
  
  @BeforeMethod
  public void OpenUrl(){
	  
	    wd.get("https://shibboleth-idp.collegenet.com/idp/profile/SAML2/Redirect/SSO?SAMLRequest=fZJBb8IgFMe%2FSsNdsdpZS2wTp4eZuGms22GXhdKnklDoeHSd337V6tSLNwKP3%2F%2B9H4yRF6pkk8rt9Rq%2BK0Dn%2FRZKIzsdxKSymhmOEpnmBSBzgqWT1wXrd3ustMYZYRTxJohgnTR6ajRWBdgU7I8U8L5exGTvXImM0rquu7ws1aGGrCtMQXEvs8wocHua%2Fi%2B7iIYeI%2Fp0tUw3xJs1PUnNj%2FQr63q1I%2FOyoSkFO9DgTuBmizbNbaWCM2oNubQgHE3TJfHms5h8jYT%2FtA1EFATZALb5cAhhmEUhjPIsz8I8aMoQK5hrdFy7mPR7ftTpRR0%2F3PgjFozYoP9JvNXZwbPUudS7x8KytgjZy2az6rTjfYDF02hNAUnGR%2B3sFGxvHuIxll%2Fsk%2BTi58bznRkuhKm0o2N6E9SmluytIc9nK6OkOHgTpUw9tcAdxMQnNGmv3P%2BV5A8%3D&RelayState=cookie%3A1568746112_bd82");
  }

  @AfterTest
  public void afterMethod() {
	  
	  wd.close();
  }

}
