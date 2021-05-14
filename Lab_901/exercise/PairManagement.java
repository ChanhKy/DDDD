package exercise;

import java.util.ArrayList;
import java.util.List;

public class PairManagement {
	List <String> lists;

	public PairManagement() {
		lists = new ArrayList<String>();
		lists.add("fpt");
		lists.add("software");
		lists.add("fresher");
		lists.add("academy");
	}
	
	// chuyen doi cap so
	public void switchPair() {
		String temp = null;
		for (int i =0; i < lists.size() -1; i++) {
			temp = lists.get(i);
			lists.set(i, lists.get(i + 1));
			lists.set(i + 1, temp);
		}
	}
	
	public List<String> getList()	{
		return lists;
	}
	
	
}
