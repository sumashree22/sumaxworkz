package com.xworkz.inheritance.book;

public class BookRunner {

        public static void main(String[] args) {
            Book book = new Book();
            book.method1();
            book.method2();
            book.method3();
            book.method4();
            book.method5();

            Novel novel = new Novel();
            novel.sub1();
            novel.sub2();
            novel.sub3();
            novel.sub4();
            novel.sub5();

            Book book1 = new Novel();
            book1.method1();
            book1.method2();
            book1.method3();
            book1.method4();
            book1.method5();
        }

}
