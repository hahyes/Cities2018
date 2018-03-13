
package cities2018;

import java.util.*;
/**
 *
 * @author Student
 */
public class Countries {
    
    private Map<String,String> countries = new HashMap();
    
    public Countries() {
        countries.put("Poland", "Warsaw");
        countries.put("Germany", "Berlin");
        countries.put("Russia", "Moscow");
        countries.put("Spain", "Madrid");
    }

    @Override
    public String toString() {
        return "Countries{" + "countries=" + countries + '}';
    }
    
    public static void main(String[] args) {
        Countries c = new Countries();
        System.out.println(c);
    }
    
}
