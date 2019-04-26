package progA_junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class FactorialTest {
  private static final double epsilon=0.0001;
  Factorial factorial;

  @Before
  public void setup() {
    factorial = new Factorial();
  }

  @After
  public void after() {
    factorial = null;
  }

  @Test
  public void should0return1() {
    double expected = 1;
    double obtein= factorial.compute(0);
    assertEquals(expected, obtein,epsilon);
  }

  @Test
  public void should1return1() {
    double expected = 1;
    double obtein= factorial.compute(1);
    assertEquals(expected, obtein,epsilon);
  }

  @Test
  public void should2return2() {
    double expected = 2;
    double obtein= factorial.compute(2);
    assertEquals(expected, obtein,epsilon);
  }

  @Test
  public void should3return6() {
    double expected = 6;
    double obtein= factorial.compute(3);
    assertEquals(expected, obtein,epsilon);
  }
  @Test(expected = RuntimeException.class)
  public void shouldFactorialThrowExceptionIfValueIsNegative() {
    factorial.compute(-2);
  }

}
