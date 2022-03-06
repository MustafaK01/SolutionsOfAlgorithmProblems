import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class RandomizedSet {
	
    public List<Integer> set = new ArrayList<Integer>();
	
    public RandomizedSet() {
    }
    
    public boolean insert(int val) {
    	if(!set.contains(val)) {
        	if(set.size()==0) {
                set.add(set.size(),val);
                return true;
        		}
        	else if(set.size()>=1) {
                set.add(set.size()-1,val);
                return true;
        	}
    	}
    	return false;
    }
    	
    
    public boolean remove(int val) {
    	if(set.contains(val)) {
    		set.remove(new Integer(val));
    	}
    	return false;    
    }
    
    public int getRandom() {
        Random rand = new Random();
        int randomElement = set.get(rand.nextInt(set.size()));
        return randomElement;
    }

}
