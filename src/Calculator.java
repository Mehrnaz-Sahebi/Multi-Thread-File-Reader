import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    private static int numberOfWords = 0;
    private static int numberOfLetters = 0;
    private static int maxLength = 0;
    private static int minLength = 100;
    private static ArrayList<String> longestWords = new ArrayList<String>();
    private static ArrayList<String> shortestWords = new ArrayList<String>();

    public static int getNumberOfWords() {
        return numberOfWords;
    }

    public static int getNumberOfLetters() {
        return numberOfLetters;
    }

    public static ArrayList<String> getLongestWords() {
        return longestWords;
    }

    public static ArrayList<String> getShortestWords() {
        return shortestWords;
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
    public synchronized static void calculateMaxLength(Scanner inputScanner){
        while (inputScanner.hasNext()){
            String currentWord = inputScanner.next();
            if(currentWord.length()>maxLength){
                maxLength = currentWord.length();
            }
        }
    }
    public synchronized static void findTheLongestWords(Scanner inputScanner){
        while (inputScanner.hasNext()){
            String currentWord = inputScanner.next();
            if(currentWord.length()==maxLength){
                longestWords.add(currentWord);
            }
        }
    }
    public synchronized static void calculateMinLength(Scanner inputScanner){
        while (inputScanner.hasNext()){
            String currentWord = inputScanner.next();
            if(currentWord.length()<minLength){
                minLength = currentWord.length();
            }
        }
    }
    public synchronized static void findTheShortestWords(Scanner inputScanner){
        while (inputScanner.hasNext()){
            String currentWord = inputScanner.next();
            if(currentWord.length()==minLength){
                shortestWords.add(currentWord);
            }
        }
    }

}
