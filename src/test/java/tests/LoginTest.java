package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import base.Base;
import screens.Register_InsertEmailScreen;
import screens.HomeScreen;
import screens.OptionMenu;
import screens.Register_CredentialsScreen;
import screens.WelcomeScreen;

public class LoginTest extends Base{
	WelcomeScreen welcome ;
	Register_InsertEmailScreen insertEmail ;
	Register_CredentialsScreen enterCredentials ;
	String email = "procrastinator@tomorrow.com";
	String password = "PROC1234";
	HomeScreen home ;
	String taskName = "new task ";
	OptionMenu option;
	String userName ="procrastinator";
	@Test
	public void login() {
		welcome = new WelcomeScreen();
		welcome.signUpWithEmail();
		insertEmail = new Register_InsertEmailScreen();
		insertEmail.TypeEmailAndPressContinue(email);
		enterCredentials = new Register_CredentialsScreen();
		enterCredentials.loginWithPassword(password);
		home = new HomeScreen();
		home.openOptionMenue();
		option = new OptionMenu();
		assertTrue(option.checkUserName().equalsIgnoreCase(userName));
		driver.navigate().back();
	}
	
	
}
