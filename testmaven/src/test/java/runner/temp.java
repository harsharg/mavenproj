package runner;

import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class temp {
	

	@Given("^the data is validated$")
	public void the_data_is_validated() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new PendingException();
	}

	@Then("^data should populate in system$")
	public void data_should_populate_in_system() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new PendingException();
	}

	
@Given("^I want to write a step with precondition$")
public void i_want_to_write_a_step_with_precondition()  {
    // Write code here that turns the phrase above into concrete actions
  
}

@Given("^some other precondition$")
public void some_other_precondition()  {
    // Write code here that turns the phrase above into concrete actions

}

@When("^I complete action username and password$")
public void i_complete_action_username_and_password(DataTable arg1)
{
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
  //  throw new PendingException();
	
	System.out.println(arg1);
//	System.out.println(arg2);
//	for(Map<String,String> mp:arg3.asMaps(String.class, String.class))
//	 { 
//		
//		System.out.println(mp.get("username"));
//		System.out.println(mp.get("password"));
//		
//	 }
}

@When("^some other action$")
public void some_other_action()  {
    // Write code here that turns the phrase above into concrete actions
    
}

@When("^yet another action$")
public void yet_another_action()  {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("^I validate the outcomes$")
public void i_validate_the_outcomes() {
    // Write code here that turns the phrase above into concrete actions
  
}

@Then("^check more outcomes$")
public void check_more_outcomes()  {
    // Write code here that turns the phrase above into concrete actions
  
}


}
