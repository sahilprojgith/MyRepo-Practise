package Matchs;

import java.util.ArrayList;
import java.util.List;

public class MatchUp {
    public static void main(String[] args) {
        JohnCena johnCena = new JohnCena(88,87,95,99,99);
        Jericho jericho = new Jericho(90,97,85,90,90);
        RandyOrton randyOrton = new RandyOrton(94,99,85,80,99);
        Sheamus sheamus = new Sheamus(90,99,80,80,90);
        Edge edge = new Edge(95,95,88,85,99);
        CMpunk cMpunk = new CMpunk(88,99,86,88,99);

        System.out.println("John Cena " + johnCena.getOverallScore());
        System.out.println("Chris Jericho " + jericho.getOverallScore());
        System.out.println("Randy Orton " + randyOrton.getOverallScore());
        System.out.println("Sheamus " + sheamus.getOverallScore());
        System.out.println("Edge " + edge.getOverallScore());
        System.out.println("CM Punk " + cMpunk.getOverallScore());

        MainEvent mainEvent = new MainEvent();
        List<Moves> tagTeam1 = new ArrayList<>();
        tagTeam1.add(johnCena);
        tagTeam1.add(sheamus);
        tagTeam1.add(cMpunk);

        List<Moves> tagTeam2 = new ArrayList<>();
        tagTeam2.add(randyOrton);
        tagTeam2.add(jericho);
        tagTeam2.add(edge);

        MainEvent.winner(tagTeam1, tagTeam2);

    }
}

class MainEvent{
    public static void winner(List<Moves> tagTeam1, List<Moves> tagTeam2){
        int averagePowerTeam1 = 0;
        int averagePowerTeam2 = 0;

        for(Moves moves : tagTeam1){
            averagePowerTeam1 = averagePowerTeam1 + moves.getOverallScore();
        }

        for(Moves moves : tagTeam2){
            averagePowerTeam2 = averagePowerTeam2 + moves.getOverallScore();
        }

        if(averagePowerTeam1>averagePowerTeam2){
            System.out.println("Tag Team 1 Wins the Main Event - " + averagePowerTeam1 + "  " + averagePowerTeam2);
        }else {
            System.out.println("Tag Team 2 Wins the Main Event - " + averagePowerTeam1 + "  " +averagePowerTeam2);
        }






    }
}
