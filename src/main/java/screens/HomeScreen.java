package screens;

import java.util.List;

import org.openqa.selenium.interactions.Actions;

import base.Base;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomeScreen extends Base{

	@AndroidFindBy(accessibility ="Change the current view")
	MobileElement optionMenuBtn ;

	@AndroidFindBy(id="com.todoist:id/fab")
	MobileElement addTaskBtn ;

	@AndroidFindBy(id= 	 "android:id/message")
	MobileElement taskNameField;

	@AndroidFindBy(className = "android.widget.CheckBox")
	List<MobileElement> completedCheckBoxBtn;

	Actions action ;


	public void completeTaskWithIndex(int index) {

		completedCheckBoxBtn.get(index).click();
	}

	// to do implementation
	
	public void deleteTaskWithName(String name) {

	}

	public void addNewTask(String taskName) {
		addTaskBtn.click();
		taskNameField.sendKeys(taskName);
		/****
		 * 
		 * needs to be adjusted to handle IOS as well
		 */
		((AndroidDriver<AndroidElement>) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.navigate().back();


	}

	public MobileElement  getTaskByName(String searchTaskName) {

		return driver.findElement(MobileBy.xpath("//*[@text='"+searchTaskName+"']"));
	}
	
	public void  clickTaskByName(String searchTaskName) {

		 driver.findElement(MobileBy.xpath("//*[@text='"+searchTaskName+"']")).click();
	}

	public void openOptionMenue() {
		optionMenuBtn.click();
	}


}
