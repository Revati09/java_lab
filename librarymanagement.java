// =======================
// 1. Package: LibraryManagement
// =======================

package LibraryManagement;

public class Book {
    public String title;
    public String author;
    public String isbn;

    public Book(String t, String a, String i) {
        title = t;
        author = a;
        isbn = i;
    }

    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}

package LibraryManagement;

public class Member {
    public String name;
    public int memberId;

    public Member(String n, int id) {
        name = n;
        memberId = id;
    }

    public void displayMember() {
        System.out.println("Member Name: " + name);
        System.out.println("Member ID: " + memberId);
    }
}