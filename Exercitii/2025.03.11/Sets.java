import java.util.HashSet;

public class Sets {

	public static void main(String[] args) {
			HashSet<Integer> hs = new HashSet<>();
			HashSet<Integer> hs2 = new HashSet<>();
			HashSet<Integer> hs3 = new HashSet<>();

			hs.add(1);
			hs.add(2);
			hs.add(3);
			hs.add(4);
			hs.add(5);
			hs.add(6);
			hs.add(7);

			hs2.add(1);
			hs2.add(2);
			hs2.add(7);

			hs3.add(1);
			hs3.add(2);
			hs3.add(9);

			if (hs.containsAll(hs2)) {
				System.out.println("hs2 is a subset of hs");
			} else {
				System.out.println("hs2 is not a subset of hs");
			}
			
			if (hs.containsAll(hs3)) {
				System.out.println("hs3 is a subset of hs");
			} else {
				System.out.println("hs3 is not a subset of hs");
			}
		}
}
