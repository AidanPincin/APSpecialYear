import java.util.*;
public class APSpecialYear {
    static int year1, year2;
    static Scanner input =  new Scanner(System.in);
    public static boolean isPositive(int year){
        if(year<0){
            return false;
        }
        return true;
    }

    public static boolean isLeapYear(int year){
        return (year%4==0 && year%100 != 0) || year%400 == 0;
    }

    public static boolean isPalindrome(int year){
        String ogYear = ""+year;
        String revYear = "";
        for(int i=0; i<ogYear.length(); i++){
            revYear = ogYear.charAt(i)+revYear;
        }
        return revYear.equals(ogYear);
    }

    public static void numberOfLeapPalin(){
        int numberOfLeapYears = 0;
        int numberOfPalindromeYears = 0;
        int numberOfBoth = 0;
        for(int i=year1; i<=year2; i++){
            if(isLeapYear(i)){
                if(isPalindrome(i)){
                    numberOfBoth++;
                }
                else{
                    numberOfLeapYears++;
                }
            }
            else if(isPalindrome(i)){
                numberOfPalindromeYears++;
            }
        }
        System.out.println("Number of years that are only leap years: "+numberOfLeapYears);
        System.out.println("Number of years that are only palindrome years: "+numberOfPalindromeYears);
        System.out.println("Number of years that are both leap and palindrome years: "+numberOfBoth);
    }

    public static void main(String[] args){
        System.out.println("Enter start year:");
        year1 = input.nextInt();
        System.out.println("Enter end year:");
        year2 = input.nextInt();
        numberOfLeapPalin();

    }
}
