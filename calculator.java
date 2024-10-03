import java.util.Scanner;

public class calculator{

    public static void main(String[] args) {
double number1;
double number2;
double addion;
double subtaction;
Scanner input = new Scanner(System.in);

number1 = getnumber1(input);
number2 = getnumber2(input);
addion = getaddion(number1, number2);
subtaction = getsubtaction(number1, number2);

System.out.println("Addition result: " + addion);
System.out.println("Subtraction result: " + subtaction);
    }
public static double getsubtaction(double a, double b) {
    return a - b;
}
public static double getaddion(double a, double b) {
    return a + b;
}
public static double getnumber1(Scanner input) {
    System.out.println("Enter the first number");
    return input.nextDouble();
}
public static double getnumber2(Scanner input) {
    System.out.println("Enter the second number");
    return input.nextDouble();
}
}
