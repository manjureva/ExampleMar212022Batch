package com.sgtesting.tests;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImportTask {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		minimizeFlyout();
		ImportTasks();
	
	


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
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void ImportTasks()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]/div/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("/html/body/div[13]/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("dropzoneClickableArea")).click();
			Thread.sleep(1000);
			String filename="E:\\SeleniumAutomation\\ImportTask\\Sample.csv";
			copyFile(filename);
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_V);
			Thread.sleep(1000);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(1000);
			robot.keyRelease(KeyEvent.VK_V);
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'loadTasksFromCSVPopup_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void copyFile(String filename) 
	{
		StringSelection strselection=new StringSelection(filename);
		//	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection, null);
			Toolkit toolkit=Toolkit.getDefaultToolkit();
			Clipboard clipboard=toolkit.getSystemClipboard();
			clipboard.setContents(strselection, null);
		
		
	}


}
