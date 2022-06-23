import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Library {
    public Book[] myBooks;
    public int number;
    public boolean isLent;

    public Library() {
        myBooks = new Book[10];
        number = 0;
        System.out.println("Hello, I am a small library for at most 10 books.");
    }

    public void register(Book book) {
        myBooks[number] = book;
        book.setIsLent();
        number += 1;
        System.out.println("A new book is registered: " + book);  // impliziter book.toString() Aufruf
    }

    public Book search(String title) {
        for (int i = 0; i < number; i++) {
            Book book = myBooks[i];
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        System.out.println("Book '" + title + "' is not in the library.");
        return null;
    }

    public void checkisLent() {
      //  String dupa = title
    }

    public void welcome() {
        System.out.println("Wybierz czynność:");
        System.out.println("1. Zarejestruj nową książkę");
        System.out.println("2. Sprawdź dostępność książki");
        System.out.println("3. Przyjmij zwrot książki");
        Scanner wyborA = new Scanner(System.in);
        int wyborB = wyborA.nextInt();
        if (wyborB == 1) {
            System.out.println("Podaj tytuł książki, którą chcesz zarejestrować: ");
            Scanner regA = new Scanner(System.in);
            String regB = regA.nextLine();
            register(regB);
        }
    }

    /*public void loan() {
        System.out.println("Podaj tytuł wypożyczonej książki: ");
        Scanner tytul = new Scanner(System.in);
        String tytul2 = tytul.nextLine();
        if(tytul2.equals(Book is))

    }*/

    /*public void search2(String tajtel) {
        Scanner tajtelscan = new Scanner(System.in);
        tajtel = tajtelscan.nextLine();
        System.out.println("Podaj tytuł książki: ");
        String[] spis = myBooks;
        if(tajtel.equals(spis[0])){
            System.out.println("Ta książka znajduje się w bazie danych.");
        }
        else {
        }
   }*/
}
