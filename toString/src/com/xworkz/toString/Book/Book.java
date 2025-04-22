package com.xworkz.toString.Book;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private String genre;
    private double price;
    private boolean isBestSeller;
    private int pages;

    @Override
    public String toString() {
        return "Book Details:\n" +
                "Title = " + this.title + "\n" +
                "Author = " + this.author + "\n" +
                "Publication Year = " + this.publicationYear + "\n" +
                "Genre = " + this.genre + "\n" +
                "Price = ₹" + this.price + "\n" +
                "Is Best Seller = " + this.isBestSeller + "\n" +
                "Pages = " + this.pages;
    }
}

