package testPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import basePackage.BaseClass;
import pomPackage.DEPOM;

public class DesignEfficiently extends BaseClass{
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass()
	{
	driver=openChromeBrowser(); 
	}
	@Test(priority=1)
	public void test0() throws InterruptedException
	{
		DEPOM pom=new DEPOM(driver);
		pom.logIn();
		Thread.sleep(5000);
	}
	@Test(priority=2)
	public void test1() throws InterruptedException
	{
		DEPOM pom=new DEPOM(driver);
		pom.createNewProject();
		Thread.sleep(5000);
	}
	@Test(priority=3)
	public void test2() throws InterruptedException, IOException
	{
		DEPOM pom=new DEPOM(driver);
		pom.uploadAConstructionDoc();
		Thread.sleep(5000);
	}
	@Test(priority=4)
	public void test3a() throws InterruptedException
	{
		DEPOM pom=new DEPOM(driver);
		pom.addFinishArea();
		Thread.sleep(5000);
	}
	@Test(priority=5)
	public void test3b() throws InterruptedException
	{
		DEPOM pom=new DEPOM(driver);
		pom.openCatalogWindow();
		Thread.sleep(5000);
	}
	@Test(priority=6)
	public void test3c() throws InterruptedException
	{
		DEPOM pom=new DEPOM(driver);
		pom.projectFinish();
		Thread.sleep(5000);
	}

}
