
/**
 * Write a description of class Scrabble here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;
public class Main
{
    /**
     * Counts the number of lines for the given file
     */
    public static int countLines(String filename)
    {
        int count = 0;
        // to be completed
        return count;
    }

    /*
     * Read all the words in the given file and return them
     * in a String array.
     * Uses countLines to figure out the how big the array
     * of words has to be
     */
    public static String[] readWordList(String filename)
    {
        String words[] = { "ab", "abb", "abe", "bee", "car" };
        // to be completed -- also need to change how words[] is declared
        return words;
    }

    /*
     * Gets a String from user via keyboard representing the Scrabble tiles
     * The String has to be all lowercase and needs to have 7 letters
     * Steps to compare:
     * 1. input's length is 7
     * 2. input is in lowercase
     * 3. input is in range a-z
     * NOTE: do not use a loop to retake new input from user
     */
        // outputs for this method
        // System.out.println("Enter your tiles: ");
        // System.out.println("Input has " + 0 + " characters, need 7"); // need to replace 0 with actual input's length
        // System.out.println("Input needs to be all lowercase: " + input); // variable input is the input from user
        // System.out.println("Need characters a-z, not: " + input); // variable input is the input from user
    public static String getUserTiles()
    {
        // to be completed -- input from keyboard
        return "abafger";
    }

    /*
     * Creates a histogram for the given string
     * Histogram shows how many times each letter appears in string
     * The histogram is always an integer array with length 26 where
     * histogram[0] represents how many times 'a' appears
     * histogram[1] represents how many times 'b' appears
     * ...
     * histogram[25] represents how many times 'z' appears
     * The histogram for "age" would be
     * { 1,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 }
     * The histogram for "azzz" would be
     * { 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3 }
     */
    public static int[] getHistogram(String str)
    {
        // System.out.println("Getting histogram for " + str);
        int histogram[] = new int[26];
        // to be completed
        return histogram;
    }

    /*
     * Given two histograms representing user tiles and dictionary word
     * return true if the dictionary word can be formed from the tiles
     * For each letter in wordHistogram, we need to have at least that many tiles
     * tileHistogram and wordHistogram are both length 26
     * For example, given tileHistogram "abe"
     * { 1,1,0,0,1,0, ... }
     * We can form the word "ab" which has a histogram of
     * { 1,1,0,0,0,0, ... }
     * But we cannot form the word "abb" which has a histogram of
     * { 1,2,0,0,0,0, ... }
     */
    public static boolean canMakeWord(int[] tileHistogram, int[] wordHistogram)
    {
        // to be completed
        return true;
    }

    /*
     * Read the Scrabble dictionary
     * Get user tiles (7 characters long)
     * Find and print all the words that can be made from the given tiles
     */
    public static void findWords()
    {
        String wordFile = "smalllist.txt";
        String dictWords[] = readWordList(wordFile);
        String mytiles = getUserTiles();
        // make sure we have 7 tiles
        assert(mytiles.length() == 7);
        // make sure we have all lowercase tiles
        assert(mytiles.toLowerCase().equals(mytiles));
        int myhistogram[] = getHistogram(mytiles);
        int count = 0;
        for (int i = 0; i < dictWords.length; i++)
        {
            int wordH[] = getHistogram(dictWords[i]);
            // System.out.println("Checking " + dictWords[i]);
            if (canMakeWord(myhistogram, wordH))
            {
                count++;
                System.out.println(count + ": " + dictWords[i]);
            }
        }
        System.out.printf("Found %d words that can be made from %s.\n", count, mytiles);
    }

    public static void main(String[] args)
    {
        findWords();
    }
}
