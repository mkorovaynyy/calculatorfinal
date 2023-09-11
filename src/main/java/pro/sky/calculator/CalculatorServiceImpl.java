package pro.sky.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public Integer toAddTwoNumbers(int a, int b) {
            return a + b;
    }

    @Override
    public Integer toSubstractTwoNumbers(int a, int b) {;
            return a - b;
    }

    @Override
    public Integer toMultiplyTwoNumbers(int a, int b) {
        return a * b;
    }

    @Override
    public Integer toDivideTwoNumbers(int a, int b) {
        return  a / b;
    }
}
