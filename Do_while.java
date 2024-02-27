import java.util.Scanner;

public class Do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.println("Input a number ::");
            number = sc.nextInt();
            System.out.print("Here is your number ::");
            System.out.println(number);
        } while (number >= 0);
        System.out.println("The end");
    }

}
