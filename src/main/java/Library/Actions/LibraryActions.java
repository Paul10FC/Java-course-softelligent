package Library.Actions;

import Library.Entities.Book;
import Library.Entities.Magazine;
import Library.Library;
import Library.LibraryItem;

import java.util.Scanner;

public class LibraryActions {
    public static void doLibraryAction(){

        boolean isActionProgramFinished = false;
        while (!isActionProgramFinished){
            System.out.println("What action do you want to do?");
            System.out.println("(1) Loan an item\t(2) Return an item\t(3) Watch list of books\t(0) Return");

            Scanner sc = new Scanner(System.in);
            int actionSelected = sc.nextInt();

            switch (actionSelected){
                case 1 -> loanItem();
                case 2 -> returnItem();
                case 3 -> watchBooks();
                case 0 -> isActionProgramFinished = true;
                default -> System.out.println("Invalid selection, try again");
            }
        }
    }

    private static void watchBooks() {
        System.out.println("(1) Loan Magazines\t(2) Loan Books\t(3) All items\t(0) Return");
        Scanner sc = new Scanner(System.in);
        int watchOption = sc.nextInt();

        switch (watchOption){
            case 1 -> Library.loanedMagazine.forEach(Magazine::getInfoItem);
            case 2 -> Library.loanedBook.forEach(Book::getInfoItem);
            case 3 -> Library.libraryItemList.forEach(LibraryItem::getInfoItem);
            case 0 -> System.out.println("Return it...");
            default -> System.out.println("Invalid selection");
        }
    }

    // TO DO REFACTOR
    private static void returnItem() {
        boolean isValidSelection = false;

        while (!isValidSelection) {
            System.out.println("What item do you want return");
            System.out.println("(1) Book\t(2) Magazine\t(0) Return");
            Scanner sc = new Scanner(System.in);
            int typeOfReturn = sc.nextInt();

            switch (typeOfReturn) {

                case 1 -> {
                    System.out.println("Select your item id to return");
                    int idToReturn = sc.nextInt();
                    for (int i = 0; i < Library.loanedBook.size(); i++) {
                        Book actualBook = Library.loanedBook.get(i);
                        if (actualBook.getId() == idToReturn) {
                            actualBook.returnItem();
                        } else if ( i == (Library.loanedBook.size() - 1)) {
                            System.out.println("the id your selected isn´t exist o loan");
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Select your item id to return");
                    int idToReturn = sc.nextInt();
                    for (int i = 0; i < Library.loanedMagazine.size(); i++) {
                        Magazine magazine = Library.loanedMagazine.get(i);
                        if (magazine.getId() == idToReturn) {
                            magazine.returnItem();
                        } else if ( i == (Library.loanedBook.size() - 1)) {
                            System.out.println("the id your selected isn´t exist o loan");
                        }
                    }
                }
                default -> isValidSelection = true;
            }
        }
    }

    // TO DO REFACTOR
    private static void loanItem() {
        System.out.println("Great choose");
        System.out.println("Please type the id of the item do you want to loan");

        Scanner sc = new Scanner(System.in);
        int idSelected = sc.nextInt();

        for (int i = 0; i < Library.libraryItemList.size(); i++) {
            LibraryItem item = Library.libraryItemList.get(i);

            if (item.getId() == idSelected){
                if (item.isAvailability()){
                    if (item instanceof Book) {
                        ((Book) item).loanItem();

                    } else {
                        ((Magazine) item).loanItem();

                    }
                } else {
                    System.out.println(item.getTitle() + " isn´t available to loan");
                }
                break;
            } else if (i == (Library.libraryItemList.size() - 1)) {
                System.out.println("Invalid id, we dont find your book");
            }
        }
    }


}
    