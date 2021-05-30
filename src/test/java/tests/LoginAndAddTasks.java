package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import base.Base;
import screens.HomeScreen;
import screens.OptionMenu;
import screens.Register_CredentialsScreen;
import screens.Register_InsertEmailScreen;
import screens.WelcomeScreen;

public class LoginAndAddTasks extends Base {
	WelcomeScreen welcome ;
	Register_InsertEmailScreen insertEmail ;
	Register_CredentialsScreen enterCredentials ;
	String email = "procrastinator@tomorrow.com";
	String password = "PROC1234";
	HomeScreen home ;
	String taskName = "new task";
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
		
		

	}

	@Test(dependsOnMethods = {"login"})
	public void addTask() {

		home = new HomeScreen();
		home.addNewTask(taskName);
		assertTrue(home.getTaskByName(taskName) != null);
	}
}
