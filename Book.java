<<<<<<< HEAD
package com.apple.six;

public class Book {
    private String bookId;
    private String bookName;
    protected int pages;

    public Book(String bookId, String bookName, int i, int pages) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.pages = pages;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
=======
package com.apple.chaptersix;

public class Book {
    int pages;

    double price;

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    public void Book(int pages, double price) {
        this.pages = pages;
        this.price = price;
    }
            }
>>>>>>> first idea
