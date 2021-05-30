package screens;

import base.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class OptionMenu extends Base{

	
	@AndroidFindBy(id = "com.todoist:id/profile_view_name")
	MobileElement userName;
	
	
	public String checkUserName() {
		return userName.getAttribute("text");
	}

}
