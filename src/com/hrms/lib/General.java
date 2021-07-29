package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class General extends Global{
	public void OpenApplication() {
		System.setProperty("webdriver.gecko.driver", "D:\\driver2\\firefox driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(url);
		System.out.println("Application opened");
		Reporter.log("Application opened");
		Log.info("Application opened");
		}
	public void Login() {
		driver.findElement(By.name(txt_login)).sendKeys(UserName);
		driver.findElement(By.name(txt_Password)).sendKeys(Password);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login Completed");
		Reporter.log("Login Completed");
		Log.info("Login Completed");
	}
	public void Logout() {
		driver.findElement(By.linkText(link_Logout)).click();
		System.out.println("Logout completed");
		Reporter.log("Logout completed");
		Log.info("Logout completed");
	}
	public void Add_Emp() throws Exception {
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath(xpath_add)).click();
		Thread.sleep(3000);
		driver.findElement(By.name(txt_firstname)).sendKeys(firstname);
		driver.findElement(By.name(txt_lastname)).sendKeys(lastname);
		WebElement fileInput = driver.findElement(By.name(photo));
		fileInput.sendKeys("D:\\Doc\\papu.jpg");
		Thread.sleep(3000);
		driver.findElement(By.id(id_save)).click();
		System.out.println("New emp added");
		Reporter.log("New emp added");
		Log.info("New emp added");
		driver.switchTo().defaultContent();
		}
	public void Delete_Emp() {
		driver.switchTo().frame("rightMenu");
		Select st = new Select(driver.findElement(By.name(txt_SearchBY)));
		st.selectByVisibleText("Emp. First Name");
		driver.findElement(By.name(txt_Searchfor)).sendKeys(searchfor);
		driver.findElement(By.xpath(xpath_searchbtn)).click();
		driver.findElement(By.name(checkbox)).click();
		driver.findElement(By.xpath(delete)).click();
		System.out.println("Emp deleted");
		Reporter.log("Emp deleted");
		Log.info("Emp deleted");
		driver.switchTo().defaultContent();
		
		
	}
	public void CloseAppication() {
		driver.close();
		System.out.println("application closed");
		Reporter.log("Application closed");
		Log.info("Application closed");
		
	}
	}
