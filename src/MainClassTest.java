import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetLocalNumber() {
        MainClass mainClass = new MainClass();

        Assert.assertEquals("getLocalNumber return not a 14", 14, mainClass.getLocalNumber());
    }

    @Test
    public void testGetClassNumber() {
        MainClass mainClass = new MainClass();

        Assert.assertTrue("getClassNumber return Integer less 46", mainClass.getClassNumber() > 45);
    }

    @Test
    public void testGetClassString() {
        MainClass mainClass = new MainClass();
        boolean result;
        if (mainClass.getClassString().contains("hello") || mainClass.getClassString().contains("Hello")) result = true;
        else result = false;

        Assert.assertTrue("class_string does not contain the 'hello' or 'Hello'", result);
    }
}
