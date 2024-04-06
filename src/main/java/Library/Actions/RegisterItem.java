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

        while (!isItemSelectedSuccessfully){

            System.out.println("(1) Continue\t(0) Return");
            Scanner sc = new Scanner(System.in);
            int optionSelected = sc.nextInt();
            switch (optionSelected){
                case 1 -> registerItem();
                case 0 -> isItemSelectedSuccessfully = true;
                default -> System.out.println("Invalid Option, try again");
            }
        }
    }

    private static void registerItem() {
        Scanner typeOfItemScanner = new Scanner(System.in);
        Scanner itemData = new Scanner(System.in);

        System.out.println("(1) Book\t(2) Magazine");
        int typeOfItem = typeOfItemScanner.nextInt();

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
            int idNUmber = 0;

            while (!isUniqueNumber){
                Optional <Integer> idNumberOptional = isUniqueId();

                if (idNumberOptional.isPresent()) {
                    idNUmber = idNumberOptional.get();
                    isUniqueNumber = true;
                }
            }
            return idNUmber;
        }

        private static Optional<Integer> isUniqueId() {
            Random random = new Random();
            int idNumber = random.nextInt(10000 - 1000) + 1000;

            if (!libraryItemList.isEmpty()) {
                for (LibraryItem item : libraryItemList) {
                    if (item.getId() == idNumber) {
                        return Optional.empty();

                    }
                }
            }
            return Optional.of(idNumber);
        }
}
