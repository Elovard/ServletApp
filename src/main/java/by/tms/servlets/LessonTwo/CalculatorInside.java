package by.tms.servlets.LessonTwo;

public class CalculatorInside {
    String result;
    String message;
    public String operation (int firstNum, int secondNum, String operation) {
        switch (operation) {
            case "sum":
                return result = firstNum + " + " + secondNum + " = " + sum(firstNum, secondNum);
            case "div":
                if (secondNum !=0) {
                    return result = firstNum + " / " + secondNum + " = " + div(firstNum, secondNum);
                } else {
                    return message = "Division by zero";
                }
            case "minus":
                return result = firstNum + " - " + secondNum + " = " + minus(firstNum, secondNum);
            case "multiply":
                return result = firstNum + " * " + secondNum + " = " + multiply(firstNum, secondNum);
            default:
                return message = "Oops... Something is wrong";
        }
    }

    private int sum(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    private int minus(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    private int div(int firstNum, int secondNum) {
        return firstNum / secondNum;
    }

    private int multiply(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }
}

