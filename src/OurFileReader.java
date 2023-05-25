public class OurFileReader implements Runnable{
    private String fileName;

    public OurFileReader(int fileNumber) {
        fileName = new StringBuilder("file_"+(Integer.toString(fileNumber))).toString();
    }

    @Override
    public void run(){

    }
}
