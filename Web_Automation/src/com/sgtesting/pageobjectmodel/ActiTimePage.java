package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {

	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	//login username Text Feild
	private WebElement username;
	public WebElement getUsername()
	{
		return username;
	}
	
	//Password Text Feild
	private WebElement pwd;
	public WebElement getpwd()
	{
		return pwd;
	}
	
	//login button click
	@FindBy(xpath="//*[@id=\"loginButton\"]/div")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}
	
	//Flyout window click
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getgettingStartedShortcutsPanelId()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	//while creating user click on emoji
	@FindBy(xpath = "//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")
	private WebElement clickonemoji;
	public WebElement getclickonemoji()
	{
		return clickonemoji;
	}
	
	//click on add user
	@FindBy(xpath = "//*[@id=\'createUserDiv\']/div/div[2]")
	private WebElement adduser;
	public WebElement getadduser()
	{
		return adduser;
	}
	
	//Firstname
	private WebElement firstName;
	public WebElement firstName()
	{
		return firstName;
	}
	
	//LastName
	private WebElement lastName;
	public WebElement lastName()
	{
		return lastName;
	}
	//Email
	private WebElement email;
	public WebElement email()
	{
		return email;
	}
	
	//username
	private WebElement userDataLightBox_usernameField;
	public WebElement username()
	{
		return userDataLightBox_usernameField;
	}
	
	//password
	private WebElement password;
	public  WebElement password()
	{
		return password;
		
	}
	//Retype password
	private WebElement passwordCopy;
	public WebElement passwordCopy()
	{
		return passwordCopy;
	}
	
	//click on add user
	@FindBy(xpath = "//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement adduser1;
	public WebElement adduser()
	{
		return adduser1;
	}
	
	//Delete user click on already existing user
	@FindBy(xpath = "//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement clickonuser;
	public WebElement clickonuser()
	{
		return clickonuser;
	}
	//Modify user
	@FindBy(xpath = "//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement saveChanges;
	public WebElement saveChanges()
	{
		return saveChanges;
	}
	//click on delete user
	private WebElement userDataLightBox_deleteBtn;
	public WebElement deleteuser()
	{
		return userDataLightBox_deleteBtn;
	}
	//click on logout button
	@FindBy(linkText = "Logout")
	private WebElement oLogout;
	public WebElement Logout()
	{
		return oLogout;
	}
	
	//while creating create customer click on task
	@FindBy(xpath = "//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a/div[2]")
	private WebElement task;
	public WebElement task()
	{
		return task;
	}
	
	//click on add new click
	@FindBy(xpath = "//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")
	private WebElement addnew;
	public WebElement addnew()
	{
		return addnew;
	}
	
	//click on add new customer
	@FindBy(xpath = "/html/body/div[14]/div[1]")
	private WebElement newcustomer;
	public WebElement newcustomer()
	{
		return newcustomer;
	}
	
	//for writing name
	private WebElement customerLightBox_nameField;
	public WebElement customer()
	{
		return customerLightBox_nameField;
	}
	
	//to save the customer
	@FindBy(xpath = "//*[@id=\'customerLightBox_commitBtn\']/div/span")
	private WebElement savecustomer;
	public WebElement savecustomer()
	{
		return savecustomer;
	}
	
	//to delete the customer 1st click on name
	@FindBy(xpath = "//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement delete;
	public WebElement delete()
	{
		return delete;
	}
	
	//to delete click on action
	@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")
	private WebElement action;
	public WebElement action()
	{
		return action;
	}
	
	//to delete customer click on delete
	@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")
	private WebElement todelete;
	public WebElement todelete()
	{
		return todelete;
	}
	
	//delete permenently
	private WebElement customerPanel_deleteConfirm_submitTitle;
	public WebElement deletepermenantly() 
	{
		return customerPanel_deleteConfirm_submitTitle;
	}
	
	//modify custumer name
	@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[1]")
	private WebElement custumerName;
	public WebElement custumerName()
	{
		return custumerName;
	}
	
	//modify
	@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
	private WebElement editName;
	public WebElement geteditName()
	{
		return editName;
	}
	 
	//minimize modify window
	@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[2]/div[1]/div[1]")
	private WebElement minimize;
	public WebElement minimize()
	{
		return minimize;
	}
	
	//new project click
	@FindBy(xpath = "/html/body/div[14]/div[2]")
	private WebElement clickonaddnew;
	public WebElement clickonaddnew()
	{
		return clickonaddnew;
	}

	
	//enter project name
	private WebElement projectPopup_projectNameField;
	public WebElement projectname()
	{
		return projectPopup_projectNameField;
	}
	
	//save project
	@FindBy(xpath = "//*[@id=\'projectPopup_commitBtn\']/div/span")
	private WebElement saveproject;
	public WebElement saveproject() 
	{
		return saveproject;
	}
	
	//Delete project starts
	@FindBy(xpath = "//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement todeleteclick;
	public WebElement deleteclick()
	{
		return todeleteclick;
	}
	
	//action button while delete
	@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement deleteaction;
	public WebElement deleteaction()
	{
		return deleteaction;
	}
	
	//delete button
	@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
	private WebElement deletebutton;
	public WebElement deletebutton()
	{
		return deletebutton;
	}
	
	//delete permanently
	private WebElement projectPanel_deleteConfirm_submitTitle;
	public WebElement deleteprojectpermenantly()
	{
		return projectPanel_deleteConfirm_submitTitle;
	}
	
	//modify project
	@FindBy(xpath = "//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement modifyproject;
	public WebElement modifyproject()
	{
		return modifyproject;
	}
	
	//modify project 2
	@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
	private WebElement writetext;
	public WebElement writetext()
	{
		return writetext;
	}
	
	//close modify
	@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[4]/div[1]/div[1]")
	private WebElement closemodify;
	public WebElement closemodify()
	{
		return closemodify;
	}
	
	//create task
	@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")
	private WebElement task1;
	public WebElement task1()
	{
		return task1;
	}
	
	//click on create new task
	@FindBy(xpath = "/html/body/div[13]/div[1]")
	private WebElement task2;
	public WebElement task2()
	{
		return task2;
	}
	
	//name of the task
	@FindBy(xpath = "//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
	private WebElement task3;
	public WebElement task3()
	{
		return task3;
	}
	
	//save task
	@FindBy(xpath = "//*[@id=\'createTasksPopup_commitBtn\']/div")
	private WebElement savetask;
	public WebElement savetask()
	{
		return savetask;
	}
	
	//delete task
	@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")
	private WebElement deletetask;
	public WebElement deletetask()
	{
		return deletetask;
	}
	@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement deletetask1;
	public WebElement deletetask1()
	{
		return deletetask1;
	}
	
	//delete 
	@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[3]/div[4]/div/div[3]/div")
	private WebElement deletetask2;
	public WebElement deletetask2()
	{
		return deletetask2;
	}
	
	//delete permanantly
	private WebElement taskPanel_deleteConfirm_submitTitle;
	public WebElement deletetaskpermanantly()
	{
		return taskPanel_deleteConfirm_submitTitle;
	}
}
