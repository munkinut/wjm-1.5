package uk.co.indigo.play.varargs;

public class TestVarArgs {

	public static void main(String[] args) {
		int total = sum(1,2,3,4,5,6,7);
		System.out.println(total);
		total = sum(1,2,3);
		System.out.println(total);
	}
	
	public static int sum(int ... args) {
		int total = 0;
		for (int i : args) {
			total += i;
		}
		return total;
	}

}
