/*
write a java program to create class book having data members bookid, bookname and bookprice. Accept and display data for one object.
*/
import java.util.*;
class book {
    int book_id;
    String book_name;
    float book_price;
    void get_book_info()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Book ID: ");
        book_id=s.nextInt();
        System.out.println("Enter Book Name:");
        book_name=s.next();
        System.out.println("Enter Book Price: ");
        book_price=s.nextFloat();
    }
    void disp_book_info()
    {
        System.out.println("Book ID: "+book_id);
        System.out.println("Book Name: "+book_name);
        System.out.println("Book Price: "+book_price);

    }
    public static void main(String args[])
    {
        book b1=new book();
        b1.get_book_info();
        b1.disp_book_info();
    }
}
