package tests;

import org.testng.annotations.Test;

import base.Base;
import screens.HomeScreen;
import screens.Register_CredentialsScreen;
import screens.Register_InsertEmailScreen;
import screens.TaskOptions;
import screens.WelcomeScreen;

public class LoginAddMarkComplete extends Base{

	WelcomeScreen welcome ;
	Register_InsertEmailScreen insertEmail ;
	Register_CredentialsScreen enterCredentials ;
	String email = "procrastinator@tomorrow.com";
	String password = "PROC1234";
	HomeScreen home ;
	String taskName = "new task";
	String userName ="procrastinator";
	TaskOptions taskptions ;

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
	public void addThreeTasks() {

		home = new HomeScreen();
		home.addNewTask(taskName);
		home.clickTaskByName(taskName);
		taskptions = new TaskOptions();
		taskptions.completeTask();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
