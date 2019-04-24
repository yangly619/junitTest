package progA_junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class FactorialTest
{
    Factorial fact=new Factorial();
    int expected=24;
    @Test
    public void shouldAnswerWithTrue()
    {
        assertEquals( expected,fact.compute(4) );
    }
}
