package exercise;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		//연습문제
		List<Integer> List = new ArrayList<>();
		List.add(1);
		List.add(5);
		List.add(9);
		List.add(1000);
		List.add(3);
		List.add(6);
		List.add(-20);
		List.add(4);
		
		List.removeIf(i -> i>11 );
		List.removeIf(i -> i<0);
		List.replaceAll(i-> i+100);
		List.forEach(t -> System.out.println(t));
		

		
	}

}
