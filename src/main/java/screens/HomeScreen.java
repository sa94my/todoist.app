package screens;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import base.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomeScreen extends Base{

	@AndroidFindBy(id="com.todoist:id/fab")
	MobileElement addTaskBtn ;
	
	@AndroidFindBy(id= 	 "android:id/message")
	MobileElement taskNameField;
	
	@AndroidFindBy(className = "android.widget.CheckBox")
	List<MobileElement> completedCheckBoxBtn;
	
	Actions action ;
	
	
	public void deleteTaskWithIndex(int index) {
		
		completedCheckBoxBtn.get(index).click();
	}

	public void addNewTask(String taskName) {
		addTaskBtn.click();
		taskNameField.sendKeys(taskName);
		/****
		 * 
		 * needs to be adjusted to handle IOS aswell
		*/
		((AndroidDriver<AndroidElement>) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		
	}


}
