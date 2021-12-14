import java.util.Scanner;
import java.text.DecimalFormat;
 public class fractionSimplifier{
  public static void main(String[] args){ 	
   Scanner sc = new Scanner(System.in);   
   DecimalFormat df = new DecimalFormat ("#");

      double number = 0;
   
      System.out.println ("digite o numerador");
      double num = sc.nextDouble();
      System.out.println ("digite o denominador");
      int den = sc.nextInt();
   
      System.out.println ("");
      System.out.print("divisores: ");
 
      for (int i=0; i<=num;i++){
          if (num%i==0 && den%i==0){             
              System.out.print(i+"; ");
 
              if (i>=number){
                  number = i;
                }               
         }
       }

      System.out.println ("");
      System.out.println ("");
   
      double simplifierNum = (num/number);
      double simplifierDen = (den/number);
      double irreducible = (num/den);
   
   System.out.print("fracao irredutivel: "+df.format(simplifierNum)+"/"+df.format(simplifierDen));
   
   if (num%den==0){
    System.out.println (" Ou: "+df.format(irreducible));
   }

}
}
