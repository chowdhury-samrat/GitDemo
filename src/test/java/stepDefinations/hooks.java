package stepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {
@Before("@MobileTest")
public void beforevalidation()
{
	System.out.println("Mobile Before hook");
}

@After("@MobileTest")
public void aftervalications()
{
	System.out.println("After Mobile hook");
}
@Before("@WebTest")
public void beforeWebvalidation()
{
	System.out.println("Before web hook");
}

@After("@WebTest")
public void afterwebvalications()
{
	System.out.println("After web hook");
}
}
