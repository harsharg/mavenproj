package runner;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Great {
	
	@Before(order=1)
	public void beforeScenario()
	{
		System.out.println("Run before every scenario1");
	}
	
	@Before(order=0)
	public void beforeScenarioStart()
	{
		System.out.println("Run before every scenario2");
	}
	
	@After(order=1)
	public void aftersceanrio()
	{
		System.out.println("Run after every scenario1");
	}
	

}
