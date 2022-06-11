import java.util.ArrayList;
import java.util.Random;

public class RandomGenome implements Runnable {
    private final static int eachGenomeLength = 10;
    private final static String[] genomeCharacter = {"A", "T", "G", "C"};   //use final since we are not changing this array => genome sequence is a character string that include A,T,G,C

    public static void sequence(int totalLength){
        ArrayList<String> randomGenomeSequence = new ArrayList<>();
        Random random = new Random();   //use random to generate a random integer
        int counter = 0;

        while (counter < totalLength) {
            String genome = "";     //reset to empty every time a new while loop starts
            while (genome.length() < eachGenomeLength) {
                int index = random.nextInt(4);    //generate a random number 0 and 3 => which will be used as the index of our genome array
                genome = genome.concat(genomeCharacter[index]);     //concat to the string until 10 characters long
            }
            randomGenomeSequence.add(genome);   //add to the ArrayList of each genome with 10 character long
            counter++;
        }

        System.out.println(randomGenomeSequence);
    }

    @Override
    public void run() {
        sequence(20);
    }
}
