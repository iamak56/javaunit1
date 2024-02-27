import java.util.Arrays;

public class lenth {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 80;
        marks[1] = 65;
        marks[2] = 50;
        int[][] finelmarks = { { 20, 25, 30 }, { 80, 85, 90 } };

        System.out.println(finelmarks[0][1]);
        System.out.println(marks[2]);
        System.out.println(marks.length);
        System.out.println(finelmarks.length);
        Arrays.sort(marks);
        System.out.println(finelmarks[0][1]);
        System.out.println(marks[2]);
    }
}
