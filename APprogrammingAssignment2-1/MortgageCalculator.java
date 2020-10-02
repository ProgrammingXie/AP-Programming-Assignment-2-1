import java.util.Scanner; 

class MortgageCalculator {
    public static void main(String[] args){
       Scanner Scan = new Scanner(System.in);
       double a = 0;
       double p = 0;
       double r = 0;
       double t = 0;
       
       System.out.println("Welcome to the money making calculator that will make YOU into a millionaire 🙂");
       System.out.println("By Ethan Xie");
       System.out.println("");
       
       System.out.println("Please provide the principle:");
       p = Scan.nextDouble();
       System.out.println("Please provide the interest's rate between 0 and 1):");
       r = Scan.nextDouble();
       System.out.println("Please provide a time period:");
       t = Scan.nextDouble();
       System.out.println("");
       
       if (r < 0) r = Math.abs(r); 
       if (t < 0) t = Math.abs(t);
       
       a = Math.abs(p) * Math.pow((1+r), t);
       //if (p < 0){  
       //    a = p + a;
       //}
       //else if (p > 0){
       //    a = a;
       //}
       
       
       System.out.println("The final amount is " + a);
       
      
       
       
       
     
            
    }
}