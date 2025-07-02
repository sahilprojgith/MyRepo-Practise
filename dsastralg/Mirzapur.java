package dtastructndalgo.dsastralg;

//bahubali class made.
//KaleenBhaiya Class is made.
//MunnaTripathi class is made.
//GudduPandit is made.
//SharadShukla class is made.

import java.util.ArrayList;
import java.util.List;

public class Mirzapur {
    public static void main(String[] args) {
        KaleenBhaiya kaleenBhaiya = new KaleenBhaiya(50, 32,30,10);
        GudduPandit gudduPandit = new GudduPandit(23,4,12,4);
        MunnaTripathi munnaTripathi = new MunnaTripathi(21,100,2,99);
        SharadShukla sharadShukla = new SharadShukla(80,3,24,55);


//        System.out.println("Kaleen Bhaiya" + kaleenBhaiya.getAveragePower());
//        System.out.println("Guddu Pandit " + gudduPandit.getAveragePower());
//        System.out.println("Munna Tripathi" + munnaTripathi.getAveragePower());
//        System.out.println("Sharad Shukle " + sharadShukla.getAveragePower());

        Nile  nile = new Nile();
        List<Bahubali> team1 = new ArrayList<>();
        team1.add(kaleenBhaiya);
        team1.add(munnaTripathi);

        List<Bahubali> team2 = new ArrayList<>();
        team2.add(gudduPandit);
        team2.add(sharadShukla);

        Nile.whoWins(team1,team2);

    }


//    public void whoWins(List<Bahubali> team1, List<Bahubali> team2){
//        int averagePowerTeam1 = 0;
//        int averagePowerTeam2 = 0;
//
//        for(Bahubali bahubali : team1){
//            averagePowerTeam1 = averagePowerTeam1 + bahubali.getAveragePower();
//        }
//
//        for(Bahubali bahubali : team2){
//            averagePowerTeam2 = averagePowerTeam2 + bahubali.getAveragePower();
//        }
//
//        if(averagePowerTeam1>averagePowerTeam2){
//            System.out.println("Team 1 Wins");
//        }else {
//            System.out.println("Team 2 Wins");
//        }
//
//    }

}
//cannot directly access any function through static class.
class Nile{
    static void whoWins(List<Bahubali> team1, List<Bahubali> team2){
        int averagePowerTeam1 = 0;
        int averagePowerTeam2 = 0;

        for(Bahubali bahubali : team1){
            averagePowerTeam1 = averagePowerTeam1 + bahubali.getAveragePower();
        }

        for(Bahubali bahubali : team2){
            averagePowerTeam2 = averagePowerTeam2 + bahubali.getAveragePower();
        }

        if(averagePowerTeam1>averagePowerTeam2){
            System.out.println("Team 1 Wins" + averagePowerTeam1 + " " + averagePowerTeam2);
        }else {
            System.out.println("Team 2 Wins" + averagePowerTeam1 + " " + averagePowerTeam2);
        }

    }
}
