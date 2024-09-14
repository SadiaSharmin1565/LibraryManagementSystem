
package com.mycompany.librarymanagement;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books= new ArrayList<>();
    private List<Member> members= new ArrayList<>();
    
    public void addbook(Book book){
        books.add(book);
        System.out.println("Book Title:"+book.getBooktitle());
    }
    
    public void addmember(Member member){
        members.add(member);
        System.out.println("Member Name:"+member.getName());
    }
    
    
    
    public void returnedbook(String btitle,String mid){
        
        Member member = null;
        Book book = null;
        
        for(Member checkMember: members){
            if(checkMember.getMemberId().equals(mid)){
                member=checkMember;
                break;
            }
        }
        
        if(member!=null){
            for(Book checkBook: member.getBorrowBooks()){
                
                if(checkBook.getBooktitle().equalsIgnoreCase(btitle)){
                    book=checkBook;
                    break;
                }
            }
            
            if(book !=null){
                member.returnBook(book);
            }else{
                System.out.println("Not Matched");
            }
        }else{
            System.out.println("Not Found");
        }
    }
    
    public void takebook(String name,String id){
        
        Book book = null;
        for(Book checkBook: books){
            if(checkBook.getBooktitle().equalsIgnoreCase(name)){
                book=checkBook;
                break;
            }
        }
        if(book==null){
            System.out.println("Book Is Not Found");
            return;
        }
        for(Member member: members){
            if(member.getMemberId().equalsIgnoreCase(id)){
                member.borrowBook(book);
                return;
            }
        }
        System.out.println("Book Is Not Found");
    }
   
    public void displayMember(){
        if(members.isEmpty()){
            System.out.println("Data Is Not Found");
        }else{
            for(Member member:members){
                System.out.println("Member Name: "+ member.getName() + "Member  Id:" + member.getMemberId());
            }
        }
    }
    
     public void displayBook(){
        if(books.isEmpty()){
            System.out.println("Data Is Not Found");
        }else{
            for(Book book:books){
                System.out.println("Book Title: "+ book.getBooktitle() + " Book  Author: " + book.getAuthor() + " Book Isbn: "+ book.getIsbn() + " Book Status : "+ book.getStatus());
            }
        }
    }
    
    public void searchBook(String title){
        
        for(Book book:books){
            if(book.getBooktitle().equals(title)){
                String status=book.getStatus() ? " In Stock ":" Out of Stock ";
                System.out.println("Name: "+book.getBooktitle() + "Author: "+ book.getAuthor() + "Status: "+ status);
                return;
            }
        }
        System.out.println("Not Found");    
    }
        
    
    
}
