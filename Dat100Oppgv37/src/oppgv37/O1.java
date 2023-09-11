package oppgv37;
	//B4 Oppgave Trinnskatt
	// Knut H Rokne
import java.util.Scanner;
import java.text.DecimalFormat;
public class O1 {
	
	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		
		
		int i0 = 164100;
		int i1 = 230950;
		int i2 = 580650;
		int i3 = 934050;
		
		double s1 = 0.0093;
		double s2 = 0.0241;
		double s3 = 0.1152;
		double s4 = 0.1452;
		
		
		System.out.print("Hvor mye inntekt har du? ");
		
		String input = input1.nextLine();
		double inntekt = 0;
		try {
			inntekt = Double.parseDouble(input);
		} catch(NumberFormatException e) {
			System.out.println("Input ugyldig, vennligst tast inn et gyldig nummer");
		} finally {
			input1.close();
		}
		DecimalFormat foodesi = new DecimalFormat("#.##");
		if (inntekt <= i0) {
			System.out.println("Du må ikke skatte noe");
		}  else if (inntekt > i0 && inntekt < i1) {
			double skatt1 = inntekt * s1;
			System.out.println("Du må skatte " + foodesi.format(skatt1));
		} else if (inntekt > i1 && inntekt < i2) {
			double skatt1 = inntekt * s2;
			System.out.println("Du må skatte " + foodesi.format(skatt1));
		} else if (inntekt > i2 && inntekt < i3) {
			double skatt1 = inntekt * s3;
			System.out.println("Du må skatte " + foodesi.format(skatt1));
		} else if (inntekt > i3) {
			double skatt1 = inntekt * s4;
			System.out.println("Du må skatte " + foodesi.format(skatt1));
		}
	}
}
