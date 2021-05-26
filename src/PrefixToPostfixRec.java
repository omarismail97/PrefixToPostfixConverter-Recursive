/*
   Data Structures Lab 2 
   @author: Omar Ismail
   3/15/21
*/
// Driver code 
public class PrefixToPostfixRec 
{   

    /* 
      -converting recursively main code
      -if the length is less than or equal to 1, we are done
      -if the first character in the string is not a letter,
         stores the first recursed expression in op1 and last letter in op2
         then returns all them in one expression
    */
     public String convertRecursive(String prefix){
        if(prefix.length() <= 1){
            return prefix;
        }

        if(!Character.isLetter(prefix.charAt(0))){
            String op1 = convertRecursive(prefix.substring(1)) + prefix.charAt(0);
            String op2 = convertRecursive(prefix.substring(op1.length()));
            return op1 + op2;
        }
        else if(!Character.isLetter(prefix.charAt(1))){
            return prefix.substring(0,1);
        }
        else{
            return prefix.substring(0,2);
        }
 
    } 
     //cases used to determine if character is operand or operator for error codes
      public boolean isOperator(char c){
        switch (c){
            case '-':
            case '+':
            case '/':
            case '*':
            case '$':
            return true;
        }
        return false;
    }
 

}
