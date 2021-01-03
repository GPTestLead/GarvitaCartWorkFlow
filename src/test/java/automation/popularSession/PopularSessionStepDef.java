				package automation.popularSession;
				
				import java.util.concurrent.TimeUnit;
				
				import org.openqa.selenium.By;
				import org.openqa.selenium.JavascriptExecutor;
				import org.openqa.selenium.WebDriver;
				import org.openqa.selenium.WebElement;
				import org.openqa.selenium.chrome.ChromeDriver;
				
				import cucumber.api.java.Before;
				import cucumber.api.java.en.Given;
				
				public class PopularSessionStepDef {
					static WebDriver driver;
					@Before
					public void setup() {
						System.setProperty("webdriver.chrome.driver", "C:\\Users\\Student\\Desktop\\chromedriver.exe");
						driver = new ChromeDriver();
					}
					@Given("^open site of AutomationPractice$")
					public void Step_One() 
					{
						driver.get("http://automationpractice.com/index.php");
						
					}
					@Given("^Find Faded short sleeve T-shirts and click on it$")
					public void Step_Two() throws InterruptedException 
					{
						Thread.sleep(1000);
						JavascriptExecutor jse = (JavascriptExecutor)driver;
						jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img")));
						Thread.sleep(2000);
						WebElement quick =driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]"));
						quick.click();
					}
				
				@Given("^Add to cart and click on continue shopping$")
				public void Step_Three() throws InterruptedException 
				{
					Thread.sleep(2000);
					WebElement continueshopping = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span"));
					continueshopping.click();
				}
				@Given("^Find Printed Chiffon Dress and click on it$")
				public void Step_Four() throws InterruptedException 
				{
					Thread.sleep(1000);
					JavascriptExecutor jse = (JavascriptExecutor)driver;
					jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[7]/div/div[1]/div/a[1]/img")));
					Thread.sleep(2000);
					WebElement quick =driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[7]/div/div[2]/div[2]/a[1]/span"));
					quick.click();
				}
				@Given("^Proceed to checkout and click on cart$")
				public void Step_Five() throws InterruptedException 
				{
					Thread.sleep(1000);
					
					WebElement quick =driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
					quick.click();
					Thread.sleep(1000);
					WebElement quick1 =driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"));
					quick1.click();
					
					//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.manage().window().maximize();
					
					
				}
				}
				
