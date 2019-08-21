/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package calculator;

import java.util.Scanner;

/**
 *
 * @author alexchalep
 */
public class SimpleCalculator extends Operations {
    public static void main(String[] args){
        int num1,num2 ;
        String operation;
        
        System.out.println("I am a simple Calculator");
        System.out.println("Enter first number: ");
        
        Scanner inp = new Scanner(System.in);
        num1 = inp.nextInt();
        System.out.println("Enter second number: ");
        num2 = inp.nextInt();
        
        System.out.println("Enter your selection: '+' for addition, '-' for "
                + "substraction, '*' for multiplication and '/' for division:");
        Scanner op = new Scanner(System.in);
        operation = op.next();
        
        switch(operation){
            case "+":
                System.out.println("The result of the addition of "+num1+" and "
                        +num2+" is "+ add(num1,num2)+".");
                break;
            case "-":
                System.out.println("The result of the substraction of "+num1+
                        " and "+num2+" is "+ sub(num1,num2)+".");
                break;
            case "*":
                System.out.println("The result of the multiplication of "+num1+
                        " and "+num2+" is "+ mult(num1,num2)+".");
                break;
            case "/":
                System.out.println("The result of the division of "+num1+" and "
                        +num2+" is "+ div(num1,num2)+".");
                break;
            default:
                System.out.println("Illegal Operation!");
                
                
        }
        
        
    }
    
    
}
