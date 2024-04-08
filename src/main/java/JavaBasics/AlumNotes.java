package JavaBasics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Input 6 alums notes to know which alum approve, reprove, and how many has excellent notes (9, 10)
public class AlumNotes {
    public static void alumsRate(){
        Map<String, Integer> alumsNotes = inputAlumsNotes();

        for (Map.Entry<String, Integer> notes : alumsNotes.entrySet()){
            String name = notes.getKey();
            int note = notes.getValue();

            if (note < 6){
                System.out.println( name + " aren't approved with " + note + " note" );
            } else if (note < 8) {
                System.out.println( name + " are approved with " + note + " note" );
            } else {
                System.out.println( name + " are approved with " + note + " excellent note!");
            }
        }
    }

    public static Map<String, Integer> inputAlumsNotes(){
        Map<String, Integer> alumsNotes = new HashMap<>();

        for (int i = 0; i < 6; i++) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Alum name: ");
            String alumName = sc.next();

            System.out.println("Alum note: ");
            Integer alumNote = + sc.nextInt();

            alumsNotes.put(alumName, alumNote);
        }
        return alumsNotes;
    }
}
