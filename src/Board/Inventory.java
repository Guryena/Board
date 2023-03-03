package Board;

import java.util.HashMap;

public class Inventory extends Board {

	public void show() {
		System.out.println("-게시글 전체조회-");
	}

	@Override
	public String toString() {
		String result = null;
		if (super.number == 0) {
			result = "게시글이 없습니다.";
		} else if (super.number > 0) {
			for (HashMap.Entry<Integer, BoardBody> index : super.map.entrySet()) {
				System.out.println("번호: " + index.getKey() + " 제목: " + index.getValue().title + " 작성자: "
						+ index.getValue().name + " 날짜 : " + index.getValue().date);
			}
		}
		return result;
	}

}
