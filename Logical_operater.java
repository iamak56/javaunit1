public class Logical_operater {
    public static void main(String[] args) {
        // &&
        int a = 40;
        int b = 80;
        if (a < 50 && b < 50)
            System.out.println("Both less than 50");
        else
            System.out.println("Something is worng");
        // ||
        if (a < 50 || b < 50)
            System.out.println("Atlest one is 50");
        boolean isAdult = true;
        if (isAdult == true)
            System.out.println("is Adult");
    }
}
