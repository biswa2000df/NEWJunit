import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dell.com/support/home/en-in");
		WebElement e=driver.findElement(By.id("inpEntrySelection"));
		Actions ac = new Actions(driver);
		
		ac.keyDown(Keys.CONTROL).build().perform();
		//ac.keyDown(Keys.SHIFT).build().perform();
		ac.sendKeys("v").build().perform();
		//System.out.println("s");
		//ac.keyUp(Keys.SHIFT).build().perform();
		//ac.keyUp(Keys.CONTROL).build().perform();
		
	/*	String parent2 = driver.getWindowHandle();
		System.out.println("Parent2 :"+parent2);
		System.out.println("88");
		
		
		driver.findElement(By.id("newWindowsBtn")).click();
		System.out.println("99");
		
		Set<String> child3 = driver.getWindowHandles();
		for(String c3 : child3)
		{
			System.out.println(c3);
			
			System.out.println("XOXOXOXOXOXOXOXOXOXOXOXOXOXOXOXOXOXOXO");
			
			
		if(!c3.equalsIgnoreCase(parent2))
			{
			driver.switchTo().window(c3);
			JavascriptExecutor jk = (JavascriptExecutor)driver;
			jk.executeScript("window.scrollBy(0,500)","");
		
			System.out.println("100");
			
			Thread.sleep(5000);
				driver.findElement(By.xpath("/html/body/div[2]/div[6]/div[1]/div[2]/div[1]/div[1]/div/div[1]/article/div/div/form/div[1]/input[1]")).sendKeys("Kanha");
				
				
				System.out.println("102");		
				driver.close();
				System.out.println("103");	
				
				driver.switchTo().window(parent2);
				String parent3 = driver.getWindowHandle();
				System.out.println("parent3    :"+parent3);
				System.out.println("104");
				
				Set<String> g = driver.getWindowHandles();
				for(String l : g)
				{
					System.out.println(l);
					
					if(!l.equals(parent3))
					{
						driver.switchTo().window(l);
						JavascriptExecutor jm= (JavascriptExecutor)driver;
						jm.executeScript("window.scrollBy(0,500)","");
						
						driver.findElement(By.name("fName")).sendKeys("Done....");
						Thread.sleep(5000);
						driver.close();
			
						driver.switchTo().window(parent3);
						JavascriptExecutor ji = (JavascriptExecutor)driver;
						ji.executeScript("window.scrollBy(0,700)","");
						
						System.out.println("Done...............");
					}
				}
				
				
				
				break;
				
					
			}
		
		}*/

	}

}
