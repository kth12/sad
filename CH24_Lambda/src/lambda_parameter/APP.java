package lambda_parameter;

interface Runner{
	void execute(String t); //추상메서드에 매개변수가 있는경우
}


public class APP {

	public static void main(String[] args) {
		// 매개변수가 있는 경우
		Runner run1 = (s) -> System.out.println(s);
		run1.execute("펭수");

		Runner run2 = X -> System.out.println(X);//매개변수가 1개일떄 ()생략가능
		run2.execute("길동");
	}

}
