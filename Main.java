package com.github;

public class Main
{

    public static void main(String[] args)
    {
        Calculator calc = new Calculator();

        double number1 = 4;
        double number2 = 45;

        calc.addNumbers(number1, number2);
        calc.subtractNumbers(number1, number2);
        calc.multiplyNumbers(number1, number2);
        calc.divideNumbers(number1, number2);

        double number3 = 4.332;
        double number4 = 45;

        calc.addNumbers(number3, number4);
        calc.subtractNumbers(number3, number4);
        calc.multiplyNumbers(number3, number4);
        calc.divideNumbers(number3, number4);
        calc.toBinary(128);
    }
}



