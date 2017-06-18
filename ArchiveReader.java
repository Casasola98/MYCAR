
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
        String Chain = "";
        String linea;
        char[] line;
        String Item;
        try {
            while ((linea = bufferR.readLine())!=null) {
                line = linea.toCharArray();
                System.out.println(line.length);
                for (int index =0; index < line.length; index++){
                    Item = String.valueOf(line[index]);
                    if ( Item.equals(".") || Item.equals("+") || Item.equals("T")||Item.equals("D")||Item.equals("N")||Item.equals("L")||Item.equals("F")){
                        if (Chain != ""){
                            theRoad.add(Chain);
                            Chain = "";
                        }
                        theRoad.add(Item);
                    }
                    else{
                        Chain+= Item;
                    }
                }
            }
        } catch (IOException ex) {
            
        }
        return theRoad;
    }
    
    
}
