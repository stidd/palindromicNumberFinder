public class PalindromicNumberFinder {
    private String num;
    private int nextPalindrome;

    public PalindromicNumberFinder(String num){
        this.num = num;
    }

    public int getNum(){
        return Integer.parseInt(this.num);
    }

    // return palindrome
    public int searchForPalindromicNum(String num){
        Integer parsedNum = Integer.parseInt(num);
        parsedNum++;
        while(!testPalindromicNum(parsedNum)){
            parsedNum++;
        }
        this.nextPalindrome = parsedNum;

        return parsedNum;
    }

    public boolean testPalindromicNum(int num){
        //test for equality
        String reversedNum = reverseNum(num);
        Integer convertBackToInteger = Integer.parseInt(reversedNum);

        return convertBackToInteger == num;

    }

    public String reverseNum(int num){
        // return reversed number as string
        String convertedNum = Integer.toString(num);

        String reversed = "";

        for(int i = convertedNum.length()-1; i >= 0; i--){
            reversed += convertedNum.substring(i, i+1);
        }

        return reversed;

    }


    @Override
    //returns the difference and the palindrome
    public String toString(){
        return "You'd have to drive " + (searchForPalindromicNum(this.num) - this.getNum()) + " miles to reach the next palindrome: " + this.nextPalindrome;
    }
}
