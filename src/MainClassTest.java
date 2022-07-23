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

        Assert.assertTrue("getClassNumber return Integer less 45", mainClass.getClassNumber() > 45);
    }
}
