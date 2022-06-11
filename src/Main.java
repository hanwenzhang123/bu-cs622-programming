import java.util.*;

public class Main {
    final static String[] genomeCharacter = {"A", "T", "G", "C"};   //use final since we are not changing this array => genome sequence is a character string that include A,T,G,C
    public static ArrayList<String> randomGenomeSequence = new ArrayList<>();

    public static void main(String[] args) {
        Random random = new Random();   //use random to generate a random integer

        while (randomGenomeSequence.size() < 100) {
            String genome = "";
            while (genome.length() < 10) {
                int index = random.nextInt(4);    //generate a random number 0 and 3 => which will be used as the index of our genome array
                genome = genome.concat(genomeCharacter[index]);
            }
            randomGenomeSequence.add(genome);   //add to the ArrayList of each genome with 10 character long
        }

//        //Print out 100 random genome sequence, and each should be 10 character long
//        for (String eachGenome : randomGenomeSequence) {
//            System.out.println(eachGenome);
//        }
//        System.out.println(randomGenomeSequence.size());    //100

    }
}
