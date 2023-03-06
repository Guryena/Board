package Board;

import java.util.Date;
import java.util.Scanner;

public class Board {

	public static void main(String[] args) {

		int choice;

		System.out.println("<<게시물>>");
		System.out.println("==프로그램 시작==");

		while (true) {
			try {

				Scanner sc = new Scanner(System.in);
				System.out.println("1.목록  2.등록  3.내용  4.삭제  5.종료 ");
				System.out.print("번호를 선택하세요 : ");
				int seq = sc.nextInt();
				sc.nextLine();

				if (seq == 5) {
					System.out.println("==프로그램 종료==");
					System.exit(0);
				}

				else if (seq == 1) {
					System.out.println("-게시글 전체조회-");
					Inventory inventory = new Inventory();

					continue;
				} else if (seq == 2) {
					System.out.println("-게시물 등록-");
					System.out.print("제목: ");
					String title = sc.nextLine();
					System.out.print("내용: ");
					String body = sc.nextLine();
					System.out.print("작성자: ");
					String name = sc.nextLine();

					Date nowDate = new Date();
					PutBoardDown put = new PutBoardDown(title, body, name, nowDate);
					System.out.println(put.toString());

					System.out.println("새 글이 정상적으로 등록되었습니다." + '\n');
					continue;
				}

				else if (seq == 3) {
					System.out.print("게시글 번호를 입력하세요: ");
					choice = sc.nextInt();
					sc.nextLine();
					ShowBoard showBoard = new ShowBoard(choice);
					continue;

				} else if (seq == 4) {
					System.out.print("삭제할 게시글 번호를 입력하세요: ");
					choice = sc.nextInt();
					sc.nextLine();
					BoardDelete delete = new BoardDelete(choice);
					continue;
				} else {
					System.out.println("잘못된 값입니다.");
					continue;
				}
			} catch (Exception e) {
				System.out.println("잘못된 값입니다.");
				continue;
			}
		}
	}
}
