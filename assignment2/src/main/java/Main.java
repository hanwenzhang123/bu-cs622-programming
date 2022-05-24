public class Main {
    public static void main(String[] args) {
        String file1 = "dataset/data1.json";
        String file2 = "dataset/data2.json";
        String file3 = "dataset/data3.json";

        String days = "days.json";

        System.out.println("------Merge Content------");
        MergeContent.main(new String[]{file1, file2, file3});
        //all three sample files are passed to the function which will be merged its content about dates to a single json file

        System.out.println("------Testing Content Above------");
        ReadFile.mergeContentTesting(days);
        //above function is for printing out what is in that merged single json file for testing the method above

        System.out.println("------Search Keyword by Default Keyword------");
        SearchKeyword.main(new String[]{file1, file2, file3});  //search multiple files with default keywords
        SearchKeyword.searchKeywordByFile(file1);     //search single file with default keywords
        SearchKeyword.searchKeywordByFile(file2);
        SearchKeyword.searchKeywordByFile(file3);

        System.out.println("------Search Keyword by Custom Keyword------");
        SearchKeyword.main(new String[]{file1, file2, file3}, "Hello");   //search a custom keyword in multiple files
        SearchKeyword.searchKeywordByFile(file1, "Hi");  //search a custom keyword in a single files
        SearchKeyword.searchKeywordByFile(file2, "Car");
        SearchKeyword.searchKeywordByFile(file3, "Yes");
    }
}
