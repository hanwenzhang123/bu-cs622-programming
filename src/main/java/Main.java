import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static LinkedHashMap<String, String> searchHistory = new LinkedHashMap<>();    //we use timestamps as the key, search items as the value
    public static HashMap<String, Integer> searchFrequency = new HashMap<>();     //key as the search item, integer value as the frequency
    public static HashSet<String> searchedItems = new HashSet<>();    //set does not allow duplicate, we track which items have been searched here
    public static ArrayList<String> files = new ArrayList<>();  //collect all the available json file path in array list format
    public static void main(String[] args) {
        String file1 = "dataset/data1.json";
        String file2 = "dataset/data2.json";
        String file3 = "dataset/data3.json";

        files.add(file1);
        files.add(file2);
        files.add(file3);

        Scanner scanner = new Scanner(System.in);
        boolean search = true;
        String file;
        String keyword;
        String answer;

        while (search) {
            System.out.println("Enter the FILE/FILES that you would like to search through: (file1, file2, file3, all)");
            file = scanner.nextLine();

            System.out.println("Enter the KEYWORD that you would like to search: ");
            keyword = scanner.nextLine();

            if (file.equalsIgnoreCase("all")) {
                SearchKeyword.main(files, keyword);
            } else if (file.equalsIgnoreCase("file1")) {
                SearchKeyword.searchKeywordByFile(file1, keyword);
            } else if (file.equalsIgnoreCase("file2")) {
                SearchKeyword.searchKeywordByFile(file2, keyword);
            } else if (file.equalsIgnoreCase("file3")) {
                SearchKeyword.searchKeywordByFile(file3, keyword);
            } else {
                System.out.println("The file name you have enter is not exist!!!");
            }

            //  ------------------------ Assignment 3 ------------------------
            System.out.println("\n------------");
            System.out.println("------Search History with Time Stamp------");
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date now = new Date();
            String formattedTime = format.format(now);
            String timeStamp = "\nTimestamp: " + formattedTime + " ";
            String keywordInfo = " Keyword Searched: " + keyword;
            searchHistory.put(timeStamp, keywordInfo);

            System.out.println(searchHistory);

            System.out.println("------Search Term and Frequency------");

            if (searchFrequency.containsKey(keyword)) {
                int frequency = searchFrequency.get(keyword);
                searchFrequency.put(keyword, frequency + 1);
            } else {
                searchFrequency.put(keyword, 1);
            }

            System.out.println(searchFrequency);

            System.out.println("------All Keywords Have been Searched------");
            searchedItems.add(keyword);
            System.out.println(searchedItems);

            System.out.println("\n-------------------");
            System.out.println("Would you like to search another keyword? (Y/N) ");
            answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
                System.out.println("\n-------------------");
                continue;
            } else if (answer.equalsIgnoreCase("N")) {
                search = false;
                scanner.close();
                System.out.println("Thank you for participating!");
            } else {
                System.out.println("Something goes wrong, keyword search restarted!");
                System.out.println("\n-------------------");
            }
        }


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
