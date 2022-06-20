package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutDemo {

	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		flyout();
		CreateUser();
		DeleteUser();
		logout();
		closeApplication();
		

	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\Automation\\Web_Automation\\Library\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
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
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try 
		{
			oPage.getUsername().sendKeys("admin");
			oPage.getpwd().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(2000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void flyout()
	{
		try 
		{
			oPage.getgettingStartedShortcutsPanelId().click();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void CreateUser() 
	{
		try {
			oPage.getclickonemoji().click();
			oPage.getadduser().click();
			oPage.firstName().sendKeys("user");
			oPage.lastName().sendKeys("1");
			oPage.email().sendKeys("user1@gmail.com");
			oPage.username().sendKeys("user1");
			oPage.password().sendKeys("123");
			oPage.passwordCopy().sendKeys("123");
			oPage.adduser().click();
			Thread.sleep(2000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void DeleteUser()
	{
		try 
		{
			oPage.clickonuser().click();
			Thread.sleep(2000);
			oPage.deleteuser().click();
			Thread.sleep(2000);
			Alert oAlert = oBrowser.switchTo().alert();
			oAlert.accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try 
		{
			oPage.Logout().click();
			Thread.sleep(2000);
			
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
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}
