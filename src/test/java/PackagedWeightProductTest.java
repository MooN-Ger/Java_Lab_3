import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackagedWeightProductTest {

    @Test
    void testGetNetWeight() {
        PackagedWeightProduct packagedWeightProductTest = new PackagedWeightProduct(new Product("TestWeightProductName", "TestWeightProductDescription"), new Package("TestPackageName", 1.00), 1.00);
        assertEquals(1.00, packagedWeightProductTest.getNetWeight());
    }

    @Test
    void testGetGrossWeight() {
        PackagedWeightProduct packagedWeightProductTest = new PackagedWeightProduct(new Product("TestWeightProductName", "TestWeightProductDescription"), new Package("TestPackageName", 1.00), 1.00);
        assertEquals(2.00, packagedWeightProductTest.getGrossWeight());
    }

    @Test
    void testEquals1() {
        assertEquals(true, new PackagedWeightProduct(new Product("TestWeightProductName", "TestWeightProductDescription"), new Package("TestPackageName", 1.00), 1.00).equals(new PackagedWeightProduct(new Product("TestWeightProductName", "TestWeightProductDescription"), new Package("TestPackageName", 1.00), 1.00)));
    }

    @Test
    void testEquals2() {
        assertEquals(false, new PackagedWeightProduct(new Product("TestWeightProductName1", "TestWeightProductDescription1"), new Package("TestPackageName", 1.00), 1.00).equals(new PackagedWeightProduct(new Product("TestWeightProductName2", "TestWeightProductDescription2"), new Package("TestPackageName", 1.00), 1.00)));
    }

    @Test
    void testEquals3() {
        assertEquals(false, new PackagedWeightProduct(new Product("TestWeightProductName", "TestWeightProductDescription"), new Package("TestPackageName1", 1.00), 1.00).equals(new PackagedWeightProduct(new Product("TestWeightProductName", "TestWeightProductDescription"), new Package("TestPackageName2", 2.00), 1.00)));
    }

    @Test
    void testEquals4() {
        assertEquals(false, new PackagedWeightProduct(new Product("TestWeightProductName", "TestWeightProductDescription"), new Package("TestPackageName", 1.00), 1.00).equals(new PackagedWeightProduct(new Product("TestWeightProductName", "TestWeightProductDescription"), new Package("TestPackageName", 1.00), 2.00)));
    }

    @Test
    void testToString() {
        PackagedWeightProduct packagedWeightProductTest =  new PackagedWeightProduct(new Product("TestWeightProductName", "TestWeightProductDescription"), new Package("TestPackageName", 1.00), 1.00);
        assertEquals("Product{name='TestWeightProductName', description='TestWeightProductDescription'} Package{name='TestPackageName', weight=1.0 kg} netWeight=1.0 kg", packagedWeightProductTest.toString());
    }
}