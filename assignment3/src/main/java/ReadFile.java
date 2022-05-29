import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void mergeContentTesting(String arg) {    //using external library org.json.simple to work with json data
        try{
            JSONParser parser = new JSONParser();
            FileReader reader = new FileReader(arg);
            JSONArray jsonArray = (JSONArray) parser.parse(reader);

            for (int i = 0; i < jsonArray.toArray().length; i++) {
                Object eachObject = jsonArray.get(i);
                System.out.println(eachObject);     //print out each json object data
            }

        } catch(FileNotFoundException e){  //catch the file not found exception
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch(IOException e){   //catch the io exception
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch (Exception e) {     //general exception if runtime error not belongs to above specific exception
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally {     //finally will always run no matter what
            System.out.println("Finally!!! Just for testing output!!!");
        }

    }
}
