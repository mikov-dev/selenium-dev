package groups;

import org.config.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GroupsTest extends BaseTest {

    @BeforeClass
    void setup() {
        setUpWithChrome();
    }

    @Test(groups= {"regression"})
    public void testMethod3() {
        System.out.println("testMethod3");
    }

    @Test (groups= {"smoke"})
    public void testMethod4() {
        System.out.println("testMethod4");
    }

    @Test (groups= {"smoke", "regression"})
    public void testMethod5() {
        System.out.println("testMethod5");
    }

    @Test (groups= {"regression"})
    public void testMethod6() {
        System.out.println("testMethod6");
    }

    @Test (groups= {"smoke"})
    public void testMethod7() {
        System.out.println("testMethod7");
    }

    @Test(groups = {"regression, smoke"})
    public void testMethod8() {
        System.out.println("testMethod8");
    }

    @Test(groups = {"smoke"})
    public void testMethod9() {
        System.out.println("testMethod9");
    }

}
