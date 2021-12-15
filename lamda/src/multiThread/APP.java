package multiThread;

public class APP {

	private int value = 0;
	
	private synchronized void increment() {  //이 메소드는 한번에 하나의 쓰레드만 접근
		value ++;
	}

	public void run() throws InterruptedException {
		Runnable runnable = () -> {
			for (int i = 0; i < 1000; i++) {
				increment(); 

			}
		};
		Thread t1 = new Thread(runnable); // 새 스레드t1 생성
		Thread t2 = new Thread(runnable); // 새 스레드 t2 생성
		Thread t3 = new Thread(runnable); // 새 스레드 t3 생성

		t1.start();//   //t1실행
		t2.start();	//	/t2실행
		t3.start();	//	/t3실행

		//System.out.println("value:" + value); // 메인 쓰레드 실행

		t1.join(); // 메인 쓰레드가 t1을 실행할때까지 대기
		t2.join(); // 메인 쓰레드가 t2를 실행할때까지 대기
		t3.join(); // 메인 스레드가 T3을 실핼할떄까지 대기
		
		System.out.println("value:" + value); // t1,t2가 끝난다음 출력

	}

	public static void main(String[] args) throws InterruptedException {
		// 멀티쓰레드
		new APP().run();

	}
}
