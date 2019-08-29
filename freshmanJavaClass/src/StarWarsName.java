import java.util.*;

public class StarWarsName{
  
  public static void main(String[] args) {
    //define variables
    String firstName, lastName, motherName, bornWhere,car;
    //define scanner and prompt user
    Scanner scanner =new Scanner(System.in);
    System.out.println("Star Wars Name Generator\nBy: Interco\n");
    System.out.println("Enter your first name:");  
    firstName=scanner.nextLine();//stores value
    System.out.println("Enter your last name:");  
    lastName=scanner.nextLine();
    System.out.println("Enter your mother's maiden name:");  
    motherName=scanner.nextLine();
    System.out.println("Enter the city where you were born:");  
    bornWhere=scanner.nextLine();
    System.out.println("Enter the last car you drove:");  
    car=scanner.nextLine();
    //calls method to return string
    System.out.println(starNameGen(firstName.trim(), lastName.trim(), motherName.trim(), bornWhere.trim(), car.trim()));
  }
  public static String starNameGen(String first, String last, String mom, String born, String car){
    //doubles input for 2 letter names
    first+=first;
    last+=last;
    mom+=mom;
    born+=born; 
    //define string for first name,last name and planet name
    String firstStarName=first.substring(0,3)+last.substring(0,2);
    String lastStarName=mom.substring(0,2)+born.substring(0,3);
    String planetName=last.substring(last.length()-2, last.length())+car;
    return "you are "+firstStarName.toUpperCase()+" "+lastStarName.toUpperCase()+" of "+planetName.toUpperCase();
  }
}
