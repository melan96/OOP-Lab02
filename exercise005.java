import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //lab002 -exercise 05

        int number;

        //create a object
        EvenOddNumber num = new EvenOddNumber();
        Scanner myScan = new Scanner(System.in);

        System.out.print("Enter Number    :");
        number=myScan.nextInt();


        num.findEvenOdd(number);
        
    }
}
