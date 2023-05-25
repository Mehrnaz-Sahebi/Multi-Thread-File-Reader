
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <21 ; i++) {
            OurFileReader ourFileReader = new OurFileReader(i);
            Thread ourThread = new Thread(ourFileReader);
            ourThread.start();
        }
        while (true){
            if(Thread.activeCount()==2&&Thread.currentThread().isAlive()){
                System.out.println("Words Count: "+ Calculator.getAllWords().size());
                System.out.println();
                System.out.println("All words length average: " + (double)Calculator.getNumberOfLetters() / (double)Calculator.getNumberOfWords());
                System.out.println();
                System.out.printf("Longest words which have the length %d:\n",Calculator.getMaxLength());
                for (String str:Calculator.getLongestWords()) {
                    if(str.length()==Calculator.getMaxLength()){
                        System.out.println(str);
                    }
                }
                System.out.println();
                System.out.printf("Shortest words which have the length %d:\n",Calculator.getMinLength());
                for (String str:Calculator.getShortestWords()) {
                    if(str.length()==Calculator.getMinLength()) {
                        System.out.println(str);
                    }
                }
                break;
            }
        }
    }
}
