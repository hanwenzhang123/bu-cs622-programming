public class Main {
    public static void main(String[] args) {
        String file1 = "dataset/data1.json";
        String file2 = "dataset/data2.json";
        String file3 = "dataset/data3.json";

        String days = "days.json";

//        System.out.println("------Merge Content------");
//        MergeContent.main(new String[]{file1, file2, file3});

//        System.out.println("------Testing Merged Content Above------");
//        ReadFile.mergeContentTesting(days);

        System.out.println("------Search Keyword by Default Keyword------");
        SearchKeyword.main(new String[]{file1, file2, file3});  //search multiple files
//        SearchKeyword.searchKeywordByFile(file1);     //search single file
//        SearchKeyword.searchKeywordByFile(file2);
//        SearchKeyword.searchKeywordByFile(file3);

        System.out.println("------Search Keyword by Custom Keyword------");
//        SearchKeyword.main(new String[]{file1, file2, file3}, "Hello");
        SearchKeyword.searchKeywordByFile(file1, "Hi");
        SearchKeyword.searchKeywordByFile(file2, "Car");
        SearchKeyword.searchKeywordByFile(file3, "Yes");
    }
}
