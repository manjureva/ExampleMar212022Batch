package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment4 {

	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		flyout();
		CreateCustemer();
		modifycustomer();
		deletecustomer();
	
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
	private static void CreateCustemer()
	{
		try
		{
			oPage.task().click();
			Thread.sleep(2000);
			oPage.addnew().click();
			Thread.sleep(2000);
			oPage.newcustomer().click();
			Thread.sleep(2000);
			oPage.customer().sendKeys("Darshan");
			Thread.sleep(2000);
			oPage.savecustomer().click();
			Thread.sleep(2000);
		} catch (Exception e) 
		{
		e.printStackTrace();
		}
	}
	private static void deletecustomer()
	{
		try {
			oPage.delete().click();
			Thread.sleep(2000);
			oPage.action().click();
			Thread.sleep(2000);
			oPage.todelete().click();
			Thread.sleep(2000);
			oPage.deletepermenantly().click();
			Thread.sleep(2000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void modifycustomer() 
	{
		try
		{
			oPage.delete().click();
			Thread.sleep(2000);
			//oPage.custumerName().click();
			Thread.sleep(2000);
			//oPage.custumerName().clear();
			//hread.sleep(2000);
			//oPage.custumerName().sendKeys("manoj");
			Thread.sleep(2000);
			oPage.geteditName().sendKeys("manju ");
			Thread.sleep(2000);
			oPage.minimize().click();
			Thread.sleep(2000);
			
		} catch (Exception e) 
		{
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




