package tests;

import org.testng.annotations.Test;

import base.Base;
import screens.Register_InsertEmailScreen;
import screens.HomeScreen;
import screens.Register_CredentialsScreen;
import screens.WelcomeScreen;

public class LoginTest extends Base{
	WelcomeScreen welcome ;
	Register_InsertEmailScreen insertEmail ;
	Register_CredentialsScreen enterCredentials ;
	String email = "test_user@null.null";
	String password = "NULL1234";
	HomeScreen home ;
	String taskName = "new task ";
	@Test
	public void login() {
		welcome = new WelcomeScreen();
		welcome.signUpWithEmail();
		insertEmail = new Register_InsertEmailScreen();
		insertEmail.TypeEmailAndPressContinue(email);
		enterCredentials = new Register_CredentialsScreen();
		enterCredentials.loginWithPassword(password);
		home = new HomeScreen();
		home.addNewTask(taskName);
	}
	
	
}
