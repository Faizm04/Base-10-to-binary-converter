import java.util.Scanner;
class Numtobin{
   public static void main(String[] args){
      Scanner key = new Scanner(System.in);
      System.out.print("Enter number here :: ");
      int bin = key.nextInt();
      int mult=1;
         while(mult<=bin){
         mult*=2;}
         while(mult>1){
          mult/=2;
         if(bin>=mult){
         System.out.print("1");
         bin = bin-mult;}
         else{System.out.print(0);}
         
         }
      }
 } 