import java.io.FileReader;
import java.util.Scanner;

public class Calculator {
    private static int numberOfWords = 0;
    private static int numberOfLetters = 0;
    private static int maxLength = 0;
    private static int minLength = 100;
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

    public static int getMaxLength() {
        return maxLength;
    }

    public static int getMinLength() {
        return minLength;
    }

    public synchronized static void caculateNumberOfWords(Scanner inputScanner){
        int currentNumberOfWords = 0;
        while (inputScanner.hasNext()){
            inputScanner.next();
            currentNumberOfWords++;
        }
        numberOfWords+=currentNumberOfWords;
    }
    public synchronized static void caculateNumberOfLetters(Scanner inputScanner){
        int currentNumberOfLetters = 0;
        while (inputScanner.hasNext()){
            currentNumberOfLetters+=inputScanner.next().length();
        }
        numberOfLetters+=currentNumberOfLetters;
    }
    public synchronized static void findTheLongestWord(Scanner inputScanner){
        while (inputScanner.hasNext()){
            String currentWord = inputScanner.next();
            if(currentWord.length()>maxLength){
                maxLength = currentWord.length();
                longestWord = currentWord;
            }
        }
    }
    public synchronized static void findTheShortestWord(Scanner inputScanner){
        while (inputScanner.hasNext()){
            String currentWord = inputScanner.next();
            if(currentWord.length()<minLength){
                minLength = currentWord.length();
                shortestWord = currentWord;
            }
        }
    }

}
