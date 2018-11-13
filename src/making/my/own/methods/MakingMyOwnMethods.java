/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package making.my.own.methods;
import java.util.Scanner;
/**
 *
 * @author aamir7110
 */
public class MakingMyOwnMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //make the scanner
        Scanner keyedInput = new Scanner(System.in);
        //variable declaration
        int choice;
        //promt the user to choose a calculation
        System.out.println("Choose Which Calculation You Want To Do");
        
        System.out.println("1. Find The Area of A Rectangle");
        System.out.println("2. Find The Average Of 5 Numbers");
        System.out.println("3. Find The Diameter Of A Circle");
        System.out.println("4. Find The Lenght Of The Hypotenuse In A Triangle");
        System.out.println("5. Find The Power Of One Number To Another");
        
        choice = keyedInput.nextInt();
        //if choice is selected run a subroutine
        if(choice ==1){
            areaAndOut();
        }
        else if(choice ==2){
            averageAndOut();
        }
        else if(choice ==3){
            diameterAndOut();
        }
        else if(choice ==4){
            hypotAndOut();
        }
        else if(choice ==5){
            powAndOut();
        }
        
    }
    
    public static void areaAndOut (){
       //variable declaration
        double length,width,area;
        
        Scanner keyedInput = new Scanner(System.in);
        //promts user to enter 2 numbers
        System.out.println("Enter The Length");
        length = keyedInput.nextDouble();
        
        System.out.println("Enter The Width");
        width = keyedInput.nextDouble();
        // does math
        area = length*width;
        //prints answer
        System.out.println("The Area Is "+area+" Cm Squared");
    }
    public static void averageAndOut() {
    //variable declaration
        int num1,num2,num3,num4,num5,average,sum;
        
        Scanner keyedInput = new Scanner(System.in);
        //promts user to enter 5 numbers
        System.out.println("Enter In 5 Numbers To Average");
        
        num1 = keyedInput.nextInt();
        num2 = keyedInput.nextInt();
        num3 = keyedInput.nextInt();
        num4 = keyedInput.nextInt();
        num5 = keyedInput.nextInt();
        //adds together
        sum = num1+num2+num3+num4+num5;
        //divides sum
        average = sum/5;
        //multiplies average
        average = average*100;
        //prints answer
        System.out.println("The Average is "+average);
        
    }
    public static void diameterAndOut(){
        //variable declaration
        double radius;
        
        Scanner keyedInput = new Scanner(System.in);
        //promts user to enter radius
        System.out.println("Enter The Radius Of The Circle");
        
        radius = keyedInput.nextDouble();
        //does math
        radius = radius * 2;
        //prints diameter
        System.out.println("The Diameter Is "+radius);
        
        
    }
    public static void hypotAndOut(){
        //variable declaration
        double sideA,sideB,hypot;
        
        Scanner keyedInput = new Scanner(System.in);
        //promts user to enter side lengths
        System.out.println("Enter The Length of Side A");
        
        sideA = keyedInput.nextDouble();
        
        System.out.println("Enter The Length Of Side B");
        
        sideB = keyedInput.nextDouble();
        //prints hypotenuse
        System.out.println("The Hypotenuse Is "+Math.hypot(sideA, sideB));
    }
    public static void powAndOut(){
        //variable declaration
        double num1,num2;
        
        Scanner keyedInput = new Scanner (System.in);
        //promts user to enter num1 and num2
        System.out.println("Enter The First Number");
        num1 = keyedInput.nextDouble();
        
        
        System.out.println("Enter The Second Number");
        num2 = keyedInput.nextDouble();
        //prints the power of the numbers
        System.out.println("The Power Is "+Math.pow(num1, num2));
        
    }
}
