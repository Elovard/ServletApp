package by.tms.servlets.LessonOne;

public class Calculator {
    public String operation (int firstNum, int secondNum, String operation) {
        switch (operation) {
            case "sum":
                return firstNum + " + " + secondNum + " = " + sum(firstNum, secondNum);
            case "div":
                if (secondNum !=0) {
                    return firstNum + " / " + secondNum + " = " + div(firstNum, secondNum);
                } else {
                    return "Division by zero";
                }
            case "minus":
                return firstNum + " - " + secondNum + " = " + minus(firstNum, secondNum);
            case "multiply":
                return firstNum + " * " + secondNum + " = " + multiply(firstNum, secondNum);
            default:
                return "Oops... Something is wrong";
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

// http://localhost:8080/calculator?num1=20&num2=10

