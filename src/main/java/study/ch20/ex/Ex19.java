package study.ch20.ex;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@Builder
class Book{
    private String isbn;
    private String title;
    private String author;
    private int price;
}

@Data
class Library{
    private Map<String, Book> bookMap = new HashMap<String,Book>();

    public void addBook(Book b){
        bookMap.put(b.getIsbn(), b);
    }

    public Book findByIsbn(String isbn){
        return bookMap.get(isbn);
    }

    public List<Book> findByAuthor(String author){
        List<Book> retBook = new ArrayList<>();
        for(Book b : bookMap.values()){
            if(b.getAuthor().equals(author)){
                retBook.add(b);
            }
        }

        return retBook;
    }

    public List<Book> findByPriceRange(int min, int max){
        // 가격 범위 검색
        List<Book> retBook = new ArrayList<>();
        int price = 0;
        for(Book b : bookMap.values()){
            price = b.getPrice();
            if(price >= min && price <= max) {
                retBook.add(b);
            }
        }
        return retBook;
    }

    void printAll(){
        for(Book b : bookMap.values()){
            System.out.println(b.getIsbn() + "(\"" + b.getTitle() + "\", \"" + b.getAuthor() + "\", " +b.getPrice() + ")");
        }
    }
}

public class Ex19 {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = Book.builder().isbn("978-1").title("자바의 정석").author("남궁성").price(35000).build();
        Book book2 = Book.builder().isbn("978-2").title("스프링 입문").author("김영한").price(32000).build();
        Book book3 = Book.builder().isbn("978-3").title("이펙티브 자바").author("조슈아").price(36000).build();
//        Book book4 = Book.builder().isbn("978-1").title("자바의 정석").author("남궁성").price(35000).build();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println(library.findByIsbn("978-1"));

        System.out.println("저자 검색 " + library.findByAuthor("남궁성"));
        System.out.println("가격 범위 검색 " + library.findByPriceRange(33000, 36000));

        library.printAll();

    }
}
