/**
 * A library of string functions.
 */
public class MyString {
    public static void main(String args[]) {
        String hello = "hello";
        System.out.println(countChar(hello, 'h'));
        System.out.println(countChar(hello, 'l'));
        System.out.println(countChar(hello, 'z'));
        System.out.println(spacedString(hello));
        System.out.println(countChar("",'a'));
        System.out.println(countChar("aaa",'a'));
        System.out.println(subsetOf("sap","space"));
        System.out.println(subsetOf("spa","space"));
        System.out.println(subsetOf("pass","space"));
        System.out.println(subsetOf("c","space"));
        System.out.println(subsetOf(" "," "));
        System.out.println(spacedString("silent"));
        System.out.println(spacedString("a"));
        System.out.println(spacedString(" "));
        System.out.println(spacedString("hi"));
        System.out.println(randomStringOfLetters(5));
        System.out.println(randomStringOfLetters(10));
        System.out.println(randomStringOfLetters(0));
        System.out.println(remove("meet","committee"));
        System.out.println(remove("abc","abc"));
        System.out.println(remove("b","abc"));
        System.out.println(remove("","hello"));
        //// Put your other tests here.
    }

    /**
     * Returns the number of times the given character appears in the given string.
     * Example: countChar("Center",'e') returns 2 and countChar("Center",'c') returns 0. 
     * 
     * @param str - a string
     * @param c - a character
     * @return the number of times c appears in str
     */
    public static int countChar(String str, char ch) {
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)== ch)
            count++;   
        }
        return count;
    }

    /** Returns true if str1 is a subset string str2, false otherwise
     *  Examples:
     *  subsetOf("sap","space") returns true
     *  subsetOf("spa","space") returns true
     *  subsetOf("pass","space") returns false
     *  subsetOf("c","space") returns true
     *
     * @param str1 - a string
     * @param str2 - a string
     * @return true is str1 is a subset of str2, false otherwise
     */
    public static boolean subsetOf(String str1, String str2) {
       if(str1.length()>str2.length())return false;
       int count=0;
       for(int i=0;i<str2.length();i++){
        for(int j=0;j<str1.length();j++){
        if(str2.charAt(i)==str1.charAt(j))count++; 
        }
        }
        if(str1.length()==count) return true;
        return false;
    }

    /** Returns a string which is the same as the given string, with a space
     * character inserted after each character in the given string, except
     * for the last character. 
     * Example: spacedString("silent") returns "s i l e n t"
     * 
     * @param str - a string
     * @return a string consisting of the characters of str, separated by spaces.
     */
    public static String spacedString(String str) {
       String space= " ";
       String newString="";
       if(str.equals(""))return newString;
       newString= space+str.charAt(0)+space;
       for (int i = 1; i <str.length(); i++) {
        newString=newString + str.charAt(i)+ space;
       }
        return newString;
    }
  
    /**
     * Returns a string of n lowercase letters, selected randomly from 
     * the English alphabet 'a', 'b', 'c', ..., 'z'. Note that the same
     * letter can be selected more than once.
     * 
     * Example: randomStringOfLetters(3) can return "zoo"
     * 
     * @param n - the number of letter to select
     * @return a randomly generated string, consisting of 'n' lowercase letters
     */
    public static String randomStringOfLetters(int n) {
        String randomStr="";
       for (int i = 0; i <n; i++) {
        int number= (int)(Math.random()*26)+97;
        char c=(char)number;
        randomStr= randomStr+ c; 
       }
        return randomStr;

    }

    /*
     * Returns a string consisting of the string str1, minus all the characters in the
     * string str2. Assumes (without checking) that str2 is a subset of str1.
     * Example: remove("meet","committee") returns "comit" 
     * 
     * @param str1 - a string
     * @param str2 - a string
     * @return a string consisting of str1 minus all the characters of str2
     */

    public static String remove(String str1, String str2) {
        String newStr = ""; 
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i); 
            if (str1.indexOf(c) == -1) { 
                newStr += c;  
            }
        }
        return newStr;
    }

    /**
     * Returns a string consisting of the given string, with the given 
     * character inserted randomly somewhere in the string.
     * For example, insertRandomly("s","cat") can return "scat", or "csat", or "cast", or "cats".  
     * @param ch - a character
     * @param str - a string
     * @return a string consisting of str with ch inserted somewhere
     */
    public static String insertRandomly(char ch, String str) {
         // Generate a random index between 0 and str.length()
         int randomIndex = (int) (Math.random() * (str.length() + 1));
         // Insert the character at the random index
         String result = str.substring(0, randomIndex) + ch + str.substring(randomIndex);
         return result;
    }  
 
}
