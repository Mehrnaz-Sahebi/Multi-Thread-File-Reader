import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <21 ; i++) {
            OurFileReader ourFileReader = new OurFileReader(i);
            Thread ourThread = new Thread(ourFileReader);
            ourThread.start();
        }
        while (true){
            if(Thread.activeCount()==2&&Thread.currentThread().isAlive()){
                System.out.println(Calculator.getNumberOfWords());
                System.out.println(Calculator.getNumberOfLetters());
                break;
            }
        }



//        int checkNumber = 0;
//        for (int i = 1; i < 21; i++) {
//            try (FileReader fileReader = new FileReader("./Assets/file_"+Integer.toString(i)+".txt")){
//                Scanner scanner = new Scanner(fileReader);
//                while (scanner.hasNext()){
//                    checkNumber+=scanner.next().length();
//                }
//            }
//            catch (IOException e){
//                e.printStackTrace();
//            }
//        }
//        System.out.println(checkNumber);
    }
}
