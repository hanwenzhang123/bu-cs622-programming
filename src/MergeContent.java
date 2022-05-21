import java.io.*;
import java.util.*;

public class MergeContent {
    public static void main(String[] args) {
        try{
            File file = new File("src/days.json");
            if (file.exists()) {
                file.createNewFile();
                System.out.println("File already exists. Located " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists. Located " + file.getAbsolutePath());
            }

            for (int i = 0; i < args.length; i++) {
                BufferedReader reader = new BufferedReader(new FileReader(args[i]));

                Map<String, String> map = new HashMap<>();
                map.put("hi", "1");
                System.out.println(map);
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
//                writer.write(map);
            }

            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            String st;
            while ((st = reader.readLine())!=null)
            {
                System.out.println(st);
            }

        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally!!! Merge the content of all days into a single file done!!!");
        }
    }
}
