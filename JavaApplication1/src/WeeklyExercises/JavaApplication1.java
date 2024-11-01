/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package WeeklyExercises;
import java.util.Scanner;


/**
 *
 * @author dmellor
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        //Exercise One
        System.out.println("Hello World");
    
    
        //Exercise Two 
        Scanner reader = new Scanner(System.in);
        System.out.println("What is your name");
        String name=reader.nextLine();
        System.out.println("Your name is "+ name);
        
        //Exercise Three
        int length, height;
        System.out.println("Enter Length: ");
        name=reader.nextLine();
        length=Integer.parseInt(name);
        System.out.println("Enter Height: ");
        name=reader.nextLine();
        height=Integer.parseInt(name);
        System.out.println("Perimeter="+(length+length+height+height));
        System.out.println("Area="+(length*height));
        
        
        //Exercise 4
        float num1, num2;
        System.out.println("Enter number 1:");
        name=reader.nextLine();
        num1=Float.parseFloat(name);
        System.out.println("Enter number 2:");
        name=reader.nextLine();
        num2=Float.parseFloat(name);
        System.out.println("Average of numbers is: "+((num1+num2)/2));
    
   /** public static void main(String[] args) {
        String name;
        System.out.println("Hello, what's your name?");
        name = InputReader.getString();
        System.out.println("Hello " + name);
    }
    */
    }
}