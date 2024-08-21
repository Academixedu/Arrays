public class Array2{
  public static void main(String[] args) {
    int [] a={1,2,3,4,5};
    for (int i : a) {
      a[2]=45;
      System.out.println(i);
    }
  
    
    }
  }
  // Prepare an Array with values of 1,2,3,4,5 and replace the value at 3rd index with 45