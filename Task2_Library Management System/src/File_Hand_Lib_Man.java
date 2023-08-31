import java.io.*;
import java.util.ArrayList;

public class File_Hand_Lib_Man {
    static void create(){
        File file = new File("books.txt");
        try
        {
            if (file.createNewFile()) {

                System.out.println("File created");
            }
            else System.out.println("Already exists");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    static void write_file(){
        try {
            FileWriter fw = new FileWriter("books.txt", true);
            fw.write("Anna Karenina by Leo Tolstoy \nMadame Bovary by Gustave Flaubert \nWar and Peace by Leo Tolstoy \nThe Great Gatsby by F. Scott Fitzgerald \nLolita by Vladimir Nabokov \nMiddlemarch by George Eliot \nThe Adventures of Huckleberry Finn by Mark Twain \nThe Stories of Anton Chekhov by Anton Chekhov \nIn Search of Lost Time by Marcel Proust \nHamlet by William Shakespeare");
            fw.close();
            System.out.println("Data successfully updated");
        }
        catch (Exception f){
            System.out.println(f);
        }
    }

    static void displayBooks(ArrayList<String> books) {
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i));
        }
    }






    static ArrayList<String> loadBooks() {
        ArrayList<String> books = new ArrayList<>();
        try {
            File file = new File("books.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                books.add(line);
            }
            reader.close();
        } catch (Exception g) {
            System.out.println(g);
        }
        return books;
    }





    static void saveBooks(ArrayList<String> books) {
        try {
            File file = new File("books.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (String book : books) {
                writer.write(book);
                writer.newLine();
            }
            writer.close();
        } catch (Exception h) {
            System.out.println(h);
        }
    }




    static ArrayList<String> loadReturnedBooks() {
        ArrayList<String> returned = new ArrayList<>();
        try {
            File file = new File("returned.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                returned.add(line);
            }
            reader.close();
        } catch (Exception i) {
            System.out.println(i);
        }
        return returned;
    }




    static void saveReturnedBooks(ArrayList<String> returned) {
        try {
            File file = new File("returned.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (String book : returned) {
                writer.write(book);
                writer.newLine();
            }
            writer.close();
        } catch (Exception j) {
            System.out.println(j);
            System.out.println("Error while saving returned books: ");
        }
    }
}
