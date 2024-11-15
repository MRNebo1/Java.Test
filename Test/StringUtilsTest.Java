import org.junit.Test;

import com.example.StringUtils;

import static org.junit.Assert.*;

public class import org.junit.Test;

import com.example.StringUtilsTest;

import static org.junit.Assert.*;

public class StringUtilsTest {
    
    @Test
    public void testIsPrime() {
        assertTrue(NumberStringUtils.isPrime(7));
        assertTrue(NumberStringUtils.isPrime(13));
        assertTrue(NumberStringUtils.isPrime(16));
        assertTrue(NumberStringUtils.isPrime(23));
                
        assertFalse(NumberStringUtils.isPrime(100));
      
    }
    
    @Test
    public void testIsPalindrome() {        
        assertTrue(NumberStringUtils.isPalindrome("mum"));
        assertTrue(NumberStringUtils.isPalindrome("Was it a car or a cat I saw"));

        assertFalse(NumberStringUtils.isPalindrome("martin"));
   
        assertFalse(NumberStringUtils.isPalindrome(null));
    }
} 
 
