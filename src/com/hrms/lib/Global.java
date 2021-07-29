package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
public WebDriver driver;
public String url = "http://183.82.125.5/nareshit/login.php";
public String UserName = "nareshit";
public String Password= "nareshit";
public String firstname= "Bishwajit";
public String lastname = "Sutar";
public String searchfor = "Bishwajit";



public String txt_login = "txtUserName";
public String txt_Password = "txtPassword";
public String btn_login = "Submit";
public String link_Logout = "Logout";
public String xpath_add = "//input[@type='button'][@value='Add']";
public String txt_firstname = "txtEmpFirstName";
public String txt_lastname = "txtEmpLastName";
public String photo = "photofile";
public String id_save= "btnEdit";
public String txt_SearchBY = "loc_code";
public String txt_Searchfor = "loc_name";
public String xpath_searchbtn = "//input[@type='button'][@value='Search']";
public String checkbox = "chkLocID[]";
public String delete = "//input[@type='button'][@value='Delete']";
}
