package day_1;

public class Method_Overloading {

	public static void run() {
		System.out.println("First Run");
	}
	public static void run(int i) {
		System.out.println("Second Run" +i);
	}
	public static void run(String s) {
		System.out.println("Third Run" +s);
	}
	public static void run(int i,String s) {
		System.out.println("Fourth Run" +i +" " +s);
	}
	public static void main(String[] args) {
		run();
		run(10);
		run("QA team");
		run(50,"team");
	}
}
