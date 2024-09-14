package com.mycompany.librarymanagement;

import java.util.ArrayList;
import java.util.List;
abstract class Member {
    private String name;
    private String memberId;
    public List<Book> borrowBooks= new ArrayList<>();
    
    public Member(String name, String memberId){
        this.name=name;
        this.memberId=memberId;
    }
    
    public String getName(){
        return name;
    }
    
    public String getMemberId(){
        return memberId;
    }
    
    public List<Book> getBorrowBooks(){
        return borrowBooks;
    }
    public abstract boolean borrowBook(Book book);
    
    public void  returnBook(Book book){
        if(borrowBooks.contains(book)){
            borrowBooks.remove(book);
            book.setStatus(true);
            System.out.println("Returned");
        }else{
            System.out.println("Invaild");
        }
        
    }
}
