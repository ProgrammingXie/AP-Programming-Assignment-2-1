import java.util.Scanner;

class DistanceFormula {
    public static void main(String[] args){
        Scanner Scan = new Scanner(System.in);
        double xFirst = 0;
        double yFirst = 0;
        double xSecond = 0;
        double ySecond = 0;        
        double r = 0;
        
        System.out.println("Welcome to the distance calculator 🙂");
        System.out.println("By Etan Xie");
        System.out.println("");
        
        System.out.println("Please provide the first X value:");
        xFirst = Scan.nextDouble();            
        System.out.println("Please provide the first Y value:");
        yFirst = Scan.nextDouble();
        System.out.println("");
        System.out.println("Please provide the second X value:");
        xSecond = Scan.nextDouble();
        System.out.println("Please provide the second Y value:");
        ySecond = Scan.nextDouble();
        System.out.println("");
        
        r = Math.sqrt((xFirst * xFirst) + (yFirst * yFirst)) + Math.sqrt((xSecond * xSecond) + (ySecond * ySecond));
        System.out.println("The distance calculated between the two points is " + r + ".");
    }
}