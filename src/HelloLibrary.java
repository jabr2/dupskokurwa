/*
 * Lehrstuhl Softwaretechnologie, TU Dresden, Datei HelloLibrary.java
 *
 * HelloLibrary-Klasse implementiert eine Anwendung,
 * die die Aufnahme von Büchern simuliert
 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class HelloLibrary {
    // Simulation durch main()
    public static void main(String[] args) {
        Library library = new Library();
        Book umlBook = new Book("UML");
        Book javaBook = new Book("Java");
        Boolean czynnosc = true;
        while (czynnosc) {
            library.welcome();

        }
        System.out.println("Wybierz czynność:");
        System.out.println("1. Zarejestruj nową książkę");
        System.out.println("2. Sprawdź dostępność książki");
        System.out.println("3. Przyjmij zwrot książki");
        library.register(umlBook);
        library.register(javaBook);
        System.out.println(Arrays.toString(library.myBooks));
        //System.out.println(library.myBooks[number]);
        System.out.println(library.search("dupa"));
        //System.out.println(javaBook.isLent);
    }


}
