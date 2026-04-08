package study.ch19.ex;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
class Book{
    private String isbn;
    private String title;
    private String author;
    private int price;
}

interface  Library{
    void addBook(Book b);
    Book findByIsbn(String isbn);
    List<Book> findByAuthor(String author);
    List<Book> findByPriceRange(int min,int max);
    void printAll();
}

class LibraryImpl implements Library{
    private Map<String, Book> bookMap;

    public LibraryImpl(){
        bookMap = new HashMap<>();
    }
    @Override
    public void addBook(Book b) {
        bookMap.put(b.getIsbn(), b);
    }

    @Override
    public Book findByIsbn(String isbn) {
        return bookMap.get(isbn);
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> newBooks = new ArrayList<Book>();
        for(Book b : bookMap.values()){
            if(b.getAuthor().equals(author)){
                newBooks.add(b);
            }
        }
        return newBooks;
    }

    @Override
    public List<Book> findByPriceRange(int min, int max) {
        List<Book> newBooks = new ArrayList<Book>();
        for(Book b : bookMap.values()){
            if(b.getPrice()>= min && b.getPrice() <= max){
                newBooks.add(b);
            }
        }
        return newBooks;
    }

    @Override
    public void printAll() {
        for(Book book : bookMap.values()){
            System.out.println(book);
        }
    }
}

public class Ex06_T {
    public static void main(String[] args) {
        String searchAuthor = "남궁성";
        Library library = new LibraryImpl ();
        library.addBook(new Book("987-1", "자바의 정석", "남궁성", 35000));
        library.addBook(new Book("987-2", "스프링 입문", "김영한", 32000));
        library.addBook(new Book("987-3", "이펙티브 자바", "조슈아", 36000));

        library.findByIsbn("987-1");
        library.findByAuthor("남궁성").forEach(System.out::println);
        library.findByPriceRange(33000, 36000);
    }
}
