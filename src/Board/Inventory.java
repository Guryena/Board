package Board;

import java.util.HashMap;

public class Inventory extends BoardHM {
	private String result;

	public Inventory() {
		run();
	}

	private void run() {
		if (number == 0) {
			result = "게시글이 없습니다.";
			System.out.println(result);
		} else if (number > 0) {
			for (HashMap.Entry<Integer, BoardBody> index : map.entrySet()) {
				
				result = "번호: " + index.getKey() + " 제목: " + index.getValue().title + " 작성자: " + 
				index.getValue().name + " 날짜 : " + index.getValue().date;
				System.out.println(result);
			}
		}
	}

}
