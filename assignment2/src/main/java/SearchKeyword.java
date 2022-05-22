import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchKeyword {

    public static void main(String[] args) {
        try{
            String[] keyword = {"Happy", "Depression", "Sweat"};
            String key1 = "funds_raised_percent";
            String key2 = "close_date";

            for (int i = 0; i < args.length; i++) {
                JSONParser parser = new JSONParser();
                JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(args[i]));

                SearchAndPrintByDefaultKeyword(keyword, key1, key2, jsonArray);
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
    public static void main(String[] args, String customKeyword) {
        try{
            String key1 = "funds_raised_percent";
            String key2 = "close_date";

            for (int i = 0; i < args.length; i++) {
                JSONParser parser = new JSONParser();
                JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(args[i]));

                if(customKeyword != null) {
                    SearchAndPrintByCustomKeyword(customKeyword, key1, key2, jsonArray);
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
    public static void searchKeywordByFile(String arg) {
        try{
            String[] keyword = {"Happy", "Depression", "Sweat"};
            String key1 = "funds_raised_percent";
            String key2 = "close_date";

            JSONParser parser = new JSONParser();
            JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(arg));

            SearchAndPrintByDefaultKeyword(keyword, key1, key2, jsonArray);
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

    public static void searchKeywordByFile(String arg, String customKeyword) {
        try{
            String key1 = "funds_raised_percent";
            String key2 = "close_date";

            JSONParser parser = new JSONParser();
            JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(arg));

            SearchAndPrintByCustomKeyword(customKeyword, key1, key2, jsonArray);
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

    private static void SearchAndPrintByDefaultKeyword(String[] keyword, String key1, String key2, JSONArray jsonArray) {
        for (int i = 0; i < jsonArray.toArray().length; i++) {
            Object eachObject = jsonArray.get(i);
            JSONObject jsonObject = (JSONObject) eachObject;
            Object objectData = jsonObject.get("data");
            JSONObject objectInfo = (JSONObject) objectData;


            for (String each : keyword){
                SearchPattern(each, key1, key2, objectInfo);
            }
        }
    }

    private static void SearchAndPrintByCustomKeyword(String keyword, String key1, String key2, JSONArray jsonArray) {
        for (int i = 0; i < jsonArray.toArray().length; i++) {
            Object eachObject = jsonArray.get(i);
            JSONObject jsonObject = (JSONObject) eachObject;
            Object objectData = jsonObject.get("data");
            JSONObject objectInfo = (JSONObject) objectData;

            SearchPattern(keyword, key1, key2, objectInfo);
        }
    }

    private static void SearchPattern(String keyword, String key1, String key2, JSONObject objectInfo) {
        Pattern pattern = Pattern.compile(keyword, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(objectInfo.toString());
        boolean matchFound = matcher.find();

        if (matchFound) {
            Object fundsPercent = objectInfo.get(key1);
            Object closeDate = objectInfo.get(key2);

            JSONObject obj = new JSONObject();
            obj.put("keyword", keyword);
            obj.put(key1, fundsPercent);
            obj.put(key2, closeDate);
//            obj.put("data", objectInfo);
            System.out.println(obj);
        }
    }

}