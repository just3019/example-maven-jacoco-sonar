package protsenko;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest {

    @Test
    public void sumOfTwoElements() {
        Calc arg = new Calc(2);
        Calc actRes = new Calc(3).add(arg);
        Calc expRes = new Calc(5);
        assertEquals(expRes, actRes);
    }
}