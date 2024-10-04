/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
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
        System.out.println("Your n was "+ name);
        
    
   /** public static void main(String[] args) {
        String name;
        System.out.println("Hello, what's your name?");
        name = InputReader.getString();
        System.out.println("Hello " + name);
    }
    */
    }
}