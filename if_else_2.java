import java.util.Scanner;

public class if_else_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cash = sc.nextInt();
        if (cash < 10) {
            System.out.println("Can not buy anything");
            System.out.println("Get more case");
        } else if (cash > 10 && cash < 50) {
            System.out.println("Can get 1 thing ");
        } else {
            System.out.println("Can get both");

        }
    }
}
