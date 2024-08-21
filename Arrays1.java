import java.util.Scanner;
public class Arrays1{
// Create an Array and Initialize it Iterate  it by using For Loop in Reverse
public static void main(String[] args) {
    Scanner on=new Scanner(System.in);
        int[] out=new int[4];
        for(int i=0;i<=out.length-1;i++)
        {
            System.out.println("enter any no"+i+"index");
            int in=on.nextInt();    

            out[i]=in;

    }

    for( int i =out.length - 1; i >= 0; i--){
        System.out.println(out[i]);
    }

}
}



