package com.sgtesting.tests;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advance1 {
	
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		loginasAdmin();
		minimizeFlyout();
		createUser();
		logout();
		loginasuser1();
		logout();
		loginasuser2();
		logout();
		loginasuser3();
		logout();
		loginasAdmin();
		modifyPasswords();
		logout();
		loginasUser1();
		logout();
		loginasUser2();
		logout();
		loginasUser3();
		logout();
		loginasAdmin();
		deleteUsers();
		logout();
		closeApplication();

	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\Automation\\Web_Automation\\Library\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginasAdmin()
	{
		try 
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
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
	private static void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys("User1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).sendKeys("demouser1@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome123");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();

			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo");
			oBrowser.findElement(By.name("lastName")).sendKeys("User2");
			oBrowser.findElement(By.name("email")).sendKeys("demouser2@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demoUser2");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome234");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome234");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();

			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo");
			oBrowser.findElement(By.name("lastName")).sendKeys("User3");
			oBrowser.findElement(By.name("email")).sendKeys("demouser3@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demoUser3");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome345");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome345");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginasuser1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome123");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginasuser2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome234");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginasuser3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser3");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome345");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyPasswords()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("demouser1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("demouser1");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2] ")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("demouser2");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("demouser2");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("demouser3");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("demouser3");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	
	private static void loginasUser1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("demouser1");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
	private static void loginasUser2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("demouser2");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginasUser3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser3");
			oBrowser.findElement(By.name("pwd")).sendKeys("demouser3");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteUsers()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert1=oBrowser.switchTo().alert();
			String content1=oAlert1.getText();
			System.out.println(content1);
			oAlert1.accept();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert2=oBrowser.switchTo().alert();
			String content2=oAlert2.getText();
			System.out.println(content2);
			oAlert2.accept();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert3=oBrowser.switchTo().alert();
			String content3=oAlert3.getText();
			System.out.println(content3);
			oAlert3.accept();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}





