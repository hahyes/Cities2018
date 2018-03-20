
package cities2018;

import java.util.*;

public class Cities {
    
    private Map<String, List<String>> provinces = new HashMap();
    
    public Cities() {
        List<String> pom_miasta = new ArrayList<String>();
        pom_miasta.add("Gdansk");
        pom_miasta.add("Koscierzyna");
        pom_miasta.add("Kartuzy");
        pom_miasta.add("Chojnice");
        provinces.put("pomorskie",pom_miasta);
        List<String> war_miasta = Arrays.asList("Elblag","Olsztyn","Braniewo");
        provinces.put("warminsko-mazurskie", war_miasta);
    }
    
    public Collection<String> provinces(){
        return provinces.keySet();
    }
    
    public List<String> cities(String province)
    {
        return provinces.get(province);
    }
    
    public Map<String, String> provinceWithOneCity()
    {
        Map<String,String> map = new HashMap();
        for(String key : provinces.keySet())
        {
            List<String> list = provinces.get(key);
            String city = list.get(0);
            map.put(key, city);
        }
        return map;
    }
    
    public Collection<String> cities()
    {
        Collection<String> col = new ArrayList();
        for(List<String> list : provinces.values())
        {
            col.addAll(list);
        }
        return col;
    }
    
    public static void main(String[] args){
        
        Cities c = new Cities();
        
        System.out.println(c.provinces);
        
    }
}
