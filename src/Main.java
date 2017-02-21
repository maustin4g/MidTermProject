import java.util.ArrayList;
import java.util.Scanner;


/**
 * Created by Millicent, Nicole, and Teron on 2/20/2017.
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Book>catalogue = new ArrayList<Book>();
        Scanner scan = new Scanner(System.in);

        ///USER PROMPT///
        System.out.println("Would you like to see the books we have available today? Enter 1 for yes and 2 for no. ");
        //GET USER INPUT
        int userInput = scan.nextInt();
        if (userInput ==2){
            System.out.println("Goodbye. Visit us again soon." );
        }

        //create Book from hard-coded values and adds them
        // to the catalogue

                Book b1 = new Book("Charles Dickens", "Great Expectations","Print",
                        "Fiction","Checked In");
                Book b2 = new Book("Clement C. Moore", "The Night Before Christmas","Print",
                "Fiction","Checked In");
                Book b3 = new Book("William Shakespeare", "The Tempest","Print",
                "Fiction","Checked In");
                Book b4 = new Book("Christopher Greyson", "And Then She Was Gone","Print",
                "Fiction","Checked In");
                Book b5 = new Book("Ron Chernon", "Alexander Hamilton","Digital",
                "Nonfiction","Checked In");
                Book b6 = new Book("Clark Weber", "Cooking Light","Print",
                "Nonfiction","Checked In");
                Book b7 = new Book("William Shakespeare", "Macbeth","Print",
                "Fiction","Checked In");
                Book b8 = new Book("Thug Kitchen", "Thug Kitchen LLC","Print",
                "Nonfiction","Checked In");

                //ADD BOOKS TO ARRAYLIST
                catalogue.add(b1);
                catalogue.add(b2);
                catalogue.add(b3);
                catalogue.add(b4);
                catalogue.add(b5);
                catalogue.add(b6);
                catalogue.add(b7);
                catalogue.add(b8);

        //loop until all books are printed and checked out
             while (true) {
                     //output Books
               for (int i = 0; i < catalogue.size(); i++) {
                System.out.println(i + ".) " + catalogue.get(i));
                  }
            System.out.println("Which book would you like to look at today?");
           int index = scan.nextInt();
           System.out.println(catalogue.get(index));
           System.out.println("Would you like to checkout this book today?");
            System.out.println("Please enter 1 for Yes and 2 for No.");
            int choice = scan.nextInt();
           if(choice == 1){
           catalogue.get(index);
            System.out.println("Enjoy your book.");
                if(catalogue.isEmpty()){
                    System.out.println("That book is unavailable.");
                    return;
                     }
                } else {
                System.out.println("Please make another choice");
                }
            }
        }
}


