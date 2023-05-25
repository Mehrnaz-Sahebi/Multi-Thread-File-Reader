import java.io.FileReader;
import java.util.Scanner;

public class Calculator {
    private static int numberOfWords = 0;
    private static int numberOfLetters = 0;
    private static String longestWord;
    private static String shortestWord;

    public static int getNumberOfWords() {
        return numberOfWords;
    }

    public static int getNumberOfLetters() {
        return numberOfLetters;
    }

    public static String getLongestWord() {
        return longestWord;
    }

    public static String getShortestWord() {
        return shortestWord;
    }

    public synchronized static void caculateNumberOfWords(Scanner inputScanner){
        int currentNumberOfWords = 0;
        while (inputScanner.hasNext()){
            inputScanner.next();
            currentNumberOfWords++;
        }
        numberOfWords+=currentNumberOfWords;
    }

}
