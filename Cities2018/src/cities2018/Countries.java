
package cities2018;

import java.util.*;



public class Countries {
    
    private Map<String,String> countries = new HashMap();
    
    public Countries() {
        countries.put("Poland", "Warsaw");
        countries.put("Germany", "Berlin");
        countries.put("Russia", "Moscow");
        countries.put("Spain", "Madrid");
    }
    
    public Collection<String> capitals(){
        return countries.values();
    }
    
    public Collection<String> countries(){
        return countries.keySet();
    }

    public Collection<String> sortedCapitals(){
        TreeSet set = new TreeSet(capitals());
        return set;
    }
    
    public Collection<String> sortedCountries(){
        TreeSet set = new TreeSet(countries());
        return set;
    }
    
    public Map<String,String> sortedByCountries(){
        TreeMap map = new TreeMap(countries);
        return map;
    }
    
    public Map<String,String> sortedByCapitals(){
        Map<String,String> map = new TreeMap();
        
        for(String key : countries.keySet())
        {
            String value = countries.get(key);
            map.put(value, key);
        }
        
        return map;
    }
    
    
    @Override
    public String toString() {
        return "Countries{" + "countries=" + countries + '}';
    }
    
    public static void main(String[] args) {
        Countries c = new Countries();
        System.out.println(c);
        System.out.println(c.capitals());
        System.out.println(c.countries());
        System.out.println("Sorted:");
        System.out.println(c.sortedCapitals());
        System.out.println(c.sortedCountries());
        System.out.println(c.sortedByCountries());
        System.out.println(c.sortedByCapitals());
    }
    
}
