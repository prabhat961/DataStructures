package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;

//Problem Statement:Given an expression string exp, write a program to examine whether the pairs and
//the orders of �{�, �}�, �(�, �)�, �[�, �]� are correct in exp.

//Algorithm: 

//Declare a character stack S.
//Now traverse the expression string exp. 
//If the current character is a starting bracket (�(� or �{� or �[�) then push it to stack.
//If the current character is a closing bracket (�)� or �}� or �]�) then pop from stack and if the
//popped character is the matching starting bracket then fine else brackets are not balanced.
//After complete traversal, if there is some starting bracket left in stack then �not balanced�

public class BalancedParenthesis {
	public static boolean isBalanced(String str) {
		 Deque<Character> stack
         = new ArrayDeque<Character>();

     // Traversing the Expression
     for (int i = 0; i < str.length(); i++)
     {
         char x = str.charAt(i);

         if (x == '(' || x == '[' || x == '{')
         {
             // Push the element in the stack
             stack.push(x);
             continue;
         }

         // If current character is not opening
         // bracket, then it must be closing. So stack
         // cannot be empty at this point.
         if (stack.isEmpty())
             return false;
         char check;
         switch (x) {
         case ')':
             check = stack.pop();
             if (check == '{' || check == '[')
                 return false;
             break;

         case '}':
             check = stack.pop();
             if (check == '(' || check == '[')
                 return false;
             break;

         case ']':
             check = stack.pop();
             if (check == '(' || check == '{')
                 return false;
             break;
         }
     }

     // Check Empty Stack
     return (stack.isEmpty());
	    }
			


	public static void main(String[] args) {
		 String expr = "([{}])";
		 
	        // Function call
	        if (isBalanced(expr))
	            System.out.println("Balanced ");
	        else
	            System.out.println("Not Balanced");

	}

}
