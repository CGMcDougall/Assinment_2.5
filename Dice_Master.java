import java.util.Scanner;

public class Dice_Master
{
   
    
    public static void String(String[] args){
     Scanner Sc = new Scanner(System.in);
     
     System.out.println("Dice Master!");
     System.out.println("---------------");
     System.out.println("");
     String YN = "y";
     int Total = 0;
     
     while("y".equals(YN)){
         System.out.println("how many dice do you wish to roll?");
         int x = Sc.nextInt();
         System.out.println("How many Sides?");
         int Dice = Sc.nextInt();
         System.out.println("you rolled a: ");
         int total = 0;
         for(int i = 0; i < x; i++){ 
         int Roll = Diceroll(Dice);
          System.out.println(Roll);
          total = total + Roll;
            }
            System.out.println("");
            System.out.println("your total is "+total);
         System.out.println("Do you wish to Repeat this? [y,n]");
         System.out.println("");
         YN = Sc.nextLine();
          YN = Sc.nextLine();
        }
     if("n".equals(YN)) System.out.println("Bye");
     else  System.out.println("What are you, dyslexic?");
    }
        public static int Diceroll(int Dice){
                double z = (Math.random()*Dice)+1;
            int x = (int)z;
            System.out.print(" ");
            //System.out.print(x);
      
            return x;
        }
        
    }
    
    