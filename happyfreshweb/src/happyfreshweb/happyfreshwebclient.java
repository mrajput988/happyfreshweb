package happyfreshweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class happyfreshwebclient
{
	public ChromeDriver driver;
	  public JavascriptExecutor js;
	 public	WebDriverWait ws;
		
		@BeforeTest
		public void launchbrowser()
		{
			
			System.setProperty("webdriver.chrome.driver","D:\\newchrome\\chromedriver.exe");
			
		    driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.get("https://stage-m.happyfresh.id/");
			
			driver.manage().window().maximize();
		}

		@Test(priority=0)
		public void test1() throws InterruptedException
		{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
		driver.findElement(By.className("_1FWce")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='banner_landing_modal']/div/button")).click();
		
		js = (JavascriptExecutor)driver;
		
//		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,2000)");
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-2000)");
			
		}
		@Test(priority=1)
		 public void search() throws InterruptedException
		 {
			
		WebElement se =	driver.findElement(By.xpath("//*[@id='header-search-bar']"));
		    ws = new WebDriverWait(driver,10);
			ws.until(ExpectedConditions.elementToBeClickable(se));
		se.click();
		
	/*	try
		{
			 se =	driver.findElement(By.xpath("//*[@id='header-search-bar']"));
			Thread.sleep(6000);
			 ws = new WebDriverWait(driver,10);
			ws.until(ExpectedConditions.elementToBeClickable(se));
			se.click();
			
		}
		catch (StaleElementReferenceException e) 
		{
			se =	driver.findElement(By.xpath("//*[@id='header-search-bar']"));
			Thread.sleep(6000);
			 ws = new WebDriverWait(driver,10);
			ws.until(ExpectedConditions.elementToBeClickable(se));
			se.click();
		} */
			
		Thread.sleep(3000);
	   WebElement bt= driver.findElement(By.id("search-bar-input"));
	   bt.sendKeys("carrot");
	   Thread.sleep(3000);
	   bt.sendKeys(Keys.ENTER);
	    Actions ac = new Actions(driver);
	    
	    
		
		 }
		@Test(priority=2)
		public void select() throws InterruptedException
		{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//*[@id='app']/div[2]/div[4]/div[1]/a[1]")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.id("button-plus-261903")).click();
			
			
		}
		@Test(priority=3)
		public void categories() throws InterruptedException
		{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='banner_atc']/div/button")).click();
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//*[@id='app']/div[3]/div[2]/div[2]/div/div/a[1]/div/img")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("button-add-42243")).click();
			
			Thread.sleep(3000);
			driver.navigate().back();
		}
		@Test(priority=4)
		public void bestdeals() throws InterruptedException
		{
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			js.executeScript("window.scrollBy(0,1000)");
			
			Thread.sleep(3000);
			driver.findElement(By.id("button-add-117641")).click();
			
		}
		@Test(priority=5)
		public void signup() throws InterruptedException
		{
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			Thread.sleep(3000);
			driver.findElement(By.id("icon-cart")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("button-checkout")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("registration_link_id")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("firstName")).sendKeys("Manoj");
			Thread.sleep(2000);
			driver.findElement(By.id("lastName")).sendKeys("Singh");
			Thread.sleep(4000);
			WebElement drop = driver.findElement(By.xpath("//*[@id='kc-register-form']/div[2]/div[2]/div/label/button"));
			
			ws.until(ExpectedConditions.elementToBeClickable(drop));
			drop.click();
			Thread.sleep(3000);
			
			//Select select = new Select(drop);
			
			//select.selectByValue("+91");
			
			//WebElement find = driver.findElement(By.id("IN"));
			
			WebElement element = driver.findElement(By.id("IN"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(500);
			
			element.click();
			Thread.sleep(2000);
			driver.findElement(By.id("phoneNumberShort")).sendKeys("8802823334");
			Thread.sleep(2000);
			driver.findElement(By.id("email")).sendKeys("demo23@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.id("password")).sendKeys("Rajput@321");
			Thread.sleep(2000);
			driver.findElement(By.id("password-confirm")).sendKeys("Rajput@321");
			Thread.sleep(3000);
			driver.findElement(By.id("submitButton")).click();
		}
			
			@Test(priority=6)
			public void order() throws InterruptedException
			{
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id='app']/div[2]/div/div[1]/div[2]/div/div[1]/a")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("input-delivery-address")).sendKeys("Greater Jakarta");
				Thread.sleep(5000);
				driver.findElement(By.id("prediction-address-1")).click();
				Thread.sleep(2000);
				js.executeScript("window.scrollBy(0,1000)");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id='app']/div[2]/div/div[1]/div[2]/div/div[2]/div/input")).sendKeys("Test");
				Thread.sleep(4000);
				driver.findElement(By.xpath("//*[@id='app']/div[2]/div/div[1]/div[3]/div[2]/div/div[2]")).click();
				
				Thread.sleep(10000);
		/*	WebElement radio=	driver.findElement(By.xpath("//*[@id='app']/div[2]/div/div/div[2]/div[3]/div[3]/label"));
			Thread.sleep(5000);
		     WebElement radio =	ws.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='app']/div[2]/div/div/div[2]/div[3]/div[3]")));
			Thread.sleep(5000);
			
		    js.executeScript("arguments[0].scrollIntoView(true);", radio);	
			Thread.sleep(4000);
		   radio.click();
			
			
			if(radio.isSelected())
			{
			System.out.println("Selected");
			}
			else
			{
				System.out.println("Not selected");
			}   */
			
				Actions action = new Actions(driver);
				action.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
				
				
				Thread.sleep(5000);
			   WebElement ts =	driver.findElement(By.xpath("//*[@id='app']/div[2]/div/div/div[3]/button"));
			   ts.click();
			   Thread.sleep(7000);
			   driver.findElement(By.id("button-submit")).click();
			   Thread.sleep(5000);
				driver.findElement(By.id("payment-method--cod")).click();

				Thread.sleep(4000);
				js.executeScript("window.scrollBy(0,1000)");
				Thread.sleep(4000);
				driver.findElement(By.id("button-submit")).click();
				Thread.sleep(4000);
				driver.findElement(By.id("replacement--submit")).click();
			   
			}
			
			
		}


