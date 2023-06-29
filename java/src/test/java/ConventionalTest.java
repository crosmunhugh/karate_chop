import org.example.Conventional;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConventionalTest {
    private Conventional conventional = new Conventional();

    @Test
    public void emptyArrayIsNegativeOne() {
        assertEquals(conventional.chop(3,new Integer[]{}),-1);
    }

    @Test
    public void valueNotInArrayReturnsNegativeOne() {
        assertEquals(conventional.chop(3,new Integer[]{1}),-1);
    }

    @Test
    public void singleValueInArrayMatchReturnsZero() {
        assertEquals(conventional.chop(1,new Integer[]{1}),0);
    }

    @Test
    public void threeValuesInArrayMatchesPositionZero() {
        assertEquals(conventional.chop(1,new Integer[]{1,3,5}),0);
    }

    @Test
    public void threeValuesInArrayMatchesPositionOne() {
        assertEquals(conventional.chop(3,new Integer[]{1,3,5}),1);
    }

    @Test
    public void threeValuesInArrayMatchesPositionTwo() {
        assertEquals(conventional.chop(5,new Integer[]{1,3,5}),2);
    }

    @Test
    public void threeValuesNotInArrayMatchesNegativeOne() {
        assertEquals(conventional.chop(0,new Integer[]{1,3,5}),-1);
        assertEquals(conventional.chop(2,new Integer[]{1,3,5}),-1);
        assertEquals(conventional.chop(4,new Integer[]{1,3,5}),-1);
        assertEquals(conventional.chop(6,new Integer[]{1,3,5}),-1);
    }

    @Test
    public void fourValuesInArrayMatchesPositionZero() {
        assertEquals(conventional.chop(1,new Integer[]{1,3,5,7}),0);
    }

    @Test
    public void fourValuesInArrayMatchesPositionOne() {
        assertEquals(conventional.chop(3,new Integer[]{1,3,5,7}),1);
    }

    @Test
    public void fourValuesInArrayMatchesPositionTwo() {
        assertEquals(conventional.chop(5,new Integer[]{1,3,5,7}),2);
    }

    @Test
    public void fourValuesInArrayMatchesPositionThree() {
        assertEquals(conventional.chop(7,new Integer[]{1,3,5,7}),3);
    }

    @Test
    public void fourValuesInArrayReturnsNegativeOne() {
        assertEquals(conventional.chop(0,new Integer[]{1,3,5,7}),-1);
        assertEquals(conventional.chop(2,new Integer[]{1,3,5,7}),-1);
        assertEquals(conventional.chop(4,new Integer[]{1,3,5,7}),-1);
        assertEquals(conventional.chop(6,new Integer[]{1,3,5,7}),-1);
        assertEquals(conventional.chop(8,new Integer[]{1,3,5,7}),-1);
    }

}
