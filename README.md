You have been tasked with designing a simple . The system should allow the user to perform basic operations such as adding books, searching for books, issuing books to members, and returning books. Additionally, the system should manage members and allow for differentiated handling of and .

:
Design classes to represent:
Book: Represents a book in the library. Contains information like book title, author, ISBN, and availability status.
Member: Represents a library member. This class should have basic member details such as name, member ID, and the list of borrowed books.
Student and Teacher: These should inherit from Member but should have different borrowing limits (e.g., a student can borrow a maximum of 5 books, while a teacher can borrow 10).
Library: Manages the collection of books and the list of members. Contains methods to add books, issue books to members, return books, and search for books.

:
Use or attributes where appropriate. For example, ensure that certain details (such as the availability of a book) cannot be modified directly from outside the class.

:
Create abstract methods for any shared functionality between Member subclasses, for example, an abstract method borrowBook() that is overridden in both Student and Teacher subclasses.

:
Implement to demonstrate polymorphism, where the behavior of borrowing books differs between students and teachers.

:
Demonstrate inheritance by having Student and Teacher classes inherit from the Member base class.
