public class Array2{
  public static void main(String[] args) {
    
  
  // Prepare an Array with values of 1,2,3,4,5 and replace the value at 3rd index with 45


{
  int []a={2,3,4,5,6};


  System.out.println("without replace value");

  for( int i=0;i<5;i++){
    System.out.println(a[i]);
}

System.out.println("with replace value");

  
         for( int i=0;i<3;i++){
             System.out.println(a[i]);
         }
         a[3]=45;
         for( int i=3;i<=4;i++){
          System.out.println(a[i]);
         }
}
}
}