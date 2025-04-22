package com.xworkz.toString.Book;

public class BookRunner {
    public static void main(String[] args) {
        Book book = new Book();

        book.setTitle("Atomic Habits");
        book.setAuthor("James Clear");
        book.setPublicationYear(2018);
        book.setGenre("Self-Help");
        book.setPrice(450.00);
        book.setBestSeller(true);
        book.setPages(320);

        System.out.println(book.toString());
    }
}

