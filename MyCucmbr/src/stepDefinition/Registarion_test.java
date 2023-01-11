package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registarion_test 
{
	@Given("Enter facebook site url")
	public void enter_facebook_site_url()
	{
		System.out.println("Facebook login");
	}
	@When("user enter valid mobile number")
	public void user_enter_valid_mobile_number()
	{
		System.out.println("Valid Mobile Number Entered");
	}
	@When("wait for OTP")
	public void wait_for_otp()
	{
		System.out.println("TimeOut For OTP to Genarate");
	}
	@When("enter valid OTP")
	public void enter_valid_otp()
	{
		System.out.println("OTP is Ented");
	}
	@When("Click on Create Account button")
	public void click_on_create_account_button()
	{
		System.out.println("Create account button clicked");
	}
	@Then("verify Registration sucessfull message displayed")
	public void verify_registration_sucessfull_message_displayed()
	{
		System.out.println("Message Displayed");
	}
}
