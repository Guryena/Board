package Board;

import java.util.Set;

public class ShowBoard extends BoardHM {
	private int choice;
	Set<Integer> ks = map.keySet();

	public ShowBoard(int choice) {
		this.choice = choice;
		show();
	}

	private void show() {

		for (Integer key : ks) {
			if (key.equals(choice)) {
				System.out.println("번호: " + choice + map.get(choice));
				break;
			} else if (map.get(key.equals(choice)) == null || number == 0) {
				System.out.println("존재하지 않는 게시물입니다.");
				break;
			}
		}
	}

}
