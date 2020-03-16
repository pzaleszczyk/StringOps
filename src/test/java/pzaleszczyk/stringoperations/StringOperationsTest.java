package pzaleszczyk.stringoperations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;



public class StringOperationsTest
{
	StringOperations op;
	
	@Test
    public void testApp()
    {
        assertTrue( true );
    }
	@BeforeEach
	public void setup() {
		op = new StringOperations();
	}
    
	@DisplayName("Concat")
	@ParameterizedTest(name = "Concating {0} + {1} -> {2}.")
	@CsvSource({ 
		"Ro,Fl,RoFl", 
		"T3,4D,T34D", 
		"'Ke ',KW,'Ke KW'",
		".,.,'..'",
		",LOL,",
		"LOL,,LOL",
		"Łał,ŁeŁ,ŁałŁeŁ"
		})
    public void concat(String a, String b, String result) {
    	assertEquals(result,op.concat(a,b));
    }
    
    @DisplayName("Reverse")
    @ParameterizedTest(name = "Reversing {1}.")
    @CsvSource({ 
    	"abc,cba",
    	"1Lol2,2loL1", 
    	"Sp@ecialC1har, rah1Claice@pS",
    	"  as  asd,dsa  sa  ",
    	","
    	})
    public void reverse(String a, String result) {
    	assertEquals(result,op.reverse(a));
    }
    
    
    @DisplayName("Palindrome")
    @ParameterizedTest(name = "Checking if {0} is palindrome.")
    @CsvSource({ 
    	"kobyłamamałybok,true", 
    	"byłamamałyb,true",
    	"test palindrome,false",
    	"devillived,true",
    	"31243!@#$,$#@!34213",
    	",true"
    	})
    public void palindrome(String a, Boolean result) {
    	assertEquals(result,op.isPalindrome(a));
    }
}
