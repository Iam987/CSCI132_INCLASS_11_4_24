import java.util.LinkedList;

public class RecursionDemo2 {

	public static void main(String[] args) {
		System.out.println(countX("helloxxx"));
		System.out.println(countX("xxxxx"));
		System.out.println(countX("hiiiiii"));
		
		System.out.println("---------------");
		
		System.out.println(starString("aaaaaaabbcc"));
		System.out.println(starString("abcde"));
		
		System.out.println("---------------");
		
		LinkedList<String> words = new LinkedList<String>();
		words.add("first");
		words.add("second");
		words.add("third");
		words.add("fourth");
		
		//printLinkedList(words);
		
		System.out.println("---------------");
		
		printLinkedListReverse(words);
		
		System.out.println("---------------");
		System.out.println(isPal("RACECAR"));
		System.out.println(isPal("abcde"));
		System.out.println(isPal("AABBAA"));
		

	}
	
	public static int countX(String s) {
		s = s.toUpperCase();
		//base
		if(s.length() == 0) {
			return 0;
		}
		//recursive
		else {
			if(s.charAt(0) == 'X') {
				return 1 + countX(s.substring(1));
			}
			else {
				return 0 + countX(s.substring(1));
			}
		}
	}
	
	public static String starString(String s) {
		//base case
		if(s.length() == 1 || s.length() == 0) {
			return s;
		}
		//recursive
		else {
			if(s.charAt(0) == s.charAt(1)) {
				return s.charAt(0) + "*" + starString(s.substring(1));
			}
			else {
				return s.charAt(0) + starString(s.substring(1));
			}
		}
	}
	
	
	public static void printLinkedList(LinkedList<String> ll) {
		//base case
		if(ll.size() == 1) {
			System.out.println(ll.getFirst());
		}
		//recursive case
		else {
			String removed = ll.removeFirst();
			System.out.println(removed);
			printLinkedList(ll);
		}
	}
	
	
	public static void printLinkedListReverse(LinkedList<String> ll) {
		//base case
		if(ll.size() == 1) {
			System.out.println(ll.getFirst());
		}
		//recursive
		else {
			String removed = ll.removeFirst();
			printLinkedListReverse(ll);
			System.out.println(removed);
			ll.add(removed);
			
		}
	}
	
	public static boolean isPal(String s) {
		if(s.length() == 1 || s.length() == 0) {
			return true;
		}
		else {
			if(s.charAt(0) == s.charAt(s.length() - 1)) {
				return isPal(s.substring(1,s.length()-1));
			}
			else {
				return false;
			}
		}
	}
	
	
	
	
	

}
