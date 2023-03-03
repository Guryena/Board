package Board;

import java.util.Set;

public class ShowBoard extends Board {

	public ShowBoard(Set<Integer> ks, int choice) {

		for (Integer key : ks) {
			if (key.equals(choice)) {
				System.out.println("번호: " + choice + super.map.get(choice));
				break;
			}
		}
	}
}
