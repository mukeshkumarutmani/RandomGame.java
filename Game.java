import java.util.Random;
import java.util.Scanner;
class Game 
{             
    public static void main(String [] args)
    {     
        Scanner inputuser=new Scanner(System.in);
        System.out.println("input your number ");
        int input=inputuser.nextInt();
        
        Random numb = new Random();  
        int computerInput = numb.nextInt(3);
                                        
        if(input==computerInput){
            System.out.println("draw");
        }                                 
        else if(input==0 && computerInput ==1 || input==1 && computerInput==0 || input==2 && computerInput==0)
        { System.out.println(" YOU WIN");
            }
            else
            System.out.println("you lose"); 
            System.out.println(" The computer input is "+computerInput);  
            if(computerInput==0)
            { System.out.println("Rock");
                
            }  
            else if(computerInput==1){
            System.out.println("Paper");
            } 
            else{
                System.out.println("Scissor");
            }

    }
}