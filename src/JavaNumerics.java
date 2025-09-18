import java.sql.SQLOutput;

public class JavaNumerics
{
	public static void main(String[] args)
	{
        int intOperandA = 6;
        int intOperandB = 7;
        int intSum = 7;
        int intProduct = 4;
        int intDifference = 9;
        int intQuotient = 2;
        int intModulo = 11;

        double doubleOperandA = 1.25;
        double doubleOperandB = 2.5;
        double doubleSum = 3.75;
        double doubleProduct = 3.125;
        double doubleDifference = 1.25;
        double doubleQuotient = 3;

        intSum = intOperandA + intOperandB;
        intProduct = intOperandA * intOperandB;
        intDifference = intOperandA - intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;


        doubleSum = intOperandA + intOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;


        System.out.println("The sum using ints of " + intOperandA + " + " + intOperandB + " is " + intSum);
        System.out.println("The product using ints of " + intOperandA + " * " + intOperandB + " is " + intProduct);
        System.out.println("The difference using ints of " + intOperandA + " - " + intOperandB + " is " + intDifference);
        System.out.println("The quotient using ints of " + intOperandA + " / " + intOperandB + " is " + intQuotient);
        System.out.println("The modulo using ints of " + intOperandA + " % " + intOperandB + " is " + intModulo);

        System.out.println("The sum using ints of " + doubleOperandA + " + " + doubleOperandB + " is " + doubleSum);
        System.out.println("The product using ints of " + doubleOperandA + " * " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The difference using ints of " + doubleOperandB + " - " + doubleOperandA + " is " + doubleDifference);
        System.out.println("The quotient using ints of " + doubleOperandB + " / " + doubleOperandA + " is " + doubleQuotient);



    }
}
