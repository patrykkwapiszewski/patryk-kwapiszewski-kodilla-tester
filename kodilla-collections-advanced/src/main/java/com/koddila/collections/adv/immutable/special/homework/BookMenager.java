package com.koddila.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookMenager {
    public static List<Book> books = new ArrayList<>();

    public static Book createBook(String title, String author) {
        return new Book(title,author);
    }
}
