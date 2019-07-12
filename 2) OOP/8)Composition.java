package com.mert.javatutorial;
import java.io.*; 
import java.util.*; 

//Kitap Sınıfı
class Book{
    public String title;
    public String author;

    Book(String title, String author){
        this.title=title;
        this.author=author;
    }
}

//Kütüphane Sınıfı: Kitap sınıfını liste olarak kapsıyor
class Library{
    private final List<Book> books;
    
    Library(List<Book> books){
        this.books=books;
    }

    public List<Book> getAllBooksInLibrary(){
        return books;
    }
}

public class Test{
    public static void main (String[] args){
        Book b1 = new Book("Sokratesin Savunması","Platon");
        Book b2 = new Book("Eylül","Mehmet Rauf");
        Book b3 = new Book("Suç ve Ceza","Dostoyevski");
        Book b4 = new Book("Tabu","Freud");

        List<Book> books = new ArrayList<Book>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);

        Library library = new Library(books);

        List<Book> kitaplar = library.getAllBooksInLibrary();
        for(Book kitap : kitaplar){
            System.out.println("Kitap Adı: "+kitap.title+" / Yazar: "+kitap.author);
        }
    }
}