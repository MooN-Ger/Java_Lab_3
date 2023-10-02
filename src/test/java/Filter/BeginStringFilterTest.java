package Filter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BeginStringFilterTest {
    BeginStringFilter filterTest = new BeginStringFilter("I really");

    @Test
    public void apply1() {
        assertEquals(true, filterTest.apply("I really want to pass my exams"));
    }

    @Test
    public void apply2() {
        assertEquals(false, filterTest.apply("I don't want to pass my exams"));
    }

    @Test
    public void apply3() {
        assertEquals(false, filterTest.apply("i really want to pass my exams"));
    }
}