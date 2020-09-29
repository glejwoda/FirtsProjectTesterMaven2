package selenium_test.test_ng_annotations;

import org.testng.annotations.Test;

public class FirstTestPriority {

    @Test
    public void aVoid () {
        System.out.println("first test " + this.getClass().getName());
    }

    @Test (priority = 3)
    public void aVoid2 () {
        System.out.println("second  test " + this.getClass().getName());
    }

    @Test (priority = 2)
    public void aVoid3() {
        System.out.println("third test " + this.getClass().getName());
    }

    @Test (priority = 1)
    public void aVoid4 () {
        System.out.println("fourth  test " + this.getClass().getName());
    }
}
