import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static HashMap<String, String> searchHistory = new HashMap<String, String>();    //we use timestamps as the key, search items as the value
    public static HashMap<String, Integer> searchFrequency = new HashMap<String, Integer>();    //key as the search item, integer value as the frequency
    public static HashSet<String> searchedItems = new HashSet<String>();    //set does not allow duplicate, we track which items have been searched here

    public static void main(String[] args) {
        String file1 = "dataset/data1.json";
        String file2 = "dataset/data2.json";
        String file3 = "dataset/data3.json";

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String formattedTime = format.format(now);
        String timeStamp = "Timestamp: " + formattedTime;
        System.out.println(timeStamp);

//  ------------------------ Assignment 3 ------------------------
        System.out.println("------Search History with Time Stamp------");

        System.out.println(searchHistory);

        System.out.println("------Search Term and Frequency------");

        System.out.println(searchFrequency);

        System.out.println("------All Keywords Have been Searched------");
        searchedItems.add("Bob");
        System.out.println(searchedItems);

//  ------------------------ Assignment 2 ------------------------
//        System.out.println("------Merge Content------");
//        MergeContent.main(new String[]{file1, file2, file3});
//        //all three sample files are passed to the function which will be merged its content about dates to a single json file
//
//        System.out.println("------Testing Content Above------");
//        String days = "days.json";
//        ReadFile.mergeContentTesting(days);
//        //above function is for printing out what is in that merged single json file for testing the method above
//
//        System.out.println("------Search Keyword by Default Keyword------");
//        SearchKeyword.main(new String[]{file1, file2, file3});  //search multiple files with default keywords
//        SearchKeyword.searchKeywordByFile(file1);     //search single file with default keywords
//        SearchKeyword.searchKeywordByFile(file2);
//        SearchKeyword.searchKeywordByFile(file3);
//
//        System.out.println("------Search Keyword by Custom Keyword------");
//        SearchKeyword.main(new String[]{file1, file2, file3}, "Hello");   //search a custom keyword in multiple files
//        SearchKeyword.searchKeywordByFile(file1, "Hi");  //search a custom keyword in a single files
//        SearchKeyword.searchKeywordByFile(file2, "Car");
//        SearchKeyword.searchKeywordByFile(file3, "Yes");

    }
}
