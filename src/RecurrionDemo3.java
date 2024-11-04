import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RecurrionDemo3 {

	public static void main(String[] args) {
		String[] nums = {"1", "2", "3", "4", "5", "6"};
	List<String> permutations = new ArrayList<>();
	
	generate_permutations(nums, "", permutations);
	
	/*System.out.println("Generated permutations:");
	for(String p : permutations) {
		System.out.println(p);
	} */
	
	Random r = new Random();
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a guess:");
	String userGuess = s.nextLine();
	
	System.out.println("your guess: " + userGuess);
	String correctAns = permutations.get(r.nextInt(permutations.size()));
	System.out.println("Answer: " + correctAns);
	
	boolean isCorrect = userGuess.equals(correctAns);
	//ternary operator
	//condition ? ifTrue : ifFalse
	System.out.println((isCorrect ? "Correct!" : "Wrong"));
	
	s.close();
	}
	
	public static void generate_permutations(String[] n, String p, List<String> L) {
		if(p.length() == n.length) { //Base Case
			L.add(p);
		}
		else { //Recursive case
			for(int i = 0; i < n.length;i++) {
				if(!p.contains(n[i])) {
					generate_permutations(n, p + n[i], L);
				}
			}
		}
	}

}
