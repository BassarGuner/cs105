package src;
import java.util.ArrayList;
public class member {

    private String fullname;
    private ArrayList<String> borrowed_books;
    private ArrayList<String> returned_books;

    public member(String fullname){

        this.fullname= fullname;
    }


    public listBooks(){

        System.out.println("Currently borrowed books:");
        for(String borrowed_book : borrowed_books)
    }
    public static void main(String[] args) {


    }
}
