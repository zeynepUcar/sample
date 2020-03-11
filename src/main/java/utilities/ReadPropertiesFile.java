package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertiesFile {

    public static String getData(String whichData){
        String path ="configuration.properteis";

        String result = null;

        try{
            InputStream input = new FileInputStream( path );   //helps to read properteis file
            Properties prop = new Properties(  );
            prop.load( input );
            result = prop.getProperty( whichData ); //which data i want to load in result

        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}
