package com.codepath.android.booksearch.models;

import java.io.Serializable;
@Parcler
public class BookParcler {
    private String openLibraryId;
    private String author;
    private String title;

    public BookParcler() {

    }

    public BookParcler(String openLibraryId, String author, String title) {
        this.openLibraryId = openLibraryId;
        this.author = author;
        this.title = title;
    }
}
