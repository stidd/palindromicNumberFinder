import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("***Insert your car odometer mileage to learn how many miles you'll have to drive until you end up with a palindrome.***");

    System.out.println();
    System.out.println();

    while(true){
      System.out.println("Enter your odometer reading: ");
      String input = scanner.nextLine();

      if(input.equals("q")){
        System.out.println("Seeya next time!");
        break;
      }

      PalindromicNumberFinder test = new PalindromicNumberFinder(input);
      System.out.println(test);

      System.out.println();
      System.out.println("Enter another odometer reading or \"q\"-quit");

    }

  }
}