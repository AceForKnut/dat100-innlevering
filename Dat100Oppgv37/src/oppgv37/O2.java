package oppgv37;
	//B5 Oppgave Karakterskala
	// Knut H Rokne

	//dette var et mareritt å kode
import java.util.Scanner;

public class O2 {

    public static void main(String[] args) {
        Scanner karinput1 = new Scanner(System.in);
        int antallstud = 10;

        for (int stud = 1; stud <= antallstud; stud++) {
            int karakter = -1; 

            while (karakter < 0 || karakter > 100) {
                System.out.print("Hvor mange poeng fikk student " + stud + "? ");

                try {
                    String input = karinput1.nextLine();
                    karakter = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("Input ugyldig, vennligst tast inn et gyldig nummer\n");
                    continue;
                }

                if (karakter < 0 || karakter > 100) {
                    System.out.println("Dette er ikke en gyldig poengsum! Vennligst tast inn et gyldig nummer\n");
                }
            }

            
            if (karakter >= 0 && karakter <= 39) {
                System.out.println("Student " + stud + " fikk karakteren F\n");
            } else if (karakter <= 49 && karakter >= 40) {
                System.out.println("Student " + stud + " fikk karakteren E\n");
            } else if (karakter <= 59 && karakter >= 50) {
                System.out.println("Student " + stud + " fikk karakteren D\n");
            } else if (karakter <= 79 && karakter >= 60) {
                System.out.println("Student " + stud + " fikk karakteren C\n");
            } else if (karakter <= 89 && karakter >= 80) {
                System.out.println("Student " + stud + " fikk karakteren B\n");
            } else if (karakter <= 100 && karakter >= 90) {
                System.out.println("Student " + stud + " fikk karakteren A\n");
            }
        }

        karinput1.close();
    }
}
