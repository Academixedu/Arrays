import java.util.Scanner;
public class Array3{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] a=new int[5];
        for(int i=0;i<=a.length-1;i++){
            System.out.println("Enter an element at "+i+" index");
            int value=in.nextInt();
            a[i]=value;
        }
        System.out.println("Elements");
        for(int i:a){
            System.out.println(i);
        }
    }
}
