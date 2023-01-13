
import java.util.Scanner; //così posso utilizzare la funzione scanner
public class Main {
    public static void main(String[] args) {

        /*
Scriviamo un programma che determini il segno zodiacale (e lo stampi a video)
in base all’inserimento di 4 numeri all’interno di variabili che rappresentano il
giorno e il mese di inizio e il giorno e il mese di fine di ogni singolo segno.
Es. per gemelli si avrebbe
giornoInizio = 21
giornoFine=21
meseInizio=5
meseFine=6
Per ogni segno zodiacale queste sono le fasce:
Ariete            21 marzo – 20 aprile
Toro	         21 aprile – 20 maggio
Gemelli         21 maggio – 21 giugno
Cancro	         22 giugno – 22 luglio
Leone	         23 luglio – 23 agosto
Vergine        24 agosto – 22 settembre
Bilancia        23 settembre – 22 ottobre
Scorpione    23 ottobre – 22 novembre
Sagittario     23 novembre – 21 dicembre
Capricorno  22 dicembre – 20 gennaio
Aquario       21 gennaio – 19 febbraio
Pesci           20 febbraio – 20 marzo
         */

      Scanner in = new Scanner(System.in);// do possibilità di input

          //variabili
        int giorno,  mese;

        System.out.println("Buongiorno, sono un calcolatore della data di nascita");
        System.out.println("Dimmi pure in numeri il giorno ed il mese di nascita");
        System.out.println("Che giorno sei nato/a?");
        giorno = in.nextInt(); //input utente
        System.out.println("In che mese sei nato/a?");
        mese = in.nextInt();

        //inizio ciclo if
        if((giorno >= 21 && mese == 3) || (giorno <= 20 && mese == 4))
          System.out.println("Sei dell' Ariete");

        if((giorno >= 21 && mese == 4) || (giorno <= 20 && mese == 5))
            System.out.println("Sei del Toro");

        if((giorno >= 21 && mese == 5) || (giorno <= 21 && mese == 6))
            System.out.println("Sei dei Gemelli");

        if((giorno >= 22 && mese == 6 ) || (giorno <= 22 && mese == 7))
            System.out.println("Sei del Cancro");

        if((giorno >= 23 && mese == 7) || (giorno <= 23 && mese == 8))
            System.out.println("Sei del Leone");

        if((giorno >= 24 && mese == 8) || (giorno <= 22 && mese == 9))
            System.out.println("Sei Vergine");

        if((giorno >= 23 && mese == 9) || (giorno <= 22 && mese == 10))
            System.out.println("Sei Bilancia");

        if ((giorno >= 23 && mese == 10) || (giorno <= 22 && mese == 11))
            System.out.println("Sei Scorpione");

        if((giorno >= 23 && mese == 11) || (giorno <= 21 && mese == 12))
            System.out.println("Sei Sagittario");

        if((giorno >= 22 && mese == 12) || (giorno <= 20 && mese == 1))
            System.out.println("Sei del Capricorno");

        if((giorno >= 21 && mese == 1) || (giorno <= 19 && mese == 2))
            System.out.println("Sei dell' Aquario");

        if((giorno >=20 && mese == 2) || (giorno <= 20 && mese == 3))
            System.out.println("Sei dei Pesci");

        System.out.println("Quindi sei nato il " + giorno + "/" + mese);

    }

}