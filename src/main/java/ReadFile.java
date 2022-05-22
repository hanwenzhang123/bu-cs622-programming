import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void mergeContentTesting(String arg) {
        try{
            JSONParser parser = new JSONParser();
            FileReader reader = new FileReader(arg);
            JSONArray jsonArray = (JSONArray) parser.parse(reader);

            for (int i = 0; i < jsonArray.toArray().length; i++) {
                Object eachObject = jsonArray.get(i);
                System.out.println(eachObject);
            }

        } catch(FileNotFoundException e){
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
            System.out.println("Finally!!! Just for testing output!!!");
        }

    }
}
