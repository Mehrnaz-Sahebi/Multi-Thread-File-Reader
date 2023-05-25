import java.io.FileReader;
import java.io.IOException;

public class OurFileReader implements Runnable{
    private String fileName;

    public OurFileReader(int fileNumber) {
        fileName = "./Assets/file_"+(Integer.toString(fileNumber));
    }

    @Override
    public void run(){
        try (FileReader fileReader = new FileReader(fileName)){

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
