import java.util.*;
public class Array3{
// Prepare an Element of an Array and Implement Values using Scanner
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[]a=new int[5];

    for(int i=0;i<=a.length-1;i++){
        a[i]=scan.nextInt();
    }

    for(int i=0;i<=a.length-1;i++){
        System.out.println(a[i]);
    }
}
}
