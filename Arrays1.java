public class Arrays1{
// Create an Array and Initialize it Iterate  it by using For Loop in Reverse
public static void main(String[] args) {
    int[] marks={95,98,99,56,65,78,90,34,22,12,65,89,90};
    for(int i=marks.length-1;i>=0;i--){
        System.out.println("printing the marks in reverse order :"+marks[i]);
    }
    
}
}
