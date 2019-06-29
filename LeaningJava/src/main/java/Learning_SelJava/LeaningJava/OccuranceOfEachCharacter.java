package Learning_SelJava.LeaningJava;

import java.util.HashMap;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class OccuranceOfEachCharacter extends BaseTestNg{
	String str = "welcome to automation";
	int count =0;
	
	@Test(priority=1)
	public void main() {
		char[] char_array =str.toCharArray();
		Map<Character,Integer> charCounter=new HashMap<Character,Integer>();
		for (char ch : char_array) {
			if(charCounter.containsKey(ch)){
				charCounter.put(ch, charCounter.get(ch)+1);
			} 
			else{
				charCounter.put(ch, 1);
			}
		}
		Set keyArray = new HashSet<Integer>();
		keyArray = charCounter.keySet();
		for (Object object : keyArray) {
			if(charCounter.get(object)>1){
				System.out.println("The repetitive characters are :");
			System.out.println(object);	
			}
			else {
				System.out.println("The non-repetitive characters are :");
				System.out.println(object);
			}
			
		}
		
		System.out.println(charCounter);
	}
	
	@Ignore
	@Test(priority=2)
	public void occurance() {
		String string=""; 
		int temp =0;
		Map<Integer,String> map =new LinkedHashMap<Integer,String>();
		for (int i = 0; i < str.length(); i++) {
			map.put(temp, ""+str.charAt(i));
			temp++;
		}
		for (int eachChar : map.keySet()) {
			count=0;
			string =map.get(eachChar);
			for (Integer eachKey : map.keySet()) {
				if (string.equals(map.get(eachKey))) {
					count++;
				}
			}
			System.out.println(map.get(eachChar)+"-->"+count);
		}
	}
	
	@Ignore
	@Test(priority=3) 
	public void occuranceOfString() {
		for (int j = 0; j < str.length(); j++) {
			count = 0;
			char c = str.charAt(j);
			for (int i = 0; i < str.length(); i++) {
				if (c == str.charAt(i)) {
					count++;
				}
			}
			System.out.println(c + " occurs " + count + " times in " + str); // you can store this in Map and print for better solution
		}
	}
	
	

}








