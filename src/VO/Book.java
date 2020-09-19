package VO;

public class Book {
    private String title;
    private String writer;
    private String publisher;
    private long price;
    private long stock;

    public Book() {}

    public Book(String title, String writer, String publisher, long price, long stock) {
        super();
        this.title = title;
        this.writer = writer;
        this.publisher = publisher;
        this.price = price;
        this.stock = stock;
        System.out.println("[System: 새로운 Book 객체 생성됨]");
        System.out.println("[System: Book 객체에 입력된 정보: " + title + ", " + writer + ", " + publisher + ", " + price + ", " + stock + "]");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getStock() {
        return stock;
    }

    public void setStock(long stock) {
        this.stock = stock;
    }
}
