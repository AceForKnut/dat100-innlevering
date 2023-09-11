package oppgv37;
//O3 Oppgave
//Knut Harald Rokne
//n fakultet

import java.util.Scanner;

public class O3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Skriv inn et positivt tall: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Vennligst skriv inn et positivt heltall: ");
        } else {
            long factorial = fakultetkalk(n);

            System.out.println("      "+ n + "! = " + factorial);
        }

        scanner.close();
    }

    private static long fakultetkalk(int n) {
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
            System.out.print(i);
            
            if (i < n) {
            	System.out.print("*");
            }
        }
        

        return factorial;
    }
}
