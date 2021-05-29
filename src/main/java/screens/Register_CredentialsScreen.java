package screens;

import base.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Register_CredentialsScreen extends Base{

	@AndroidFindBy(id = "com.todoist:id/sign_up_name")
	MobileElement userName ;

	@AndroidFindBy(id="com.todoist:id/sign_up_password")
	MobileElement passwordField ;

	@AndroidFindBy(id= "com.todoist:id/btn_sign_up")
	MobileElement signUpBtn ;

	@AndroidFindBy(id= "com.todoist:id/log_in_password")
	MobileElement loginPassword ;

	@AndroidFindBy(id= "com.todoist:id/btn_log_in")
	MobileElement loginBtn ;
	public void submitNameAndPassword(String name,String password) {
		userName.sendKeys(name);
		passwordField.sendKeys(password);
		signUpBtn.click();
	}

	public void loginWithPassword(String password) {
		loginPassword.sendKeys(password);
		loginBtn.click();
	}



}
