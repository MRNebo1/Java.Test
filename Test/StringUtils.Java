public class StringUtils {
    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        
        // Convert to lowercase
        String cleanStr = str.replaceAll("\\s+", "").toLowerCase();
        int start = 0;
        int end = cleanStr.length() - 1;
        
        while (start < end) {
            if (cleanStr.charAt(start) != cleanStr.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}



