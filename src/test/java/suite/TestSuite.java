package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import test.*;

@RunWith(Suite.class)
@SuiteClasses({
	//GoogleTest.class,
	//RegisterTest.class,
		HeaderTest.class,
		CartTest.class,
		CheckoutTest.class,
		FooterTest.class,
		HomepageTest.class,
		LoginTest.class,
//		OrderTest.class,
		ProductTest.class,
		RegisterTest.class,
		SearchByKeywordTest.class,
		WishlistTest.class,
})
public class TestSuite {
	
}
