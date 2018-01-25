package protsenko;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest {

    @Test
    public void sumOfTwoElements() {
        Calc arg = new Calc(2);
        Calc actualResult = new Calc(3).add(arg);
        Calc expectedResult = new Calc(5);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void negOfElement() {
        Calc arg = new Calc(5);
        Calc actualResult = arg.neg();
        Calc expectedResult = new Calc(-5);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void diffOfElements() {
        Calc arg = new Calc(5);
        Calc actualResult = arg.diff(new Calc(4));
        Calc expectedResult = new Calc(1);
        assertEquals(expectedResult, actualResult);
    }
}