package tests;

import org.testng.annotations.Test;

import base.Base;
import screens.HomeScreen;
import screens.Register_CredentialsScreen;
import screens.Register_InsertEmailScreen;
import screens.TaskOptions;
import screens.WelcomeScreen;

public class ProcrastinatorScenario extends Base{

	WelcomeScreen welcome ;
	Register_InsertEmailScreen insertEmail ;
	Register_CredentialsScreen enterCredentials ;
	String email = "procrastinator@tomorrow.com";
	String password = "PROC1234";
	HomeScreen home ;
	String firstTaskName = "Tasks I hope I will do";
	String secondTaskName = "complete only some of them";
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
	public void addThenPostponeTasks() {

		home = new HomeScreen();
		home.addNewTask(firstTaskName);
		home.addNewTask(secondTaskName);
		home.clickTaskByName(firstTaskName);
		taskptions = new TaskOptions() ;
		taskptions.doItTomorrow();
		home.clickTaskByName(secondTaskName);
		taskptions.completeTask();
		

	}
}
