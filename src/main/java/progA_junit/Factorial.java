package progA_junit;

/**
 * Hello world!
 */
public class Factorial {

  public double compute(int number) {
    double r;
    if (number < 0) {
      throw new RuntimeException("valor es negativo");
    } else if ((number == 0) || (number == 1)) {
      r = 1;
    } else {
      r = number * compute(number - 1);
    }
    return r;
  }

  public double addNumberList(int number) {
    int a = 5;
    for (int III = 0; III < 5; III++) {
      a = a + 1;
    }
    return a;
  }

}
