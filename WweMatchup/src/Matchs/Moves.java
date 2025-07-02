package Matchs;

public class Moves {
    private int punchPower;
    private int kickPower;
    private int grapplingSkills;
    private int submissionSkills;
    private int Finisher;

    public Moves(int punchPower, int kickPower, int grapplingSkills, int submissionSkills, int finisher) {
        this.punchPower = setsafeValues(punchPower);
        this.kickPower = setsafeValues(kickPower);
        this.grapplingSkills = setsafeValues(grapplingSkills);
        this.submissionSkills = setsafeValues(submissionSkills);
        this.Finisher = setsafeValues(finisher);
    }

    public int getPunchPower() {
        return punchPower;
    }

    public void setPunchPower(int punchPower) {
        this.punchPower = punchPower;
    }

    public int getKickPower() {
        return kickPower;
    }

    public void setKickPower(int kickPower) {
        this.kickPower = kickPower;
    }

    public int getGrapplingSkills() {
        return grapplingSkills;
    }

    public void setGrapplingSkills(int grapplingSkills) {
        this.grapplingSkills = grapplingSkills;
    }

    public int getSubmissionSkills() {
        return submissionSkills;
    }

    public void setSubmissionSkills(int submissionSkills) {
        this.submissionSkills = submissionSkills;
    }

    public int getFinisher() {
        return Finisher;
    }

    public void setFinisher(int finisher) {
        Finisher = finisher;
    }

    private int setsafeValues(int value){

        int saveValue;
        if(value>100){
            saveValue = 100;
        } else if (value<0) {
            saveValue = 0;
        }else saveValue = value;

        return saveValue;

    }

    public int getOverallScore(){
        int OverallScore = (getPunchPower() + getKickPower() + getGrapplingSkills() + getSubmissionSkills() + getFinisher())/5;

        return OverallScore;
    }

}