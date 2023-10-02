import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductBatchTest {

    @Test
    void testGetTotalWeight() {
        int size = 3;
        PackagedProduct[] testArr = new PackagedProduct[size];
        testArr[0] = new PackagedPieceProduct(new PieceProduct("TestPieceProductName1", "TestPieceProductDescription1", 1.00), new Package("TestPackageName1", 1.00), 11);
        testArr[1] = new PackagedWeightProduct(new Product("TestWeightProductName1", "TestWeightProductDescription1"), new Package("TestPackageName1", 1.00), 1.00);
        testArr[2] = new PackagedPieceProduct(new PieceProduct("TestPieceProductName2", "TestPieceProductDescription2", 2.00), new Package("TestPackageName2", 2.00), 12);
        ProductBatch testBatch = new ProductBatch("TestProductBatchDescription", testArr);
        assertEquals(40, testBatch.getTotalWeight());
    }

    @Test
    void testEquals() {
        int size1 = 3;
        PackagedProduct[] testArr1 = new PackagedProduct[size1];
        testArr1[0] = new PackagedPieceProduct(new PieceProduct("TestPieceProductName1", "TestPieceProductDescription1", 1.00), new Package("TestPackageName1", 1.00), 11);
        testArr1[1] = new PackagedWeightProduct(new Product("TestWeightProductName1", "TestWeightProductDescription1"), new Package("TestPackageName1", 1.00), 1.00);
        testArr1[2] = new PackagedPieceProduct(new PieceProduct("TestPieceProductName2", "TestPieceProductDescription2", 2.00), new Package("TestPackageName2", 2.00), 12);
        ProductBatch testBatch1 = new ProductBatch("TestProductBatchDescription", testArr1);

        int size2 = 3;
        PackagedProduct[] testArr2 = new PackagedProduct[size2];
        testArr2[0] = new PackagedPieceProduct(new PieceProduct("TestPieceProductName1", "TestPieceProductDescription1", 1.00), new Package("TestPackageName1", 1.00), 11);
        testArr2[1] = new PackagedWeightProduct(new Product("TestWeightProductName1", "TestWeightProductDescription1"), new Package("TestPackageName1", 1.00), 1.00);
        testArr2[2] = new PackagedPieceProduct(new PieceProduct("TestPieceProductName2", "TestPieceProductDescription2", 2.00), new Package("TestPackageName2", 2.00), 12);
        ProductBatch testBatch2 = new ProductBatch("TestProductBatchDescription", testArr2);

        assertEquals(true, testBatch1.equals(testBatch2));
    }

    @Test
    void testToString() {
        int size = 3;
        PackagedProduct[] testArr = new PackagedProduct[size];
        testArr[0] = new PackagedPieceProduct(new PieceProduct("TestPieceProductName1", "TestPieceProductDescription1", 1.00), new Package("TestPackageName1", 1.00), 11);
        testArr[1] = new PackagedWeightProduct(new Product("TestWeightProductName1", "TestWeightProductDescription1"), new Package("TestPackageName1", 1.00), 1.00);
        testArr[2] = new PackagedPieceProduct(new PieceProduct("TestPieceProductName2", "TestPieceProductDescription2", 2.00), new Package("TestPackageName2", 2.00), 12);
        ProductBatch testBatch = new ProductBatch("TestProductBatchDescription", testArr);

        assertEquals("ProductBatch{" +
                "description='TestProductBatchDescription', " +
                "products=[" +
                "Product{name='TestPieceProductName1', description='TestPieceProductDescription1'} PieceProductWeight=1.0 kg Package{name='TestPackageName1', weight=1.0 kg} quantity of PieceProduct=11, " +
                "Product{name='TestWeightProductName1', description='TestWeightProductDescription1'} Package{name='TestPackageName1', weight=1.0 kg} netWeight=1.0 kg, " +
                "Product{name='TestPieceProductName2', description='TestPieceProductDescription2'} PieceProductWeight=2.0 kg Package{name='TestPackageName2', weight=2.0 kg} quantity of PieceProduct=12]}",
                testBatch.toString());
    }
}