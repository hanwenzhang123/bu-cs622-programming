import java.io.*;

public class Main {
    public static void main(String[] args) {
        String file1 = "dataset/Indiegogo_data1.json";
        String file2 = "dataset/Indiegogo_data2.json";
        String file3 = "dataset/Indiegogo_data3.json";

        System.out.println("------Merge Content------");
        MergeContent.main(new String[]{file1, file2, file3});

        System.out.println("------Search Keyword------");
        SearchKeyword.main(new String[]{file1, file2, file3});
    }
}
