package com.mycompany.librarymanagement;
public class Book {
    private String booktitle;
    private String author;
    private String isbn;
    private boolean status;
    public Book(String booktitle,String author,String isbn){
        this.booktitle=booktitle;
        this.author=author;
        this.isbn=isbn;
        this.status=true;
    }
       public String getBooktitle(){
              return booktitle;
       }
 
       public String getAuthor(){
              return author;
       }
   
       public String getIsbn(){
              return isbn;
       }
       public boolean getStatus(){
              return status;
       }
       
       public void setStatus(boolean status){
           this.status=status;
       }
   

       
    
    
}
