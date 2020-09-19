package APP;

import Service.BookService;
import VO.Book;

import java.util.Scanner;

public class BookStoreApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookService service = new BookService();

        while (true) {

            System.out.println("===========================================");
            System.out.println("1.사용자메뉴    2.도서메뉴");
            System.out.println("===========================================");

            System.out.print("메뉴를 선택하세요 : ");
            String menuNo = sc.next();

            if (menuNo.equals("1")) {
                System.out.println("사용자메뉴를 선택하셨습니다.");

            } else if (menuNo.equals("2")) {
                System.out.println("도서메뉴를 선택하셨습니다.");
                System.out.println("-------------------------");
                System.out.println("1.도서 등록  2. 전체도서조회");
                System.out.println("-------------------------");
                int bookMenuNo = sc.nextInt();

                if (bookMenuNo == 1) {
                    Book book = new Book("임시제목", "임시작가", "임시출판사", 1, 1);
                    service.insertBook(book);
                } else if (bookMenuNo == 2) {
                    service.selectAllBooks();
                }

            } else {
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}
