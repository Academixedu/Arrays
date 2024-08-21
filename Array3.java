import java.util.Scanner;
public class Array3{
    public static void main(String[] args) {
        Scanner kl=new Scanner(System.in);
        int nl[]=new int[5];
        for(int i=0;i<=nl.length-1;i++){
            System.out.println("enter the value"+ i+"index");
            int ok=kl.nextInt();
            nl[i]=ok;
        }
        System.out.println("using for each loop");
        for (int p : nl) {
            System.out.println(p);
        }
    }
}