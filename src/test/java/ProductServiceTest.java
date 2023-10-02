import Filter.BeginStringFilter;
import Filter.ContainsStringFilter;
import Filter.EqualStringFilter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {



    @Test
    public void testCountByFilter1() {

        int size = 5;
        PackagedProduct[] testArr = new PackagedProduct[size];
        testArr[0] = new PackagedPieceProduct(new PieceProduct("somePieceProduct", "someDescription", 1.00), new Package("TestPackageName1", 1.00), 11);
        testArr[1] = new PackagedWeightProduct(new Product("someWeightProduct", "someDescription"), new Package("TestPackageName1", 1.00), 2.00);
        testArr[2] = new PackagedPieceProduct(new PieceProduct("somePieceProduct", "someDescription", 2.00), new Package("TestPackageName2", 3.00), 12);
        testArr[3] = new PackagedPieceProduct(new PieceProduct("somePieceProduct", "someDescription", 3.00), new Package("TestPackageName2", 4.00), 13);
        testArr[4] = new PackagedWeightProduct(new Product("someWeightProduct", "someDescription"), new Package("TestPackageName1", 2.00), 5.00);
        ProductBatch testBatch = new ProductBatch("TestProductBatchDescription", testArr);

        assertEquals(5, ProductService.countByFilter(testBatch, new BeginStringFilter("some")));
    }

    @Test
    public void testCountByFilter2() {

        int size = 5;
        PackagedProduct[] testArr = new PackagedProduct[size];
        testArr[0] = new PackagedPieceProduct(new PieceProduct("somePieceProduct", "someDescription", 1.00), new Package("TestPackageName1", 1.00), 11);
        testArr[1] = new PackagedWeightProduct(new Product("someWeightProduct", "someDescription"), new Package("TestPackageName1", 1.00), 2.00);
        testArr[2] = new PackagedPieceProduct(new PieceProduct("somePieceProduct", "someDescription", 2.00), new Package("TestPackageName2", 3.00), 12);
        testArr[3] = new PackagedPieceProduct(new PieceProduct("somePieceProduct", "someDescription", 3.00), new Package("TestPackageName2", 4.00), 13);
        testArr[4] = new PackagedWeightProduct(new Product("someWeightProduct", "someDescription"), new Package("TestPackageName1", 2.00), 5.00);
        ProductBatch testBatch = new ProductBatch("TestProductBatchDescription", testArr);

        assertEquals(2, ProductService.countByFilter(testBatch, new ContainsStringFilter("Weight")));
    }

    @Test
    public void testCountByFilter3() {

        int size = 5;
        PackagedProduct[] testArr = new PackagedProduct[size];
        testArr[0] = new PackagedPieceProduct(new PieceProduct("somePieceProduct", "someDescription", 1.00), new Package("TestPackageName1", 1.00), 11);
        testArr[1] = new PackagedWeightProduct(new Product("someWeightProduct", "someDescription"), new Package("TestPackageName1", 1.00), 2.00);
        testArr[2] = new PackagedPieceProduct(new PieceProduct("somePieceProduct", "someDescription", 2.00), new Package("TestPackageName2", 3.00), 12);
        testArr[3] = new PackagedPieceProduct(new PieceProduct("somePieceProduct", "someDescription", 3.00), new Package("TestPackageName2", 4.00), 13);
        testArr[4] = new PackagedWeightProduct(new Product("someWeightProduct", "someDescription"), new Package("TestPackageName1", 2.00), 5.00);
        ProductBatch testBatch = new ProductBatch("TestProductBatchDescription", testArr);

        assertEquals(3, ProductService.countByFilter(testBatch, new EqualStringFilter("somePieceProduct")));
    }
}