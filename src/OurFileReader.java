import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class OurFileReader implements Runnable{
    private String fileName;

    public OurFileReader(int fileNumber) {
        fileName = "./Assets/file_"+(Integer.toString(fileNumber))+".txt";
    }

    @Override
    public void run(){
        try (FileReader fileReader = new FileReader(fileName)){
            Scanner inputScanner = new Scanner(fileReader);
            Calculator.caculateNumberOfLetters(inputScanner);

        }catch (IOException e){
            e.printStackTrace();
        }
        try (FileReader fileReader = new FileReader(fileName)){
            Scanner inputScanner=new Scanner(fileReader);
            Calculator.caculateNumberOfWords(inputScanner);
        }catch (IOException e){
            e.printStackTrace();
        }
        try (FileReader fileReader = new FileReader(fileName)){
            Scanner inputScanner=new Scanner(fileReader);
            Calculator.findTheLongestWord(inputScanner);
        }catch (IOException e){
            e.printStackTrace();
        }
        try (FileReader fileReader = new FileReader(fileName)){
            Scanner inputScanner=new Scanner(fileReader);
            Calculator.findTheShortestWord(inputScanner);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
