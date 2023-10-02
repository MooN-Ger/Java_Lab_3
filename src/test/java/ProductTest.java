import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    public void testEquals1() {
        assertEquals(true, new Product("TestName", "TestDescription").equals(new Product("TestName", "TestDescription")));
    }

    @Test
    public void testEquals2() {
        assertEquals(false, new Product("TestName1", "TestDescription").equals(new Product("TestName2", "TestDescription")));
    }

    @Test
    public void testEquals3() {
        assertEquals(false, new Product("TestName", "TestDescription1").equals(new Product("TestName", "TestDescription2")));
    }

    @Test
    public void testToString() {
        Product productTest = new Product("TestName", "TestDescription");
        assertEquals("Product{" +
                "name='" + "TestName" + '\'' +
                ", description='" + "TestDescription" + '\'' +
                '}', productTest.toString());
    }
}