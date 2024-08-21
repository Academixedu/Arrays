import java.util.Scanner;


public class Array3{
// Prepare an Element of an Array and Implement Values using Scanner
public static void main(String[] args) {
    
    Scanner on=new Scanner(System.in);
        int[] out=new int[4];
        for(int i=0;i<=out.length-1;i++)
        {
            System.out.println("enter any no"+i+"index");
            int in=on.nextInt();    

            out[i]=in;

    }
    for(int h:out)
    {
        System.out.println(h);
    }
}
}
