import java.util.Scanner;


public class CircleAreaToRadius{
    public static void main(String[] args){
        //1. declare variables
        Scanner Scan = new Scanner(System.in);
        //... other variables go there
        double r = 0;
        double area = 0;

        //2. get user input
        System.out.println("Welcome to the circle radius calculator 🙂");
        System.out.println("By Ethan Xie");
        System.out.println("");
        System.out.println("Please enter a value for the circle's area");
        area = Scan.nextDouble();
        
        if (area<0){
            area = Math.abs(area);
        }; 
        System.out.println("one sec please-------");
        System.out.println("");

        r = Math.sqrt(area/Math.PI);
        System.out.println("The area of the circle is " + Math.abs(area) + ", and has a radius of " + r + ".");

    }
}
