import java.util.Scanner;
public class Array3{
// Prepare an Element of an Array and Implement Values using Scanner
public static void main(String[] args) {
    Scanner ms =new Scanner(System.in);
    int a[]=new int[5];
    for(int i=0;i<=a.length-1;i++){
        System.out.println("enter nember at :"+i+"index");
        int ok =ms.nextInt();
        a[i]=ok;
        
    }
    System.out.println("---------------------------------------------------------");
for (int p:a){
    System.out.println(p);
}
    
}
}
