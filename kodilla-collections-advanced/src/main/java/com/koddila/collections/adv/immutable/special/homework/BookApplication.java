package com.koddila.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book panTadeusz = BookMenager.createBook("Pan Tadeusz", "Adam Mickiewicz");
        Book bible = BookMenager.createBook("bible", "unknown");
        Book bible2 = BookMenager.createBook("bible", "unknown");

        System.out.println(panTadeusz.hashCode());
        System.out.println(bible.hashCode());
        System.out.println(bible2.hashCode());
        System.out.println(bible2 == bible);
        System.out.println(bible2.equals(bible));
        System.out.println(BookMenager.books.size());
    }
}
