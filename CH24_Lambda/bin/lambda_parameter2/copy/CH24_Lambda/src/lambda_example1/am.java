package lambda_example1;

import java.util.function.Predicate;

public class am {
	public static void main(String[] args) {
		Predicate<String> p1 = new Predicate<String>() {
		public boolean test(String t) {
			return t.length()<4;
		}
	};
		System.out.println(p1.test("abcd"));
		System.out.println(p1.test("하나둘"));
		
		Predicate<String> p2 = s -> s.length()<4;
		
		System.out.println(p2.test("one"));
		System.out.println(p2.test("threes"));
		
	}
	
}

