package service;

import vo.Book;

import java.util.ArrayList;

public class BookService {
    private ArrayList<Book> savedBook = new ArrayList<Book>();

    public BookService() {
        Book b1 = new Book("What is Java", "NamGung Sung", "HanBit Media", 35000, 100);
        Book b2 = new Book("Momo", "Michael Ende", "BiRyongSo", 15000, 100);
        Book b3 = new Book("BaekSeok Poems", "H.J. Go", "Creation and Criticism", 27000, 0);

        savedBook.add(b1);
        savedBook.add(b2);
        savedBook.add(b3);
    }

    public void insertBook(Book book) {
        System.out.println("[Book Saving Service]");
        System.out.println("Saving Book Info...");
        savedBook.add(book);
        System.out.println("Success Saving Book Info!");
    }

    public void selectAllBooks() {
        System.out.println("[All Book Searching Service]");
        System.out.println("Searching All Book Info...");
        // 모든 저장된 책의 간단한 정보를 화면에 표시합니다.
        System.out.println("Success Searching All Book Info!");
    }

    public void selectBookByTitle(String title) {
        System.out.println("[Book Searching With Book Title Service]");
        System.out.println("Title Keyword: " + title);
        System.out.println("Searching Book with Keyword...");
        // 저장된 책 중에서 제목에 일치하는 책이 있다면 화면에 표시하고, 없다면 "No Matching Book Info!" 문구를 표시합니다.
        System.out.println("Success Searching Book Info With Title!");
    }

    public void updateBookInfo() {
        System.out.println("[Book Info Modifying Service]");
        System.out.println("Modifying Book Info..");
        // 입력파라미터로 필요한 정보를 받고, 저장된 책의 정보를 수정합니다.
        System.out.println("Success Modifying Book Info!");
    }
}
