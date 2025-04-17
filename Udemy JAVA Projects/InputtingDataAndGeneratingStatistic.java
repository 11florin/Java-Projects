import java.util.Scanner;

public class InputtingDataAndGeneratingStatistic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of laps: "); //Afișează mesajul "Number of laps: " pe ecran, fără a trece la o linie nouă.
        int numberOfLaps = scanner.nextInt();//Utilizează un obiect scanner pentru a citi un număr întreg (int) de la utilizator.
                                              //Variabila numberOfLaps stochează acest număr.

        double[]lapTimes = new double[numberOfLaps];//Creează un array de double, numit lapTimes, cu dimensiunea numberOfLaps.
                                                    //Fiecare element al array-ului va stoca timpul unui tur.

        for(int i = 0; i < numberOfLaps; i++){ //Se inițializează un ciclu for care pornește de la i = 0 și rulează până la i < numberOfLaps (inclusiv).
            System.out.print("Lap time: ");//La fiecare iterație, afișează mesajul "Lap time: " pentru a cere utilizatorului să introducă timpul unui tur.
            lapTimes[i] = scanner.nextDouble();//Citește un număr cu virgulă mobilă (double) introdus de utilizator și îl stochează în lapTimes[i].
        }
        double fastestTime = lapTimes[0];//Inițializează variabila fastestTime cu primul timp din array (lapTimes[0]).
                                         //Se presupune inițial că acesta este cel mai rapid timp.
        for(int i = 1; i < lapTimes.length; i++){//Se inițializează un alt ciclu for, care pornește de la i = 1 și se execută până la sfârșitul array-ului.
            if(lapTimes[i] < fastestTime){//Verifică dacă lapTimes[i] (timpul curent) este mai mic decât fastestTime.
                fastestTime = lapTimes[i];//Dacă da, actualizează fastestTime cu noua valoare mai mică.
            }
        }
        System.out.print("Fast time: " + fastestTime);//Afișează mesajul "Fast time: " urmat de valoarea fastestTime, care reprezintă cel mai mic timp înregistrat.

        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Number of laps: ");
        // int numberOfLaps = scanner.nextInt();

        // double[] lapTimes = new double[numberOfLaps];

        // for(int i = 0; i < numberOfLaps; i++){
        //     System.out.print("Lap time: ");
        //     lapTimes[i] = scanner.nextDouble();
        // }

        // //fastest time  = 54.8 start with first as it is set int i = 1
        // //second iteration check if 55.3 < 54.8 false
        // //third iteration check if 54.8 < 51.1 true
        // double fastestTime = lapTimes[0];
        // for(int i = 1; i < lapTimes.length; i++){
        //     if(lapTimes[i] < fastestTime){
        //         fastestTime = lapTimes[i];
        //     }
        // }
        // System.out.println("Fastest time: " + fastestTime);
    }
    
}
