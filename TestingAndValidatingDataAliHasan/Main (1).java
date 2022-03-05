/*
* File Name: Main.java
* Author: Aseef Ali Hasan
* Date: August 23, 2021
* Description:
* This program validates user data to perfrom tasks
* It takes user data and checks if it meets the requirements
* If requirements are met it moves to the next question 
* All calculations are performed in seperate methods
* Methods return booleans to main method 
* All information is displayed through text
*/

//needed for user input via keyboard
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Variable declaration and initilization
        //Stores constant string of congratulatory message
        final String PASSED = "Congradualtions, you passed!";
        //Stores boolean of if questions are passed 
        boolean passedOne;
        boolean passedTwo;
        boolean passedThree;
        boolean passedFour;
        boolean passedFive;
        boolean passedSix;
        
        //Shows stage one question and validates answer
        //Stores returned boolean in variable
        passedOne = stageOne();
        //Continues to next question if answer was correct
        if (passedOne == true)
        {
          //Shows stage 2 question and validates answer
          //Stores returned boolean in variable
           passedTwo = stageTwo(); 
           //Continues to next question if answer was correct
           if (passedTwo == true)
           {  
              //Shows stage 3 question and validates answer
              //Stores returned boolean in variable
               passedThree = stageThree();
               //Continues to next question if answer was correct
               if (passedThree == true)
               {
                  //Shows stage 4 question and validates answer
                  //Stores returned boolean in variable
                   passedFour = stageFour();
                   //Continues to next question if answer was correct
                   if (passedFour == true)
                   {
                      //Shows stage 5 question and validates answer
                      //Stores retured boolean in variable 
                       passedFive = stageFive();
                       //Continues to next question if answer was correct
                       if (passedFive == true)
                       {  
                          //Shows stage 5 question and validates answer
                          //Stores returned boolean in variable
                           passedSix = stageSix();
                           //Continues if answer was correct
                           if (passedSix == true)
                           {  
                              //Shows user a congratulatory message
                               System.out.println(PASSED);
                           }
                           //Wrong answers are dealt with in methods
                           else
                           {
                               //Do nothing
                           }
                       }
                       //Wrong answers are dealt with in methods 
                       else
                       {
                           //Do nothing 
                       }
                   }
                   //Wrong answers are dealt with in methods 
                   else
                   {
                       //Do nothing
                   }
               }
               //Wrong answers are dealt with in methods 
               else
               {
                   //Do nothing
               }
           }
           //Wrong answers are dealt with in methods 
           else
           {
               //Do nothing
           }
        }
        //Wrong answers are dealt with in methods 
        else
        {
            //Do nothing
        }
    }//End of main method 
    
  /**
   * method name: stageOne
   *
   * Author: Aseef Ali Hasan
   *
   * Date: August 20 2021
   *
   * Version: 1.0
   *
   * Change log: none
   *
   * Description:
   * This method shows user the first question
   * It validates the answer
   * Question is looped upto 3 times if answer is wrong
   * Asks user for a string that is greater than 6 characters long.
   *
   * Parameters: none
   *
   * Return: boolean valid: determines if user gets question correct
   */
    public static boolean stageOne()
    { 
        //Scanner is called keyedInput and initliazed
        Scanner keyedInput = new Scanner(System.in);
        //Sets counter at 0
        int counter = 0;
        //Sets valid boolean at false
        boolean valid = false;
        //Stores string of user's input 
        String stageOneInput;
       
       //Will continue to run until user get question right
       //or gets it wrong 3 times 
        while (valid == false && counter < 3) 
        {
            //Prints question
            System.out.print("Please enter text that is greater than 6 characters long: ");
            //Stores answer
            stageOneInput = keyedInput.nextLine();

            //Actions if answer is correct
            if (stageOneInput.length() > 6) 
            {
                //boolean is set to true to move on
                valid = true;
                //Shows confirmation message
                System.out.println("Your input was greater than 6 characters!");
            } 
            //Actions if answer was incorrect
            else 
            {
                //Shows response to incorrect answer
                System.out.println("That was LESS than 6 characters!");
                //Adds to the counter
                counter++;
            }
        }
        //When counter reaches 3 the program ends
        if (counter == 3)
        {
            //Tells they got 3 wrong answers
            System.out.println("That was 3 invalid inputs. Try again next time.");
            //Closes input via keyboard
            keyedInput.close();
        }
        else
        {
            //Do nothing
        }
        //Returns boolean to determines if user gets question correct 
        return(valid);
    }//End of stageOne method 
    
  /**
   * method name: stageTwo
   *
   * Author: Aseef Ali Hasan
   *
   * Date: August 20 2021
   *
   * Version: 1.0
   *
   * Change log: none
   *
   * Description:
   * This method shows user the 2nd question
   * It validates the answer
   * Question is looped upto 3 times if answer is wrong
   * Asks user for a string that contains at least one lowercase “a”
   *
   * Parameters: none
   *
   * Return: boolean valid: determines if user gets question correct
   */
    public static boolean stageTwo()
    {
        //Scanner is called keyedInput and initliazed
        Scanner keyedInput = new Scanner (System.in);
        //Sets counter at 0
        int counter = 0;
        //Sets boolean to false
        boolean valid = false;
        //String to hold user's answer
        String stageTwoInput;
        
        //Will continue to run until user get question right
        //or gets it wrong 3 times 
        while (valid == false && counter < 3) 
        {
            //Prints question
            System.out.print("Please enter text that contains the letter \"a\": ");
            //Stores answer
            stageTwoInput = keyedInput.nextLine();

            //Actions if answer is correct
            if (stageTwoInput.contains("a")) 
            {
                //boolean is set to true to move on 
                valid = true;
                //Shows confirmation message
                System.out.println("Your input contained \"a\"!");
            } 
            //Actions if answer was incorrect
            else 
            {
                //Shows clraification message
                System.out.println("That was did not contain \"a\"");
                //Increases counter 
                counter++;
            }
        }
        //When counter reaches 3 the program ends 
        if (counter == 3)
        {
            //Tells user they got 3 wrong answers
            System.out.println("That was 3 invalid inputs. Try again next time.");
            //Closes input via keyboard
            keyedInput.close();
        }
        else
        {
            //Do nothing
        } 
        //Returns boolean that determines if user gets question correct      
        return(valid);
    }//End of stageTwo method 
    
    /**
   * method name: stageThree
   *
   * Author: Aseef Ali Hasan
   *
   * Date: August 20 2021
   *
   * Version: 1.0
   *
   * Change log: none
   *
   * Description:
   * This method shows user the 3rd question
   * It validates the answer
   * Question is looped upto 3 times if answer is wrong
   * Asks user for a string that is between 5 and 15 characters long
   * and does not contain the letter “z”
   *
   * Parameters: none
   *
   * Return: boolean valid: determines if user gets question correct
   */
    public static boolean stageThree()
    {
        //Scanner is called keyedInput and initliazed
        Scanner keyedInput = new Scanner (System.in);
        //Sets counter to 0
        int counter = 0;
        //Lets boolean to false
        boolean valid = false;
        //String to store user's answer
        String stageThreeInput;
        
        //Will continue to run until user get question right
        //or gets it wrong 3 times 
        while (valid == false && counter < 3) 
        {
            //Shows question
            System.out.print("Please enter text that between 5 and 15 characters long and "
                            + "doesn't contain the letter \"z\": ");
            //Stores answer
            stageThreeInput = keyedInput.nextLine();

            //Actions if user gets question correct
            if (!stageThreeInput.contains("z") && stageThreeInput.length() > 5 
                && stageThreeInput.length() < 15) 
            {
                //boolean is set to true to move on 
                valid = true;
                //Shows confirmation message 
                System.out.println("That was a valid input!");
            } 
            //Actions if user gets question incorrect
            else 
            {
                //Shows clarification message
                System.out.println("That was an invalid input");
                //Increases counter
                counter++;
            }
        }
        //Program ends if user gets question wrong three times 
        if (counter == 3)
        {
            //Tells user they got the question wrong 3 times 
            System.out.println("That was 3 invalid inputs. Try again next time.");
            //Closes input via keyboard
            keyedInput.close();
        }
        else
        {
            //Do nothing
        } 
        //Returns boolean that determines if user gets question correct    
        return(valid);
    }//End of stageThree method 
    
    /**
   * method name: stageFour 
   *
   * Author: Aseef Ali Hasan
   *
   * Date: August 20 2021
   *
   * Version: 1.0
   *
   * Change log: 8/20/2021 --> added try catch function to 
   * deal with NumberFormatExceptions
   *
   * Description:
   * This method shows user the 4th question
   * It validates the answer
   * Question is looped upto 3 times if answer is wrong
   * Asks user for an integer between 5 and 500.
   *
   * Parameters: none
   *
   * Return: boolean valid: determines if user gets question correct
   */
    public static boolean stageFour()
    {
        //Scanner is called keyedInput and initliazed
        Scanner keyedInput = new Scanner (System.in);
        //Sets counter to 0 
        int counter = 0;
        //Sets boolean to false
        boolean valid = false;
        //Stores integer value of user's input
        int stageFourInput;
        //Stores string value of user's input 
        String tempString;
        
        //Will continue to run until user get question right
       //or gets it wrong 3 times 
        while (valid == false && counter < 3) 
        {
            //Asks question
            System.out.print("Please enter an integer between 5 and 500: ");
            //Stores answer as as string 
            tempString = keyedInput.nextLine();
            
            //Trys to validate answer if input was an integer
            try
            {
                //Converts string answer to integer and storese it 
                stageFourInput = Integer.parseInt(tempString);
                //Actions if answer was correct
                if (stageFourInput >= 5 && stageFourInput <= 500) 
                { 
                    //Boolean set to true to move on
                    valid = true;
                    //Shows confirmation message
                    System.out.println("That was a valid input!");
                } 
                //Actions if answer was correct
                else 
                {
                    //Shows clarification message 
                    System.out.println("That was an invalid input");
                    //Counter is increased 
                    counter++;
                }
            }
            //Catches any NumberFormatExceptions 
            catch(NumberFormatException e)
            {
              //Shows a clarification message 
               System.out.println("That was an invalid input");
               //Increases counter 
               counter++; 
            }   
        } 
        //Program ends if user inputs 3 incorrect answers
        if (counter == 3)
        {
            //Tells user that they inputted 3 incorrect answers
            System.out.println("That was 3 invalid inputs. Try again next time.");
            //Closes input via keyboard
            keyedInput.close();
        }
        else
        {
            //Do nothing
        } 
        //Returns boolean that determines if user gets question correct
        return(valid);
    }//End of stageFour method 
    
  /**
   * method name: stageFive 
   *
   * Author: Aseef Ali Hasan
   *
   * Date: August 20 2021
   *
   * Version: 1.0
   *
   * Change log: 8/20/2021 --> added try catch function to 
   * deal with NumberFormatExceptions
   *
   * Description:
   * This method shows user the 5th question
   * It validates the answer
   * Question is looped upto 3 times if answer is wrong
   * Asks user for a negative integer 
   *
   * Parameters: none
   *
   * Return: boolean valid: determines if user gets question correct
   */
    public static boolean stageFive()
    {
        //Scanner is called keyedInput and initliazed
        Scanner keyedInput = new Scanner (System.in);
        //Sets counter to 0
        int counter = 0;
        //Sets boolean to false
        boolean valid = false;
        //Stores answer as integer
        int stageFiveInput;
        //Stores answer as string 
        String tempString;
        
        //Will continue to run until user get question right
        //or gets it wrong 3 times 
        while (valid == false && counter < 3) 
        {
            //Shows answer 
            System.out.print("Please enter a negative integer: ");
            //Stores answer as string 
            tempString = keyedInput.nextLine();
            
            //Tries to validate answer if it was an integer 
            try
            {
                //Stores answer as integer
                stageFiveInput = Integer.parseInt(tempString);
                //Actions if user got question correct
                if (stageFiveInput < 0) 
                {
                  //Sets boolean to true to move on
                  valid = true;
                  //Shows confirmation message
                  System.out.println("That was a negative integer!");
                } 
                //Actions if user got question incorrect
                else 
                {
                  //Shows clarification message
                  System.out.println("That was an invalid input. It was positive.");
                  //Increases counter 
                  counter++;
                }
            }
            //catches NumberFormatExceptions 
            catch(NumberFormatException e)
            {
              //Shows clarification message
              System.out.println("That was an invalid input");
              //Increases counter
              counter++; 
            }
        }
        //Program ends when user inputs incorrect answer 3 times
        if (counter == 3)
        {
          //Tells user the program ends when they input incorrect answer 3 times 
          System.out.println("That was 3 invalid inputs. Try again next time.");
          //Closes input via keyboard
          keyedInput.close();
        }
        else
        {
          //Do nothing
        } 

        //Returns boolean that determines if user gets question correct      
        return(valid);
    }//End of stageFive method 
    
     /**
   * method name: stageFour 
   *
   * Author: Aseef Ali Hasan
   *
   * Date: August 20 2021
   *
   * Version: 1.0
   *
   * Change log: 8/20/2021 --> added try catch function to 
   * deal with NumberFormatExceptions
   *
   * Description:
   * This method shows user the 6th question
   * It validates the answer
   * Question is looped upto 3 times if answer is wrong
   * Asks user for a positive, odd integer
   *
   * Parameters: none
   *
   * Return: boolean valid: determines if user gets question correct
   */
    public static boolean stageSix()
    {
        //Scanner is called keyedInput and initliazed
        Scanner keyedInput = new Scanner(System.in);
        //Sets boolean to false
        boolean valid = false;
        //Sets counter to 0
        int counter = 0;
        //Stores remainder for modulus calculation
        int remainder;
        //Stores answer as integer
        int stageSixInput;
        //Stores answer as string 
        String tempString;
        
        //Will continue to run until user get question right
       //or gets it wrong 3 times 
        while (valid == false && counter < 3) 
        {
            //Shows question 
            System.out.print("Please enter a positive, odd integer: ");
            //Stores answer as string 
            tempString = keyedInput.nextLine();

            //Tries to validate answer if user inputs an integer
            try
            {
              //Stores answer as integer 
              stageSixInput = Integer.parseInt(tempString);
              //Calculates modulus remainder
              remainder = stageSixInput % 2;
              //Actions if user's answer was correct
              if (stageSixInput > 0 && remainder == 1) 
              {
                //Boolean is true to show congradulatory message
                valid = true;
                //Shows confirmation message
                System.out.println("That was a valid input!");
              } 
              //Actions if user gets question wrong 
              else 
              {
                //Shows clarification message 
                System.out.println("That was an invalid input");
                //Increases counter
                counter++;
              }
            }
            //catches any NumberFormatExceptions 
            catch (NumberFormatException e)
            {
              //Shows clarification message 
              System.out.println("That was an invalid input");
              //increases counter
              counter++;
            }
            
        }
        //Program ends if user gets question wrong 3 times 
        if (counter == 3)
        {
          //Tells user they got question wrong three times 
          System.out.println("That was 3 invalid inputs. Try again next time.");
          //Closes input via keyboard
          keyedInput.close();
        }
        else
        {
          //Do nothing
        } 

        //returns boolean that determines if user gets question correct  
        return(valid);
    }//End of stageSix method 
}//End of class method 
