import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackagedPieceProductTest {

    @Test
    void testGetNetWeight() {
        PackagedPieceProduct packagedPieceProductTest = new PackagedPieceProduct(new PieceProduct("TestPieceProductName", "TestPieceProductDescription", 1.00), new Package("TestPackageName", 1.00), 10);
        assertEquals(10, packagedPieceProductTest.getNetWeight());
    }

    @Test
    void testGetGrossWeight() {
        PackagedPieceProduct packagedPieceProductTest = new PackagedPieceProduct(new PieceProduct("TestPieceProductName", "TestPieceProductDescription", 1.00), new Package("TestPackageName", 1.00), 10);
        assertEquals(11, packagedPieceProductTest.getGrossWeight());
    }

    @Test
    void testEquals1() {
        assertEquals(true, new PackagedPieceProduct(new PieceProduct("TestPieceProductName", "TestPieceProductDescription", 1.00), new Package("TestPackageName", 1.00), 10).equals(new PackagedPieceProduct(new PieceProduct("TestPieceProductName", "TestPieceProductDescription", 1.00), new Package("TestPackageName", 1.00), 10)));
    }

    @Test
    void testEquals2() {
        assertEquals(false, new PackagedPieceProduct(new PieceProduct("TestPieceProductName1", "TestPieceProductDescription1", 1.00), new Package("TestPackageName", 1.00), 10).equals(new PackagedPieceProduct(new PieceProduct("TestPieceProductName2", "TestPieceProductDescription2", 2.00), new Package("TestPackageName", 1.00), 10)));
    }

    @Test
    void testEquals3() {
        assertEquals(false, new PackagedPieceProduct(new PieceProduct("TestPieceProductName", "TestPieceProductDescription", 1.00), new Package("TestPackageName1", 1.00), 10).equals(new PackagedPieceProduct(new PieceProduct("TestPieceProductName", "TestPieceProductDescription", 1.00), new Package("TestPackageName2", 2.00), 10)));
    }

    @Test
    void testEquals4() {
        assertEquals(false, new PackagedPieceProduct(new PieceProduct("TestPieceProductName", "TestPieceProductDescription", 1.00), new Package("TestPackageName", 1.00), 11).equals(new PackagedPieceProduct(new PieceProduct("TestPieceProductName", "TestPieceProductDescription", 1.00), new Package("TestPackageName", 1.00), 12)));
    }

    @Test
    void testToString() {
        PackagedPieceProduct packagedPieceProductTest = new PackagedPieceProduct(new PieceProduct("TestPieceProductName", "TestPieceProductDescription", 1.00), new Package("TestPackageName", 1.00), 10);
        assertEquals("Product{name='TestPieceProductName', description='TestPieceProductDescription'} PieceProductWeight=1.0 kg Package{name='TestPackageName', weight=1.0 kg} quantity of PieceProduct=10", packagedPieceProductTest.toString());
    }
}