package com.github;

public class Calculator
{
    public double addNumbers(double numberOne, double numberTwo)
    {
        System.out.println(numberOne + " + " + numberTwo + " = " + (numberOne + numberTwo));
        return numberOne + numberTwo;
    }

    public double subtractNumbers(double numberOne, double numberTwo)
    {
        System.out.println(numberOne + " - " + numberTwo + " = " + (numberOne - numberTwo));
        return numberOne - numberTwo;
    }

    public double multiplyNumbers(double numberOne, double numberTwo)
    {
        System.out.println(numberOne + " * " + numberTwo + " = " + (numberOne * numberTwo));
        return numberOne + numberTwo;
    }

    public double divideNumbers(double numberOne, double numberTwo)
    {
        System.out.println(numberOne + " / " + numberTwo + " = " + (numberOne / numberTwo));
        return numberOne + numberTwo;
    }

    public void toBinary(int number)
    {
        int c = 0;
        while (c <= number)
        {
            if (c == 0 || c == 1)
            {
                c++;
            } else
            {
                c *= 2;
            }
        }
        String binary = "";
        while (c > 0)
        {
            if (c - number > 0)
            {
                if (binary != "")
                    binary += "0";
                c /= 2;
            } else
            {
                binary += "1";
                number -= c;
                c /= 2;
            }
        }
        System.out.println(binary);
    }

    public void printInstructions()
    {
        System.out.println("|--------------------------------|");
        System.out.println("| Welcome to my Calculator!      |");
        System.out.println("|--------------------------------|");
        System.out.println("| What do you want to calculate? |");
        System.out.println("|--------------------------------|");
        System.out.println("| 1 - Addition                   |");
        System.out.println("| 2 - Subtraction                |");
        System.out.println("| 3 - Multiplication             |");
        System.out.println("| 4 - Division                   |");
        System.out.println("| 5 - Quit                       |");
        System.out.println("|--------------------------------|");
    }
}
