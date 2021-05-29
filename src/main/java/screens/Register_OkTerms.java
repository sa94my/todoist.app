package screens;

import base.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Register_OkTerms extends Base{

	@AndroidFindBy(id="com.todoist:id/terms_button")
	MobileElement acceptTermsBtn;
	
	public void acceptTerms() {
		acceptTermsBtn.click();
	}

}
