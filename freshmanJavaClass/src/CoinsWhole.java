import java.util.*;

public class CoinsWhole{
  public static final Scanner scanCoin=new Scanner(System.in);//Defines class constant for input
  public static void main(String[] args){
    String[][] supportedMons= {
      {"pennies","nickles","dimes","quarters"},
      {"1","5","10","25"}};//array of supported money
    monsHav(supportedMons,scanCoin);//calls monsHav method and inputs supportedMons array, users answer to convert coins dollars
    reversMonsHav(supportedMons,scanCoin);//Calls reversMonsHav method and inputs supportedMons array, users answer to convert coins dollars
  }
  public static void monsHav(String[][] array, Scanner scaCoin){
    float dollars=0;//defines dollars to 0.0 as a staring point
    for(int i=0; i<4;i++){//for loop cycles 4 times
      System.out.print("How many "+array[0][i]+" do you have?");//cycles through array to ask user for each coin
      int userAns=scaCoin.nextInt();//stores users answer in an integer
      System.out.println("You have "+userAns+" "+array[0][i]+".");//shows user answer to user
      float mons=Float.parseFloat(array[1][i]);//parses string to float
      dollars =dollars+userAns*mons;//updates the amount of money
    }
    System.out.println("You have $"+dollars+".");//shows user answer after loop
  }
  
  public static void reversMonsHav(String[][] array,Scanner scaCoin){
    System.out.print("How much money would you like to convert into coins?(Type whole number)");//askss user to input
    int userAns=scaCoin.nextInt();//stores users answer 
    int coins =0;//sets coins to 0.0
    System.out.print("That would make ");//prints beginning of answer
    if(userAns==0){
      System.out.print("nothing ;)");//special message
    }
    for(int i=-3; i<=0;i++){//cycles up to 0 for the array to cycle correctly
      int newMons=Integer.parseInt(array[1][-i]);//parses array to double 
      coins=userAns/newMons;//sets the division between user answer to coins in a decimal
      String coma=", ";//sets coma to coma
      if(coins!=0){//checks to see if any coins go into user answer                                                                                     
        if(i==0||userAns%newMons==0){//checks to see if its the end
          coma=".";//sets coma to a period
        }
        userAns=userAns-(coins*newMons);//updates user answer
        System.out.print(coins+" "+array[0][-i]+coma);//adds conversion answer to the print statement
      }
    }
  }
}