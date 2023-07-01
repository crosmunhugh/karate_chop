import org.example.AbstractChop;
import org.example.Conventional;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecursiveTest {
    private AbstractChop chopper = new Conventional();

    @Test
    public void emptyArrayIsNegativeOne() {
        assertEquals(chopper.chop(3,new Integer[]{}),-1);
    }

    @Test
    public void valueNotInArrayReturnsNegativeOne() {
        assertEquals(chopper.chop(3,new Integer[]{1}),-1);
    }

    @Test
    public void singleValueInArrayMatchReturnsZero() {
        assertEquals(chopper.chop(1,new Integer[]{1}),0);
    }

    @Test
    public void threeValuesInArrayMatchesPositionZero() {
        assertEquals(chopper.chop(1,new Integer[]{1,3,5}),0);
    }

    @Test
    public void threeValuesInArrayMatchesPositionOne() {
        assertEquals(chopper.chop(3,new Integer[]{1,3,5}),1);
    }

    @Test
    public void threeValuesInArrayMatchesPositionTwo() {
        assertEquals(chopper.chop(5,new Integer[]{1,3,5}),2);
    }

    @Test
    public void threeValuesNotInArrayMatchesNegativeOne() {
        assertEquals(chopper.chop(0,new Integer[]{1,3,5}),-1);
        assertEquals(chopper.chop(2,new Integer[]{1,3,5}),-1);
        assertEquals(chopper.chop(4,new Integer[]{1,3,5}),-1);
        assertEquals(chopper.chop(6,new Integer[]{1,3,5}),-1);
    }

    @Test
    public void fourValuesInArrayMatchesPositionZero() {
        assertEquals(chopper.chop(1,new Integer[]{1,3,5,7}),0);
    }

    @Test
    public void fourValuesInArrayMatchesPositionOne() {
        assertEquals(chopper.chop(3,new Integer[]{1,3,5,7}),1);
    }

    @Test
    public void fourValuesInArrayMatchesPositionTwo() {
        assertEquals(chopper.chop(5,new Integer[]{1,3,5,7}),2);
    }

    @Test
    public void fourValuesInArrayMatchesPositionThree() {
        assertEquals(chopper.chop(7,new Integer[]{1,3,5,7}),3);
    }

    @Test
    public void fourValuesInArrayReturnsNegativeOne() {
        assertEquals(chopper.chop(0,new Integer[]{1,3,5,7}),-1);
        assertEquals(chopper.chop(2,new Integer[]{1,3,5,7}),-1);
        assertEquals(chopper.chop(4,new Integer[]{1,3,5,7}),-1);
        assertEquals(chopper.chop(6,new Integer[]{1,3,5,7}),-1);
        assertEquals(chopper.chop(8,new Integer[]{1,3,5,7}),-1);
    }
}
