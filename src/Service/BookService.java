package Service;

import VO.Book;

import java.util.ArrayList;

public class BookService {
    private ArrayList<Book> savedBook = new ArrayList<Book>();

    public BookService() {
        Book b1 = new Book("자바의 정석", "남궁 성", "한빛미디어", 35000, 100);
        Book b2 = new Book("모모", "미하엘 엔데", "비룡소", 15000, 100);
        Book b3 = new Book("백석 정본 시집", "고형진", "창작과 비평", 27000, 0);

        savedBook.add(b1);
        savedBook.add(b2);
        savedBook.add(b3);
    }

    public void insertBook(Book book) {
        System.out.println("[도서 저장 서비스]");
        System.out.println("책 정보를 저장합니다...");
        // 책 정보를 받아와서 savedBook에 저장합니다.
        System.out.println("책 정보 저장 성공!");
    }

    public void selectAllBooks() {
        System.out.println("[모든 도서 조회 서비스]");
        System.out.println("모든 책 정보를 조회합니다...");
        // 모든 저장된 책의 간단한 정보를 화면에 표시합니다.
        System.out.println("책 정보 조회 끝!");
    }

    public void selectBookByTitle(String title) {
        System.out.println("[제목 검색 서비스]");
        System.out.println("입력받은 제목: " + title);
        System.out.println("책을 검색합니다...");
        // 저장된 책 중에서 제목에 일치하는 책이 있다면 화면에 표시하고, 없다면 "책 정보 없음!" 문구를 표시합니다.
        System.out.println("책 정보 조회 끝!");
    }

    public void updateBookInfo() {
        System.out.println("[책 정보 수정 서비스]");
        System.out.println("책 정보를 수정합니다..");
        // 입력파라미터로 필요한 정보를 받고, 저장된 책의 정보를 수정합니다.
        System.out.println("책 정보 수정 끝!");
    }
}
