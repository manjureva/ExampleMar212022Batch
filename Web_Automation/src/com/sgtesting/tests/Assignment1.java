package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		minimizeFlyout();
		createUser();
		deleteuser();
		logout();
		closeApplication();

	}
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
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("admin");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyout()
	{
		try 
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("manju");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("lastName")).sendKeys("das");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("email")).sendKeys("manju@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("username")).sendKeys("manju");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("123");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void deleteuser()
	{
		try 
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			Alert oAlert = oBrowser.switchTo().alert();
			oAlert.accept();
			Thread.sleep(1000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
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
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	

}
