package Board.origin;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Board {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashMap<Integer, BoardBody> map = new HashMap<>();
		int choice;
		Set<Integer> ks = map.keySet();
		BoardBody boardbody;
		
		Date nowDate = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		String strNowDate = date.format(nowDate);
		int number = 0; // 게시글 번호 등록하면 1 증가
		
		System.out.println("<<게시물>>");
		System.out.println("==프로그램 시작==");

		while (true) {
			System.out.println("1.목록  2.등록  3.내용  4.삭제  5.종료 ");
			System.out.print("번호를 선택하세요 : ");
			String seq = sc.nextLine();

			if (seq.equals("5")) {
				break;
			} 
			
			
			else if (seq.equals("1")) {
				System.out.println("-게시글 전체조회-");
				if (number == 0) {
					System.out.println("게시글이 없습니다.");
				} else if (number > 0) {
					for (HashMap.Entry<Integer, BoardBody> index : map.entrySet()) {
						System.out.println("번호: " + index.getKey() + " 제목: " + index.getValue().title + " 작성자: "
								+ index.getValue().name + " 날짜 : " + strNowDate);
					}
				}
				continue;
			} 
			else if (seq.equals("2")) {
				System.out.println("-게시물 등록-");
				System.out.print("제목: ");
				String title = sc.nextLine();
				System.out.print("내용: ");
				String body = sc.nextLine();
				System.out.print("작성자: ");
				String name = sc.nextLine();
				
				number++;
				
				boardbody = new BoardBody(title, body, name, strNowDate);
				
				map.put(number, boardbody);
				
				System.out.println("번호: " + number + " 제목: " + boardbody.title + " 작성자: " + boardbody.name + "날짜: "+strNowDate);
				System.out.println("새 글이 정상적으로 등록되었습니다." + '\n');
				continue;
			} else if (seq.equals("3")) {
				System.out.print("게시글 번호를 입력하세요: ");
				choice = sc.nextInt();
				sc.nextLine();
				
				for (Integer key : ks) {
					if (key.equals(choice)) {
						System.out.println("번호: " + choice + map.get(choice));
						break;
					}

				}
				continue;
			} else if (seq.equals("4")) {
				System.out.print("삭제할 게시글 번호를 입력하세요: ");
				choice = sc.nextInt();
				sc.nextLine();
				map.remove(choice);
				
//				int i = 1;
//				for (int j = 0; j < map.size(); j++) {
//					if (ks.equals(i)) {
//						continue;
//					}else {
//					map.replace(i, map.get(i+1));
//					}
//				}
				continue;
			}
		}

		System.out.println("==프로그램 종료==");
		sc.close();
	}
}
