package Board;

import java.util.Set;

public class ShowBoard extends BoardHM {
	private int choice;
	Set<Integer> ks = map.keySet();

	public ShowBoard(int choice) {
		this.choice=choice;
		show();
	}

	private void show() {

		for (Integer key : ks) {
			if (key.equals(choice)) {
				System.out.println("번호: " + choice + map.get(choice));
				break;
			}
		}
	}

}
