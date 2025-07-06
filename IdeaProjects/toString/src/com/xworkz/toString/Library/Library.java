package com.xworkz.toString.Library;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Library {
    private String name;
    private String address;
    private int numberOfBooks;
    private boolean isOpen;
    private String librarianName;
    private String[] bookGenres;

    @Override
    public String toString() {
        return "Library Details:\n" +
                "Name = " + this.name + "\n" +
                "Address = " + this.address + "\n" +
                "Number of Books = " + this.numberOfBooks + "\n" +
                "Is Open = " + this.isOpen + "\n" +
                "Librarian Name = " + this.librarianName + "\n" +
                "Book Genres = " + String.join(", ", this.bookGenres);
    }
}

