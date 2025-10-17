package Practice1;

import org.testng.annotations.Test;

public class GitDemoTest {
	
	@Test(groups="smoke")
	public void AppleTest()
	{
		System.out.println("Apple");
		System.out.println("Grapes");
		System.out.println("Guava");
	}

}
