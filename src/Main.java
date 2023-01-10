import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = reader.next();
        System.out.println("Hello,"+ name);
        System.out.println("How old are you?");
        int age = reader.nextInt();
        System.out.println("Your Lucky Number:");
        int numberOfLetters = name.length();
        int luckyNumber = 0;

        if (age<15)
        {
            luckyNumber= (numberOfLetters*age) %10;
        }
        if (age<20)
        {
            luckyNumber= (age*age-numberOfLetters) %10;
        }
        if (age<40)
        {
            luckyNumber=(numberOfLetters-age) %10;

        } else if (age<60)
        {
         luckyNumber=(age+numberOfLetters) %10;
        }
        else
        {
            luckyNumber=(numberOfLetters*5-age) %10;
        }
        if (luckyNumber<0)
            luckyNumber = luckyNumber * -1;

        System.out.println(luckyNumber);

    }
}