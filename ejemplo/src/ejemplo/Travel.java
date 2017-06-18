
package ejemplo;

import java.util.ArrayList;

public class Travel {
    
    public ArrayList<String> theTravel;
    public ArchiveReader TheReader;
    
    public Travel(String Route){
        TheReader = new ArchiveReader();
        chargeTravel(Route);
    }
    
    public void chargeTravel(String Route){
        theTravel = TheReader.readArchive(Route);
    }
    
}
