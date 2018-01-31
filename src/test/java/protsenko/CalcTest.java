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

    @Test
    public void equalToItself() {
        Calc arg = new Calc(5);
        assertTrue(arg.equals(arg));
    }

    @Test
    public void notEqualToNull() {
        Calc arg = new Calc(5);
        assertFalse(arg.equals(null));
    }

    @Test
    public void successObjectsEquallity() {
        Calc arg1 = new Calc(5);
        Calc arg2 = new Calc(5);
        assertTrue(arg1.equals(arg2));
    }

    @Test
    public void failObjectsEquallity() {
        Calc arg1 = new Calc(5);
        Calc arg2 = new Calc(-5);
        assertFalse(arg1.equals(arg2));
    }

    @Test
    public void failObjectsEquallityBecauseOfDiffClasses() {
        Calc arg1 = new Calc(5);
        assertFalse(arg1.equals(new Integer(5)));
    }

    @Test
    public void hashOfEqualObjectsShouldBeSame() {
        int hashCode1 = new Calc(5).hashCode();
        int hashCode2 = new Calc(5).hashCode();
        assertTrue(hashCode1 == hashCode2);
    }
}