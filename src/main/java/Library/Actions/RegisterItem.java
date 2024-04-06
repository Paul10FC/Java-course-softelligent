package Library.Actions;

import Library.Entities.Book;
import Library.Entities.Magazine;
import Library.Genres;
import Library.LibraryItem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;

import static Library.Library.libraryItemList;

public class RegisterItem {
    public static void registerItemProgram() {
        boolean isItemSelectedSuccessfully = false;
        System.out.println("What kind of item do you want register?");
        System.out.println("(1) Book\t(2) Magazine\t(0) Return");

        while (!isItemSelectedSuccessfully){

            Scanner sc = new Scanner(System.in);
            int optionSelected = sc.nextInt();

            if (optionSelected == 1 || optionSelected == 2){
                registerItem(optionSelected);
                isItemSelectedSuccessfully = true;

            } else if (optionSelected == 0) {
                isItemSelectedSuccessfully = true;

            } else {
                System.out.println("Invalid option, try again");
            }
        }
    }

    private static void registerItem(int typeOfItem) {

        Scanner itemData = new Scanner(System.in);

        System.out.println("Write the item's title: ");
        String title = itemData.nextLine();

        Optional<Genres> genre = chooseGenre();

        System.out.println("Write the release year");
        int year = itemData.nextInt();

        System.out.println("Write the release month");
        int month = itemData.nextInt();

        System.out.println("Write the release day");
        int day = itemData.nextInt();

        String releaseDate = generateReleaseDate(day, month, year);

        int id = generateId();

        if (typeOfItem == 1){
            Scanner sc = new Scanner(System.in);
            System.out.println("Write the auth");
            String auth = sc.nextLine();

            libraryItemList.add(new Book(id, title, true, genre.get(), releaseDate, auth));
            System.out.println("Great! Book register with id " + id);
        } else {
            libraryItemList.add(new Magazine(id, title, true, genre.get(), releaseDate));
            System.out.println("Great! Magazine Register with id " + id);
        }
    }

    private static Optional<Genres> chooseGenre() {
        boolean isValidGenre = false;
        Optional<Genres> genre = Optional.empty();

        while (!isValidGenre) {
            System.out.println(
                    """
                            Please choose the item genre
                            (1) Horror
                            (2) Fantastic
                            (3) Fiction
                            (4) Animals
                            """
            );
            Scanner sc = new Scanner(System.in);
            int genreSelected = sc.nextInt();

            switch (genreSelected){
                case 1 -> {
                    genre = Optional.of(Genres.HORROR);
                    isValidGenre = true;
                }
                case 2 -> {
                    genre = Optional.of(Genres.FANTASTIC);
                    isValidGenre = true;
                }
                case 3 -> {
                    genre = Optional.of(Genres.FICTION);
                    isValidGenre = true;
                }
                case 4 -> {
                    genre = Optional.of(Genres.ANIMALS);
                    isValidGenre = true;
                }
                default -> System.out.println("Invalid selection");
            }
        }
        return genre;
    }

    private static String generateReleaseDate(int day, int month, int year) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
        LocalDateTime date = LocalDateTime.of(year, month, day, 0, 0);

        return date.format(formatter);

    }

    private static int generateId() {
        boolean isUniqueNumber = false;
        int idNumber = 0;

        while (!isUniqueNumber){
            Random random = new Random();
            idNumber = random.nextInt(10000 - 1000) + 1000;
            if (!libraryItemList.isEmpty()) {
                for (int i = 0; i < libraryItemList.size(); i++) {
                    LibraryItem item = libraryItemList.get(i);
                    if (item.getId() == idNumber) {
                        break;
                    } else if (i == (libraryItemList.size() - 1) ) {
                        isUniqueNumber = true;
                    }
                }
            } else {
                isUniqueNumber = true;
            }
        }
        return idNumber;
    }
}
