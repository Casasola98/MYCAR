
package ejemplo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ArchiveReader {
    
    public ArchiveReader(){
        
    }
    
    public ArrayList<String> readArchive(String route){
        ArrayList<String> theRoad = new ArrayList<String>();
        FileReader file = null;
        try{
            file = new FileReader(route);
        }
        catch(FileNotFoundException evt){
            
        }
        
        BufferedReader bufferR = new BufferedReader(file);
        String sCadena = "";
        String linea;
        char[] line;
        String[] hashes;
        try {
            while ((linea = bufferR.readLine())!=null) {
                line = linea.toCharArray();
                for (int index =0; index < line.length; index++){
                    
                }
            }
        } catch (IOException ex) {
            
        }
        return theRoad;
    }
    
    
}
