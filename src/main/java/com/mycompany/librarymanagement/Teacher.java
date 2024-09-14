
package com.mycompany.librarymanagement;

class Teacher extends Member{
    
     private int maxBooks=10;
     
     public Teacher(String name, String memberId){
         super(name,memberId);
     }
    
    @Override
    public boolean borrowBook(Book book){
        if(borrowBooks.size() >= maxBooks){
            System.out.println("Your Limit Out");
            return false;
        }
        
        if(!book.getStatus()){
            System.out.println("Book Is Not In Stock");
            return false;
            
            
        }
        
        borrowBooks.add(book);
        book.setStatus(false);
        System.out.println("Successful");
        return true;
    }
    
}

