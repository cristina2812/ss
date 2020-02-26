package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import test.GoogleTest;
import test.HeaderTest;
import test.RegisterTest;
import test.SearchByKeywordTest;

@RunWith(Suite.class)
@SuiteClasses({
	//GoogleTest.class,
	//RegisterTest.class,
		HeaderTest.class,
})
public class TestSuite {
	
}
