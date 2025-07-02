package dtastructndalgo.dsastralg;

//bahubali class made.
//KaleenBhaiya Class is made.
//MunnaTripathi class is made.
//GudduPandit is made.
//SharadShukla class is made.

public class Bahubali{
    private int physicalPower;
    private int gunPower;
    private int warTactics;
    private int overallSmartness;

    public Bahubali(int physicalPower, int gunPower, int warTactics, int overallSmartness) {
        this.physicalPower = setSafeValues(physicalPower);
        this.gunPower = setSafeValues(gunPower);
        this.warTactics = setSafeValues(warTactics);
        this.overallSmartness = setSafeValues(overallSmartness);
    }

    public int getPhysicalPower() {
        return physicalPower;
    }

    public void setPhysicalPower(int physicalPower) {
        this.physicalPower = physicalPower;
    }

    public int getGunPower() {
        return gunPower;
    }

    public void setGunPower(int gunPower) {
        this.gunPower = gunPower;
    }

    public int getWarTactics() {
        return warTactics;
    }

    public void setWarTactics(int warTactics) {
        this.warTactics = warTactics;
    }

    public int getOverallSmartness() {
        return overallSmartness;
    }

    public void setOverallSmartness(int overallSmartness) {
        this.overallSmartness = overallSmartness;
    }

    private int setSafeValues(int value){

        int saveValue;
        if(value>100){
            saveValue = 100;
        } else if (value<0) {
            saveValue = 0;
        }else  saveValue = value;

        return saveValue;

    }
    public int getAveragePower(){
        int averagePower = (getGunPower() + getPhysicalPower() + getOverallSmartness() + getWarTactics())/4;

        return averagePower;
    }

}



