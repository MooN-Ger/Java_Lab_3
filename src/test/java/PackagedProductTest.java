import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PackagedProductTest {

    @Test
    public void testEquals1() {
        assertEquals(true, new PackagedProduct("TestName", "TestDescription", new Package("TestPackageName", 1.00)).equals(new PackagedProduct("TestName", "TestDescription", new Package("TestPackageName", 1.00))));
    }

    @Test
    public void testEquals2() {
        assertEquals(false, new PackagedProduct("TestName1", "TestDescription", new Package("TestPackageName", 1.00)).equals(new PackagedProduct("TestName2", "TestDescription", new Package("TestPackageName", 1.00))));
    }

    @Test
    public void testEquals3() {
        assertEquals(false, new PackagedProduct("TestName", "TestDescription1", new Package("TestPackageName", 1.00)).equals(new PackagedProduct("TestName", "TestDescription2", new Package("TestPackageName", 1.00))));
    }

    @Test
    public void testEquals4() {
        assertEquals(false, new PackagedProduct("TestName", "TestDescription", new Package("TestPackageName1", 1.00)).equals(new PackagedProduct("TestName", "TestDescription", new Package("TestPackageName2", 2.00))));
    }

    @Test
    public void testToString() {
        PackagedProduct packagedProductTest = new PackagedProduct("TestName", "TestDescription", new Package("TestPackageName", 1.00));
        assertEquals("Product{name='TestName', description='TestDescription'} Package{name='TestPackageName', weight=1.0 kg}", packagedProductTest.toString());
    }
}