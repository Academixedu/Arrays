public class Array2{
  // Prepare an Array with values of 1,2,3,4,5 and replace the value at 3rd index with 45
   public static void main(String[] args) {
        int[] p = new int[5];
     //method 1
        for (int i = 0; i < p.length; i++) {
            p[i] = i+1;
        }
        System.out.println("Printing the  numbers");
        for (int i = 0;i<p.length;i++) {
            if(i==2){
              p[i]=45;
        }
    }
     for(int c:p){
       System.out.prinltn(c);
     }

    
}
}
