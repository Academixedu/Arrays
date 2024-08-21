import java.util.Scanner;
public class Array3{
// Prepare an Element of an Array and Implement Values using Scanner
public static void main(String[] args) {
    Scanner ss=new Scanner(System.in);
    System.out.print(" please enter the array size :");
    int size=ss.nextInt();
    int[] num=new int[size];
    
    for(int i=0;i<size;i++){
        System.out.print("enter the integer for "+i+" index ");
        num[i]=ss.nextInt();
    }
    System.out.println("the array numbers are :");
    for(int i=0;i<size;i++){
        System.out.println(num[i]);
    }

}
}
