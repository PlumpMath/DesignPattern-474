public class Main {
	public static void main(String[] args) {
		Singleton singletonA = Singleton.getInstance();
		Singleton singletonB = Singleton.getInstance();
		if (singletonA == singletonB) {
			System.out.println("A == B");
		} else {
			System.out.println("A != B");
		}
		System.out.println("End.");

		Triple tripleA = Triple.getInstance(0);
		Triple tripleB = Triple.getInstance(1);
		Triple tripleC = Triple.getInstance(2);
	}
}