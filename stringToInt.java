/*
Author: Chris Phillips
Date: 9/20/21
*/

class stringToInt{

  
   public int convertString(String input){
      
      int result = 0;
      int i = 0;
      boolean isNeg = false;
      
      //check if number is negative
      if(input.charAt(0) == '-'){
         isNeg = true;
         i = 1; //skip to next character
      }
      
      while(i < input.length()){
         //check to see if the character is a number or something else
         if(Character.isDigit(input.charAt(i))){ 
            result *= 10;
            result += (input.charAt(i++) - 48); //subtract 48 to convert from ascii
         }else 
            return -1; //an invalid number was found
    
      }      
       
      if(isNeg)
         result = -result;  
      
      return result;
   }


   public static void main(String args[])
   {
      
      stringToInt tester = new stringToInt();
      String testNum = "8451612";
      int convertedString = tester.convertString(testNum);
      
      if(convertedString != -1)
         System.out.println("The string you entered is equal to int: "+convertedString);
      else
         System.out.println("You did not enter a valid number.");
   
   
   }



}