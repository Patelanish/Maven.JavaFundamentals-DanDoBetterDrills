package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {

        String Hey = "Hello World";
        return Hey;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){

        String S = firstSegment.concat(secondSegment);
        return S;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){

        String S = (firstSegment + secondSegment);
        return S;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){

        String firstthree = input.substring(0,3 );

        return firstthree;
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){

        String lastthree = input.substring((input.length() -3), (input.length()));
        return lastthree;
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue){

        boolean Equal = inputValue.equalsIgnoreCase(comparableValue);
        return Equal;
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue){

        int charlocation = (inputValue.length() - 1) / 2;
        char midchar = inputValue.charAt(charlocation);
        return midchar;
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){

        int firstLetter = spaceDelimitedString.indexOf(" ");
        String firstword = spaceDelimitedString.substring(0, firstLetter);
        return firstword;
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){


        String arr[] = spaceDelimitedString.split(" ", 2);
        String secondWord = arr[1];
        return secondWord ;
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){

        StringBuilder reverseStringBuilder = new StringBuilder(stringToReverse);
        String reverse = reverseStringBuilder.reverse().toString();
        return reverse;
    }
}
