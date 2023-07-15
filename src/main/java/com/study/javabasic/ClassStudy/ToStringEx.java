package com.study.javabasic.ClassStudy;

import lombok.extern.slf4j.Slf4j;

class Book{
    int bookNumber;
    String bookName;

    public Book(int bookNumber, String bookName) {
        this.bookNumber = bookNumber;
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return bookName + ", " + bookNumber;
    }
}

@Slf4j
public class ToStringEx {
    public static void main(String[] args) {
        Book book = new Book(123, "test1Book");

        System.out.println("book : "+book);
        log.info(book.toString());
    }
}


