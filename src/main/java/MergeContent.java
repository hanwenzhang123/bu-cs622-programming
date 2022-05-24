import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.*;

public class MergeContent {
    public static void main(String[] args) {        //using external library org.json.simple to work with json data
        JSONParser parser = new JSONParser();   //parser for read
        JSONArray array = new JSONArray();  //store all the map in arr for all files, which will be written in days.json
        JSONArray arr = new JSONArray();    //store map in arr for each file

        try{
            File file = new File("days.json");
            if (!file.exists()) {   //check if the file already exist or not, then get the absolute path the days.json file
                file.createNewFile();
                System.out.println("File already created. Located " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists. Located " + file.getAbsolutePath());
            }

            for (int i = 0; i < args.length; i++) {
                FileReader reader = new FileReader(args[i]);
                JSONArray jsonArray = (JSONArray) parser.parse(reader);

                for (int j = 0; j < jsonArray.toArray().length; j++) {
                    Object eachObject = jsonArray.get(j);
                    JSONObject jsonObject = (JSONObject) eachObject;
                    Object objectData = jsonObject.get("data");
                    JSONObject objectInfo = (JSONObject) objectData;

                    Object openDate = objectInfo.get("open_date");
                    Object closeDate = objectInfo.get("close_date");

                    JSONObject obj = new JSONObject();     //a new json object which will be used for each new key value pair and write into the new json file
                    obj.put("open_date", openDate);
                    obj.put("close_date", closeDate);
                    arr.add(obj);   //add to arr for each json object scanned in one file
                }

                array.add(arr);     //each file we store in arr, then push to the total array
            }

            BufferedWriter writer = new BufferedWriter(new FileWriter(file));   //create buffered writer, writing in stream to the new file days.json
            writer.write(array.toString()); //array will include all the dates for all the files
            writer.flush(); //flush into the file
        }
        catch(FileNotFoundException e){  //catch the file not found exception
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch(IOException e){   //catch the io exception
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch (Exception e) {   //general exception if runtime error not belongs to above specific exception
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally {       //finally will always run no matter what
            System.out.println("Finally!!! Merge the content of all days into a single file done!!!");
        }
    }
}
