import java.util.*;
public class Arrays1{
// Create an Array and Initialize it Iterate  it by using For Loop in Reverse
     public static void main(String[] args) {
        int[] p = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < p.length; i++) {
            p[i] = sc.nextInt();
        }
        System.out.println("Printing the reverse numbers");
        for (int i = p.length - 1; i >= 0; i--) {
            System.out.println(p[i]);
        }
    }
}
