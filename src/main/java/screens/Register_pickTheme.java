package screens;

import java.util.List;

import base.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Register_pickTheme extends Base{
	
	
	
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Theme preview\"])")
	List<MobileElement> themes ;
	
	@AndroidFindBy(id ="com.todoist:id/theme_picker_looks_good")
	MobileElement goToHomeBtn ;
	
	public void pickTheme(int theme) {
		/*
		 * 0 selects red theme
		 * 1 selects black theme
		 * 2 selects white theme
		 * 2 selects tangerine theme
		 * */
		themes.get(theme).click();
		System.out.println(themes.size());
	}
	
	public void goHome() {
		goToHomeBtn.click();
	}

}
