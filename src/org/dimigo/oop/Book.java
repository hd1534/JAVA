package org.dimigo.oop;

public class Book {
    private String title; // = "미생";
    private String author; // = "윤태호";
    private int page; // = 1000;

    public Book()
    {
        System.out.println("기본 생성자");
    }

    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public Book(String title, String author) {
        this(title, author, '\0');
    }

    public Book(String title) {
        this(title, "\0");
    }


    // alt + insert -> generate setter and getter
    // getter
    public String getTitle()
    {
        return title;

    }

    public String getAuthor()
    {
        return author;

    }

    public int getPage()
    {
        return page;

    }

    // setter
    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void print() {
        System.out.println("제목 : " +  title);
        System.out.println("작가 : " + author);
        System.out.println("가격 : " + page);
    }
    /*
    // toString을 구현한경우 그냥 value.toString으로 호출하지 않고 value로 실행해도 toString의 값이 나온다.
    public String toString() {
        return "제목 : " +  title + '\n'
                + " 작가 : " + author + '\n'
                + "가격 : " + page;
    }
*/

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", page=" + page +
                '}';
    }
}

