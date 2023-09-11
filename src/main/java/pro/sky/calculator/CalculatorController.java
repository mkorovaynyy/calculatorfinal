package pro.sky.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
@Validated
@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    @Autowired
    private final CalculatorServiceImpl calculatorService;

    public CalculatorController(CalculatorServiceImpl calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String toGreet() {
        return calculatorService.toGreet();
    }
    @GetMapping("/plus")
    public String toAddTwoNumbers(@RequestParam ("num1") @NotNull String userNum1, @RequestParam("num2") @NotNull String userNum2) {
        try {
            return Integer.parseInt(userNum1) + " + " + Integer.parseInt(userNum2) + " = " + calculatorService.toAddTwoNumbers(Integer.parseInt(userNum1), Integer.parseInt(userNum2));
        }
        catch (Exception e) {
            e.printStackTrace();
            return "неверный формат параметров запроса или параметры отсутствуют";
        }
    }
    @GetMapping("/minus")
    public String toSubstractTwoNumbers(@RequestParam ("num1") @NotNull String userNum1, @RequestParam("num2") @NotNull String userNum2) {
        try {
            return Integer.parseInt(userNum1) + " - " + Integer.parseInt(userNum2) + " = " + calculatorService.toSubstractTwoNumbers(Integer.parseInt(userNum1), Integer.parseInt(userNum2));
        }
        catch (Exception e) {
            e.printStackTrace();
            return "неверный формат параметров запроса или параметры отсутствуют";
        }
    }
    @GetMapping("/multiply")
    public String toMultiplyTwoNumbers(@RequestParam ("num1") @NotNull String userNum1, @RequestParam("num2") @NotNull String userNum2) {
        try {
            return Integer.parseInt(userNum1) + " * " + Integer.parseInt(userNum2) + " = " + calculatorService.toMultiplyTwoNumbers(Integer.parseInt(userNum1), Integer.parseInt(userNum2));
        }
        catch (Exception e) {
            e.printStackTrace();
            return "неверный формат параметров запроса или параметры отсутствуют";
        }
    }
    @GetMapping("/divide")
    public String toDivideTwoNumbers(@RequestParam ("num1") @NotNull String userNum1, @RequestParam("num2") @NotNull String userNum2) {
        try {
            return Integer.parseInt(userNum1) + " / " + Integer.parseInt(userNum2) + " = " + calculatorService.toDivideTwoNumbers(Integer.parseInt(userNum1), Integer.parseInt(userNum2));
        }
        catch (Exception e) {
            e.printStackTrace();
            return "неверный формат параметров запроса или параметры отсутствуют/ деление на ноль";
        }
    }

}
