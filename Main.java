import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Main
{

	public static void main(String[] args)
	{
		ClassA a = new ClassA();
		ClassB b = new ClassB();
		
		ArrayList<InterfaceA> listA = new ArrayList<InterfaceA>();
		ArrayList<InterfaceB> listB = new ArrayList<InterfaceB>();
		
		//listB.add(a); //Compilation error!
		listB.add(b);
		
		listA.add(a);
		listA.add(b);
		
		for(InterfaceA item: listA){
			item.method1();
			item.method2();
		}
		
		System.out.println("");
		
		for(InterfaceB item: listB){
			item.method1();
			item.method2();
			item.method3();
		}
		
		//Stack
		Stack<String> s = new Stack<String>();
		s.add("S1");
		s.add("S2");
		System.out.println(s.peek()); //returns S2
		System.out.println(s.pop()); //returns S2
		System.out.println(s.peek()); //returns S1
		System.out.println(s.pop());
		//System.out.println(s.pop()); //throws EmptyStackException
		
		//HashSet implements Set (no guaranteed order)
		HashSet<String> t = new HashSet<String>();
		t.add("S1");
		t.add("S2");
		t.add("S2"); //return False. HashSet didn't add item
		System.out.println(t.size());
		System.out.println(t.remove("S1")); //returns true and removes
		System.out.println(t.remove("S1")); //returns false
		
		// HashMap
		HashMap<Integer, String> x = new HashMap<Integer,String>();
		System.out.println(x.put(0, "Richert")); // null
		System.out.println(x.put(1, "Wang")); // null
		System.out.println(x.put(0, "RichARD")); // Richert
		System.out.println(x.containsKey(1)); // true
		System.out.println(x.containsKey(10)); // false
		System.out.println(x.containsValue("Richert")); // false
		System.out.println(x.containsValue("RichARD")); // true
		
		// Get Value for specific key
		System.out.println(x.get(1)); // Wang
		
		// Traverse Keys
		for (Integer i :x.keySet()) {
		System.out.println(i);
		}
		
		// Traverse values
		for (String i : x.values()) {
		System.out.println(i);
		}
		
		System.out.println(x.remove(0)); // RichARD
		System.out.println(x.containsValue("RichARD")); // false
		System.out.println(x.remove(1, "fjskj")); // false
		System.out.println(x.remove(1, "Wang")); // true
		System.out.println(x.size()); // 0
		
	}

}
