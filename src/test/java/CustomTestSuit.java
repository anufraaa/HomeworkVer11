import apiTests.PetStoreApiTests;
import apiTests.ReqresApiTests;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;
import uiTests.AuthorizationTests;
import uiTests.CompareTests;
import uiTests.GoogleTest;
import uiTests.TopicsTest;

@Suite
@SuiteDisplayName("Master Test Suite")
@SelectClasses({CompareTests.class, TopicsTest.class, AuthorizationTests.class, GoogleTest.class, PetStoreApiTests.class, ReqresApiTests.class

})

public class CustomTestSuit {
}
