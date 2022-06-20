package com.sgtesting.tests;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment6 {
	public static WebDriver oBrowser=null;
	@Test(priority=1)
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\SeleniumAutomation\\Automation\\Web_Automation\\Library\\Driver\\chromedriver.exe" );
			oBrowser=new ChromeDriver();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(4000);
		} catch (Exception e) 
		{
		
		}
	}
	@Test(priority=3,dataProvider ="logindetails")
	private static void login(String user,String password)
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys(user);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys(password);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	private static void minimizeFlyout()
	{
		try 
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority=5,dataProvider="customerDetails")
	private static void createCustomer(String name)
	{
		try 
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys(name);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6,dataProvider ="createProject")
	private static void CreateProject(String project)
	{
		try 
		{
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys(project);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'projectPopup_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7,dataProvider ="modifyProject")
	
	private static void ModifyProject(String  modifyproject)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")).sendKeys(modifyproject);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[1]")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	private static void DeleteProject()
	{
		try 
		{
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("projectPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(1000);
		} catch (Exception e) 
		{
		e.printStackTrace();
		}
	}
	@Test(priority=9)
	private static void DeleteCustomer()
	{
		try 
		{
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(2000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	@Test(priority=10)
	private static void logout()
	{
		try 
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	@Test(priority=11)
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
			System.out.println("basic scenario six completed successfully");
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	@DataProvider(name="logindetails")
	public Object[][] getdata()
	{
		return new Object[][] {{"admin","manager"}};
	}
	@DataProvider(name="customerDetails")
	public Object[][] getdata1()
	{
		return new Object[][] {{"darshan"}};
	}
	@DataProvider(name="createProject")
	public Object[][] getdata2()
	{
		return new Object[][] {{"java"}};
	}
	@DataProvider(name="modifyProject")
	public Object[][] getdata3()
	{
		return new Object[][] {{"java test cases"}};
	}
}




