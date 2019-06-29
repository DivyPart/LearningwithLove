package Learning_SelJava.LeaningJava;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class SortAnArray extends BaseTestNg{

	@Test(priority=1)
	public void main() {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		ArrayList<Integer> opList = new ArrayList<Integer>();
		newList.add(19);
		newList.add(65);
		newList.add(39);
		newList.add(40);
		newList.add(100);
		Map<Integer,Integer> treeList = new TreeMap<Integer, Integer>();
		Set<Integer> setVal = new TreeSet<Integer>();
		for (Integer keyVal : newList) {
			treeList.put(keyVal, 0);
		}
		setVal = treeList.keySet();
		opList.addAll(setVal);
		System.out.println(opList);

		for (Integer i=0;i<newList.size();i++) {
			for (int j=i;j<newList.size(); j++) {
				if(newList.get(i)> newList.get(j)) {
					int temp = newList.get(i);
					newList.set(i, newList.get(j));					
					newList.set(j,temp);
				}
			}
		}
		for(int i=0;i<newList.size();i++) {
			System.out.println(newList.get(i));
		}
	}
}












