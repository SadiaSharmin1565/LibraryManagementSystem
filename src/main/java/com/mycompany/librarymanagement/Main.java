package com.mycompany.librarymanagement;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Library system=new Library();
        Scanner scanner=new Scanner(System.in);
        int option;
        while (true){
            System.out.println("Library Management System");
            System.out.println("1.Add Book");
            System.out.println("2.Book List");
            System.out.println("3.Search Book");
            System.out.println("4.Add Member");
            System.out.println("5.Member List");
            System.out.println("6.Issue Book");
            System.out.println("7.Return Book");
            System.out.println("8.Exit");
            
            System.out.println("Enter your option:");
            option=scanner.nextInt();
            scanner.nextLine();
            
            switch(option){
            case 1:
                System.out.println("***** Add Book *****");
                System.out.println("Enter Book Title:");
                String booktitle=scanner.nextLine();
                System.out.println("Enter Book Author:");
                String author=scanner.nextLine();
                System.out.println("Enter Book ISBN:");
                String isbn=scanner.nextLine();
                
                Book book= new Book(booktitle,author,isbn);
                system.addbook(book);
                break;
            case 2:
                
                System.out.println("***** Book List *****");
                system.displayBook();
                break;
            case 3:
                System.out.println("***** Search Book *****");
                System.out.println("Enter Book Title:");
                String title=scanner.nextLine();
                system.searchBook(title);
                break;
            case 4:
                System.out.println("***** Add Member *****");
                System.out.println("Enter Member Type(Student or Teacher):");
                String type=scanner.nextLine();
                System.out.println("Enter Member Name:");
                String name=scanner.nextLine();
                System.out.println("Enter Member ID:");
                String memberId=scanner.nextLine();
                
                if(type.equalsIgnoreCase("Student")){
                    Student student= new Student(name,memberId);
                    system.addmember(student);
                }else if(type.equalsIgnoreCase("Teacher")){
                    Student teacher= new Student(name,memberId);
                    system.addmember(teacher);
                }else{
                    System.out.println("Invaild Type");
                }
                break;
            case 5:
                System.out.println("***** Member List *****");
                system.displayMember();
                break;
            case 6:
                System.out.println("***** Borrow Book *****");
                System.out.println("Enter Book Title:");
                String bookname=scanner.nextLine();
                System.out.println("Enter Member ID:");
                String mid=scanner.nextLine();
                system.takebook(bookname, mid);
                break;
                
            case 7:
                System.out.println("***** Return Book *****");
                System.out.println("Enter Book Title:");
                String bname=scanner.nextLine();
                System.out.println("Enter Member ID:");
                String mbid=scanner.nextLine();
                system.returnedbook(bname, mbid);
                break;
            case 8:
                System.out.println("Exit");
                scanner.close();
                System.exit(0);
            default:
                System.out.println("***** Invaild Option. Please Try Again *****");
                break;
            }
  
            
        
        
        
        
        
        }



    }
    
}
