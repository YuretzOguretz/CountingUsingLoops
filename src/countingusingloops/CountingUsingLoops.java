/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countingusingloops;
import java.util.Scanner;
/**
 *
 * @author yanji
 */
public class CountingUsingLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1: Find the value of a number squared \n" + "2: Find the value of a number cubed \n" + "3: Find the value of a number, to any power\n" +"4: Exit");
        System.out.print("Enter Your Decision: ");
        int n = scan.nextInt();
        double num;
        int num1;
        double numstart;
        for (int i = n; i < 4;){
           if (n == 1){
             
             System.out.print("Enter a number: ");
             num = scan.nextDouble();
             for (int a = 0; a < 1; a++){
                num*=num;
                System.out.println(num);
             }
            
            System.out.println("1: Find the value of a number squared \n" + "2: Find the value of a number cubed \n" + "3: Find the value of a number, to any power\n" +"4: Exit");
            System.out.print("Enter Your Decision: ");
            i = scan.nextInt();
           }
           if (n == 2){
             System.out.print("Enter a number: ");
             numstart = scan.nextDouble();
             num = 1;
             for (int a = 0; a < 3; a++){
                num = num * numstart;
                System.out.println(num); 
             }
             
             System.out.println("1: Find the value of a number squared \n" + "2: Find the value of a number cubed \n" + "3: Find the value of a number, to any power\n" +"4: Exit");
             System.out.print("Enter Your Decision: ");
             i = scan.nextInt();
           }
           if (n == 3){
             System.out.print("Enter a number: ");
             numstart = scan.nextDouble();
             System.out.print("Enter an exponent: ");
             num1 = scan.nextInt();
             if (num1%2==0){
                 for (int a = 0; a < num1/2; a++){
                numstart*=numstart;
                System.out.println(numstart);
             }
             }
             else if (num1%2!=0){
                num = 1;
                for (int a = 0; a < num1; a++){
                num = num * numstart;
                System.out.println(num);
             }
                 
             }
             
             System.out.println("1: Find the value of a number squared \n" + "2: Find the value of a number cubed \n" + "3: Find the value of a number, to any power\n" +"4: Exit");
             System.out.print("Enter Your Decision: ");
             i = scan.nextInt();
           }
        }
 
}

    }
    

