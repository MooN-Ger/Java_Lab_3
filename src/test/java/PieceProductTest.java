import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PieceProductTest {

    @Test
    public void testEquals1() {
        assertEquals(true, new PieceProduct("TestName", "TestDescription", 1.00).equals(new PieceProduct("TestName", "TestDescription", 1.00)));
    }
    @Test
    public void testEquals2() {
        assertEquals(false, new PieceProduct("TestName1", "TestDescription", 1.00).equals(new PieceProduct("TestName2", "TestDescription", 1.00)));
    }
    @Test
    public void testEquals3() {
        assertEquals(false, new PieceProduct("TestName", "TestDescription1", 1.00).equals(new PieceProduct("TestName", "TestDescription2", 1.00)));
    }
    @Test
    public void testEquals4() {
        assertEquals(false, new PieceProduct("TestName", "TestDescription", 1.00).equals(new PieceProduct("TestName", "TestDescription", 2.00)));
    }

    @Test
    public void testToString() {
        PieceProduct pieceProductTest = new PieceProduct("TestName", "TestDescription", 1.00);
        assertEquals("Product{name='TestName', description='TestDescription'} PieceProductWeight=1.0 kg", pieceProductTest.toString());
    }
}