import java.util.ArrayList;
import java.util.Scanner;


/**
 * Created by Millicent, Nicole, and Teron on 2/20/2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int choice = 0;

        ArrayList<Book> catalogue = new ArrayList<Book>();

        ///CREATE BOOK FROM HARD-CODED VALUES


        ///USER PROMPT///
        System.out.println("Would you like to see the books we have available today? Enter 1 for yes and 2 for no. ");
        //GET USER INPUT
        int userInput = scan.nextInt();
        if (userInput == 2) {
            System.out.println("Goodbye. Visit us again soon.");
        }

        //create Book from hard-coded values and adds them
        // to the catalogue

        Book b1 = new Book("Charles Dickens", "Great Expectations",
                "Print", "Fiction", "Checked In");

        Book b2 = new Book("Clement C. Moore", "The Night Before Christmas",
                "Print", "Fiction", "Checked In");

        Book b3 = new Book("William Shakespeare", "The Tempest",
                "Print", "Fiction", "Checked In");

        Book b4 = new Book("Christopher Greyson", "And Then She Was Gone",
                "Print", "Fiction", "Checked In");

        Book b5 = new Book("Ron Chernon", "Alexander Hamilton",
                "Digital", "Nonfiction", "Checked In");

        Book b6 = new Book("Clark Weber", "Cooking Light",
                "Print", "Nonfiction", "Checked In");

        Book b7 = new Book("William Shakespeare", "Macbeth",
                "Print", "Fiction", "Checked In");

        Book b8 = new Book("Thug Kitchen", "Thug Kitchen LLC",
                "Print", "Nonfiction", "Checked In");


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
            choice = scan.nextInt();
            if (choice == 1) {
                catalogue.get(index);
                System.out.println("Enjoy your book.");
                if (catalogue.isEmpty()) {
                    System.out.println("That book is unavailable.");
                    return;

                    ///USER PROMPT///
                    System.out.println("What would you like to do?");
                    System.out.println("1-See all books");
                    System.out.println("2-Search by author");
                    System.out.println("3-Search by title");
                    System.out.println("4-Return a book");
                    System.out.println("5-Exit system");
                    //GET USER INPUT
                    userInput = scan.nextInt();

                    //if-else or switch with menu options based on user input

                    //Option 1: see all books
                    if (userInput == 1) {
                        //output Books
                        for (int i = 0; i < catalogue.size(); i++) {
                            System.out.println((i + 1) + ". " + catalogue.get(i));
                        }
                        System.out.println("Which book would you like to look at today?");
                        index = scan.nextInt();
                        System.out.println(catalogue.get(index - 1));

                        //look to see if the book is already checked out
                        //if it is, skip the would you like to checkout question
                        System.out.println("Would you like to checkout this book today?");
                        System.out.println("Please enter 1 for Yes and 2 for No.");
                        choice = scan.nextInt();
                        if (choice == 1) {
                            //check if the status for this book is already checked out
                            if (catalogue.get(index - 1).getStatus().equals("Checked Out")) {
                                //if it is, tell the user they can't
                                System.out.println("That book is unavailable.");
                            } else {
                                //if not (else), check it out
                                catalogue.get(index - 1).checkOut();
                                System.out.println("Enjoy your book.");
                            }

                        } else {
                            System.out.println("Please make another choice");

                        }
                    } else {
                        System.out.println("Please make another choice");
                    }
                    //end option 1: see all books\

                    //option 2: search by author: nicole
                    //prompt for an author
                    //get input, put into author variable
                    //book b = getBookAuthor(author,catalog);
                    //prompt if user wants to check out
                    //if so, check out
                    //end option 2: search by author

                    //option 3: search by title: teron
                    //prompt for an title
                    //get input, put into title variable
                    //book b = getBookTitle(title,catalog);
                    //prompt if user wants to check out
                    //if so, check out
                    //end option 3: search by title


                    //option 4: Return a book:millicent
                    //display list of all* books with numbers
                    //  *eventual possible stretch goal:
                    //  display only checked out books
                    //ask which to return
                    //take an int input
                    //check if the book is checked out
                    //if so, check in
                    //thank the user
                    //end option 4: return a books


                    //option 5: quit
                    if (userInput == 2) {
                        System.out.println("Goodbye. Visit us again soon.");
                        return;



                        //end option 5: quit
                    }

                }


            }


        }