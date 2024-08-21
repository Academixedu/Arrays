import java.util.Scanner;

public class Array3{
// Prepare an Element of an Array and Implement Values using Scanner
public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int[] arr=new int[10];
    for(int i=0;i<=arr.length-1;i++){
        System.out.println("enter element ");
        int num=in.nextInt();
        arr[i]=num;
    }
    for(int i:arr){
        System.out.println(i);
    }


    }
}

