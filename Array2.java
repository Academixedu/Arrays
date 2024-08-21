public class Array2{
  // Prepare an Array with values of 1,2,3,4,5 and replace the value at 3rd index with 45
  public static void main(String[] args) {
    int[] num={1,2,3,4,5};
    for(int i=0;i<num.length;i++){
      System.out.println(" numbr  :"+num[i]);
    } num[3]=45;
    System.out.println("the 3rd is replaced with the 45");
    
    for(int j=0;j<num.length;j++){
      System.out.println("new numbers :"+num[j]);
    }
    
  }
}
