public class Main {
  public static void main(String[] args) {
    
    System.out.println(searchForPalindromicNum(72927));

  }

  public static int searchForPalindromicNum(int num){
    boolean found = false;
    int counter = num;

    while(!found){
      counter++;
      if(testPalindromicNum(counter)){
        found = true;
      }
    }

    return counter - num;
  }

  public static boolean testPalindromicNum(int num){
    //test for equality
    String reversedNum = reverseNum(num);
    Integer convertBackToInteger = Integer.parseInt(reversedNum);

    return convertBackToInteger == num;

  }

  public static String reverseNum(int num){
    // return reversed number as string
    String convertedNum = Integer.toString(num);

    String reversed = "";

    for(int i = convertedNum.length()-1; i >= 0; i--){
      reversed += convertedNum.substring(i, i+1);
    }

    return reversed;

  }
}