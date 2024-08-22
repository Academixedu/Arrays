public class Array2{
  // Prepare an Array with values of 1,2,3,4,5 and replace the value at 3rd index with 45
  public static void main(String[] args) {
    int[]s={1,2,3,4,5};
    for (int i : s) {
    System.out.println(i);  
    }
    s[2]=45;
    for (int i : s) {
      System.out.println(i);
    }
  }
  
}
