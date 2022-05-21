import java.io.*;

public class SearchKeyword {
    public static void main(String[] args) {
        try{
            String keyword1 = "robot";
            String keyword2 = "fitness";
            String keyword3 = "wearable";
            String key1 = "fund_raised_percent";
            String key2 = "close_date";

            for (int i = 0; i < args.length; i++) {
                BufferedReader reader = new BufferedReader(new FileReader(args[i]));
                String st;
                while ((st = reader.readLine())!=null)
                {
                    System.out.println(st);
                }
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
            System.out.println("Finally!!! Search for a given keyword done!!!");
        }

    }
}
