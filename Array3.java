import java.util.*;
public class Array3{
// Prepare an Element of an Array and Implement Values using Scanner
   public static void main(String[] args) {
        int[] p = new int[5];
        Scanner sc = new Scanner(System.in);
     
        for (int i = 0; i < p.length; i++) {
          System.out.println("enter the values of index"+i);
            p[i] = sc.nextInt();
        }
        System.out.println("Printing the reverse numbers");
        for (int i = 0;i<p.length;i++) {
            System.out.println(p[i]);
        }
    }
}
