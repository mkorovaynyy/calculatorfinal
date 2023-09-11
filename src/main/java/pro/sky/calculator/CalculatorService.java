package pro.sky.calculator;

public interface CalculatorService {
    default String toGreet() {
        return "Добро пожаловать в калькулятор";
    }
    Integer toAddTwoNumbers(int  a, int b);
    Integer toSubstractTwoNumbers(int  a, int b);
    Integer toMultiplyTwoNumbers(int  a, int b);
    Integer toDivideTwoNumbers(int  a, int b);
}
