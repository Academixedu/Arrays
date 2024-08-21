public class Array2{
  // Prepare an Array with values of 1,2,3,4,5 and replace the value at 3rd index with 45
  public static void main(String[] args) {
    int a[]={1,2,3,4,5};
    for(int i=0;i<=a.length-1;i++){
      a[3]=45;
      System.out.println(a[i]);
    }
  }
}
