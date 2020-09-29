package selenium_test.test_ng_annotations;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import selenium_test.php_travels_project.helpers.TestListener;

import java.time.LocalTime;

@Listeners (TestListener.class) // ---> implementacja klasy Listener
public class TestDataProvider {

    @Test (dataProvider = "getData")
    public void aVoid(String username, String password) {
        System.out.println("Test logowania " + LocalTime.now() + " " + username + " " + password);
        Assert.assertEquals(1,2);
    }

    @DataProvider
    public Object [][] getData () {
        return new Object[][] {{"username1","password1"},{"username2","password2"}};
    }

}
