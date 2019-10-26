package com.apple.six;

public class BookManager {
    public static void main(String[] args){
        //x子类访问父类的 protect 成员变量
        Dictionary dictionary = new Dictionary("INB001","CookBook",90,9);
        //将int类型转为String类型
        int pages = dictionary.pages;
        
        display(String.valueOf(pages));
        display(dictionary.getDefinitons());

        Book book = new Book("INB002","jAMES", 98, 70);
        display(book.getBookId());
        Book bookdictionary = new Book("INB003","Tomes",98,8);
        display(bookdictionary.getBookId());

    }

    private static void display(String content) {
        System.out.println(content);
    }
}
