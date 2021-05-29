package screens;

import base.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Register_InsertEmailScreen extends Base{
	
	@AndroidFindBy(id ="com.todoist:id/email_exists_input")
	MobileElement emailField ;

	@AndroidFindBy(id ="com.todoist:id/btn_continue_with_email")
	MobileElement submitBtn ;
	
	public void TypeEmailAndPressContinue(String email) {
		emailField.sendKeys(email);
		submitBtn.click();
	}
}
