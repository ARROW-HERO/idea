package com.apple.six;

public class Dictionary {
    public int pages;
    private int definitons;

    public Dictionary(int definitons){
        this.definitons = definitons;
    }
    public Dictionary(String bookId,String bookName,int pages,int definitons){
        super(bookId,bookName,pages);
        this.definitons = definitons;
    }
    public int getDefinitons(){
        return definitons;
    }
    public void setDefinitons(int definitons){
        this.definitons = definitons;
    }
    //覆盖
    public  String getBookId(){
        return DICTIONARY_SKU + super.getBookId();
    }
}
