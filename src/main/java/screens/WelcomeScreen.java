package screens;

import base.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class WelcomeScreen extends Base{
	
                   
	@AndroidFindBy(id  = "com.todoist:id/btn_welcome_email")
	MobileElement signUpWithEmailBtn ;
		
	public void signUpWithEmail() {
		signUpWithEmailBtn.click();
	}

}
