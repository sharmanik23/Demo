package practicedemo;

import java.util.ArrayList;
import java.util.List;

public class Result {
	
	public static int minPenalty(List<Integer> arr) {
		int minPenalty=0;
		for(int i=0; i< arr.size(); i++) {
			
			if( arr.get(i) / 2 == 0) {
				
			}else {
				minPenalty= arr.get(i);
				
						}
			
		}
		return minPenalty;
	}
	
    public static void main(String[] args) {
    	List<Integer> arr= new ArrayList<Integer>();
    	arr.add(50);
    	arr.add(50);
		minPenalty(arr);
	}

}
