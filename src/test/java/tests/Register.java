package tests;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import base.Base;
import screens.Register_InsertEmailScreen;
import screens.Register_CredentialsScreen;
import screens.Register_OkTerms;
import screens.Register_pickTheme;
import screens.WelcomeScreen;

public class Register extends Base{
	WelcomeScreen welcome ;
	Register_InsertEmailScreen insertEmail ;
	Register_CredentialsScreen nameAndPassword ;
	Register_OkTerms okTerms;
	Register_pickTheme pickTheme ;
	Faker fake = new Faker();
	String email = fake.internet().emailAddress();
	String name = fake.name().firstName();
	String password = fake.internet().password(8, 10);
	
	@Test
	public void registerNewUser() {
		welcome = new WelcomeScreen();
		welcome.signUpWithEmail();
		insertEmail = new Register_InsertEmailScreen();
		insertEmail.TypeEmailAndPressContinue(email);
		nameAndPassword = new Register_CredentialsScreen();
		nameAndPassword.submitNameAndPassword(name, password);
		okTerms = new Register_OkTerms();
		okTerms.acceptTerms();
		pickTheme = new Register_pickTheme();
		pickTheme.pickTheme(1);
		pickTheme.goHome();
		
	}

}
