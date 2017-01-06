package mum.mpp.fetena.problem04;

import java.util.HashMap;
import java.util.Map;


public class DupValue<K, V> {

	public static <K, V> boolean hasDuplicateValue(Map<? extends K, ? extends V> map) {
           if(map == null  || map.size() < 2) return false;
           
           for(int i = 0 ; i < map.size() - 1 ; i++){
               for(int j = i + 1 ; j < map.size(); j++ )
               {
                   V v1 = (V)map.get(i);
                   V v2 = (V)map.get(j);
                   if(v1.equals(v2))
                       return true;
               }
           }
           return false;
	}
        
        public static void main(String[] args){
        
            Map<Integer, Integer> map = new HashMap<>();
            map.put(1, 1);
            map.put(1, 2);
            map.put(3,3);
            map.put(4,3);
            System.out.println(""+hasDuplicateValue(map));
        }
}
