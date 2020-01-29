package ch5;

public class Operators {
  public static void main(String[] args) {
    Operators operators = new Operators();
    operators.additive();
    operators.multiplicative();
    operators.remainder();
    operators.compound();
    operators.unary();
    operators.increDecre();
    operators.complement();
    operators.comparision();
    operators.comparison2();
    operators.condition();
    operators.doBlindDate(30);
    operators.doBlindDate(80);
    operators.casting();
  }

  public void additive() {
    int intValue1 = 5;
    int intValue2 = 10;

    int result = intValue1 + intValue2;
    System.out.println(result);
    result = intValue2 - intValue1;
    System.out.println(result);
  }

  public void multiplicative() {
    int intValue1 = 5;
    int intValue2 = 10;

    int result = intValue1 * intValue2;
    System.out.println(result);
    float result2 = (float) intValue1 / intValue2;
    System.out.println(result2);
  }

  public void remainder() {
    int intValue1 = 53;
    int intValue2 = 10;
    int result = intValue1 % intValue2;
    System.out.println(result);
  }

  public void compound() {
    int intValue = 10;
    intValue += 5;
    System.out.println(intValue);
    intValue -= 5;
    System.out.println(intValue);
    intValue *= 5;
    System.out.println(intValue);
    intValue /= 5;
    System.out.println(intValue);
    intValue %= 5;
    System.out.println(intValue);
  }

  public void unary() {
    int intValue = -10;
    int result = +intValue;
    System.out.println(result);
    result = -intValue;
    System.out.println(result);
  }

  public void increDecre() {
    int intValue = 1;
    System.out.println(intValue++);
    System.out.println(intValue);
    System.out.println(++intValue);
  }

  public void complement() {
    boolean flag = true;
    System.out.println(flag);
    System.out.println(!flag);
  }

  public void comparision() {
    int intValue1 = 1;
    int intValue2 = 2;
    int intValue3 = 1;
    System.out.println(intValue1 == intValue2);
    System.out.println(intValue1 == intValue3);

    System.out.println(intValue1 != intValue2);
    System.out.println(intValue1 != intValue3);

    System.out.println("------");

    char charValue = 'a';
    System.out.println(97 == charValue);
    double doubleValue = 1.0;
    System.out.println(intValue1 == doubleValue);
  }

  public void comparison2() {
    System.out.println("comparison2");
    int intValue1 = 1;
    int intValue2 = 2;
    System.out.println(intValue1 > intValue2);
    System.out.println(intValue1 < intValue2);
    System.out.println(intValue1 >= intValue2);
    System.out.println(intValue1 <= intValue2);
  }

  public void condition() {
    System.out.println("condition");

    boolean x = true;
    boolean y = true;
    System.out.println(x && y);
    System.out.println(x || y);
    System.out.println("-------");
    x = false;
    System.out.println(x && y);
    System.out.println(x || y);
    System.out.println("-------");
    y = false;
    System.out.println(x && y);
    System.out.println(x || y);
  }

  public boolean doBlindDate(int point) {
    System.out.println("doBlindDate : ");

    boolean doBlindDateFlag = false;
    doBlindDateFlag = point >= 80 ? true : false;
    System.out.println(doBlindDateFlag);
    return doBlindDateFlag;
  }

  public void casting() {
    System.out.println("casting");

    byte byteValue = 127;
    short shortValue = byteValue;

    shortValue++;
    System.out.println(shortValue);
    byteValue = (byte) shortValue;
    System.out.println(byteValue);
  }
}
