package com.xworkz.toString.Library;

public class LibraryRunner {
    public static void main(String[] args) {
        Library library = new Library();

        library.setName("City Central Library");
        library.setAddress("123 Main Street, Springfield");
        library.setNumberOfBooks(5000);
        library.setOpen(true);
        library.setLibrarianName("John Doe");
        library.setBookGenres(new String[]{"Fiction", "Non-fiction", "Science", "History", "Biography"});

        System.out.println(library.toString());
    }
}
