package com.company.LivingRoom;

public class LivingRoom {
    public static void main(String[] args) {

        Book silentSuffering = new Book("Milica Lucic", "Silent Suffering", 432);
        Book annaKarenina = new Book("Leo Tolstoy", "Anna Karenina", 1100);

        BookCase bookcase = new BookCase(4, "horror", new Book [] {silentSuffering, annaKarenina});

        bookcase.store();

    }
}
