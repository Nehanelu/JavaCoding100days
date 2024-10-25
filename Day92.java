
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day92  {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        
        List<String> result = new ArrayList<>();
        String prev = "";  

        for (String f : folder) {
            if (prev.isEmpty() || !f.startsWith(prev + "/")) {
                result.add(f);  
                prev = f;       
            }
        }
        
        return result;
    }
}
