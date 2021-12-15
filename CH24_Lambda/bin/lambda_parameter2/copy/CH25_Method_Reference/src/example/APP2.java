package example;

interface Greeter{
	void greet();
}

public class APP2 {

		public static void main(String[] args) {
			
			Greeter g = () -> System.out.println("헬로우~~");
			
			g.greet();
		}
		private static void sayHello() {
			System.out.println("헬로우~~");
		}
}
