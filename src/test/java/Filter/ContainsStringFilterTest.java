package Filter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsStringFilterTest {

    BeginStringFilter filterTest = new BeginStringFilter("want to pass");

    @Test
    public void apply1() {
        assertEquals(true, filterTest.apply("I really want to pass my exams"));
    }

    @Test
    public void apply2() {
        assertEquals(false, filterTest.apply("I really wan_ to pass my exams"));
    }

    @Test
    public void apply3() {
        assertEquals(false, filterTest.apply("I really want to fail my exams"));
    }
}