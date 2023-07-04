import org.example.AbstractChop;
import org.example.CeilingRecursive;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CeilingRecursiveTest {
    private AbstractChop chopper = new CeilingRecursive();

    @Test
    public void emptyArrayIsNegativeOne() {
        assertEquals(-1,chopper.chop(3,new Integer[]{}));
    }

    @Test
    public void valueNotInArrayReturnsNegativeOne() {
        assertEquals(-1,chopper.chop(3,new Integer[]{1}));
    }

    @Test
    public void singleValueInArrayMatchReturnsZero() {
        assertEquals(0,chopper.chop(1,new Integer[]{1}));
    }

    @Test
    public void threeValuesInArrayMatchesPositionZero() {
        assertEquals(0,chopper.chop(1,new Integer[]{1,3,5}));
    }

    @Test
    public void threeValuesInArrayMatchesPositionOne() {
        assertEquals(1,chopper.chop(3,new Integer[]{1,3,5}));
    }

    @Test
    public void threeValuesInArrayMatchesPositionTwo() {
        assertEquals(2,chopper.chop(5,new Integer[]{1,3,5}));
    }

    @Test
    public void threeValuesNotInArrayMatchesNegativeOne() {
        assertEquals(-1,chopper.chop(0,new Integer[]{1,3,5}));
        assertEquals(-1,chopper.chop(2,new Integer[]{1,3,5}));
        assertEquals(-1,chopper.chop(4,new Integer[]{1,3,5}));
        assertEquals(-1,chopper.chop(6,new Integer[]{1,3,5}));
    }

    @Test
    public void fourValuesInArrayMatchesPositionZero() {
        assertEquals(0,chopper.chop(1,new Integer[]{1,3,5,7}));
    }

    @Test
    public void fourValuesInArrayMatchesPositionOne() {
        assertEquals(1,chopper.chop(3,new Integer[]{1,3,5,7}));
    }

    @Test
    public void fourValuesInArrayMatchesPositionTwo() {
        assertEquals(2,chopper.chop(5,new Integer[]{1,3,5,7}));
    }

    @Test
    public void fourValuesInArrayMatchesPositionThree() {
        assertEquals(3,chopper.chop(7,new Integer[]{1,3,5,7}));
    }

    @Test
    public void fiveValuesInArrayMatchesPositionFour() {
        assertEquals(4,chopper.chop(9,new Integer[]{1,3,5,7,9}));
    }

    @Test
    public void fiveValuesInArrayReturnsNegativeOne() {
        assertEquals(-1,chopper.chop(15,new Integer[]{1,3,5,7,9}));
    }

    @Test
    public void fourValuesInArrayReturnsNegativeOne() {
        assertEquals(-1,chopper.chop(0,new Integer[]{1,3,5,7}));
        assertEquals(-1,chopper.chop(2,new Integer[]{1,3,5,7}));
        assertEquals(-1,chopper.chop(4,new Integer[]{1,3,5,7}));
        assertEquals(-1,chopper.chop(6,new Integer[]{1,3,5,7}));
        assertEquals(-1,chopper.chop(8,new Integer[]{1,3,5,7}));
    }
}
