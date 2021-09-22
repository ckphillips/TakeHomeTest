/*
Author: Chris Phillips
Date: 9/20/21
*/

class integerPresent{

  
   public boolean checkString(String input){
      
      
     for(int i = 0; i < input.length(); i++){
         if(Character.isDigit(input.charAt(i)))
            return true;
     }
       
      return false;
      
      
   }


   public static void main(String args[])
   {
      
      integerPresent tester = new integerPresent();
      String testValue = "This Is A Test4me";
      
      
      if(tester.checkString(testValue))
         System.out.println("The string you entered contains a number.");
      else
         System.out.println("The string you entered does not contain a number.");
   
   
   }



}