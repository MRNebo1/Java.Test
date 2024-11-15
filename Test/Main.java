public class Main {
    public static void main(String[] args) {
        // Check if numbers are prime
        int[] testNumbers = {7, 13, 16, 23, 100};
        for (int num : testNumbers) {
            System.out.println(num + " is a prime number: " + NumberStringUtils.isPrime(num));
        }

        // Test for Palindrome
        String[] testStrings = {
            "mum",
            "Was it a car or a cat I saw",
            "martin",
            null
        };
        
        for (String str :  testStrings) {
            System.out.println("\"" + str + "\" is a palindrome: " + NumberStringUtils.isPalindrome(str));
        }
    }
}
