import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PackageTest {

    @Test
    public void testEquals1() {
        assertEquals(true, new Package("TestName", 1.00).equals(new Package("TestName", 1.00)));
    }

    @Test
    public void testEquals2() {
        assertEquals(false, new Package("TestName1", 1.00).equals(new Package("TestName2", 1.00)));
    }

    @Test
    public void testEquals3() {
        assertEquals(false, new Package("TestName", 1.00).equals(new Package("TestName", 2.00)));
    }

    @Test
    public void testHashCode() {
        Package _packageTest1 = new Package("TestName", 1.00);
        Package _packageTest2 = new Package("TestName", 2.00);
        assertEquals(false, _packageTest1.equals(_packageTest2));
    }

    @Test
    public void testToString() {
        Package _packageTest = new Package("TestName", 1.00);
        assertEquals("Package{" +
                "name='" + "TestName" + '\'' +
                ", weight=" + 1.00 + " kg" +
                '}', _packageTest.toString());
    }

}