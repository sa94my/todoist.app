package screens;

import base.Base;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TaskOptions extends Base{

	@AndroidFindBy(accessibility = "Overflow menu")
	MobileElement moreOptionsBtn ;
	
	@AndroidFindBy(accessibility = "Complete")
	MobileElement completeTaskBtn  ;
	
	@AndroidFindBy(id = "com.todoist:id/item_due")
	MobileElement taskDueDay;
	
	
	
	public void viewMoreOptions() {
		moreOptionsBtn.click();
	}
	
	public void completeTask() {
		completeTaskBtn.click();
	}
	
	public void doItTomorrow() {
		taskDueDay.click();
		driver.findElement(MobileBy.xpath("//*[@text='Tomorrow']")).click();
		driver.navigate().back();
	}
	
}
