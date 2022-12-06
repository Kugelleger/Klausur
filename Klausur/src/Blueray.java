public class Blueray extends Medien {
    boolean dreiD;

    public Blueray(String titel, int FSK, int laenge, boolean dreiD, int verliehen){
        super(titel, FSK, laenge, verliehen);
        setDreiD(dreiD);
        setFSK(FSK);
        setLaenge(laenge);
        setTitel(titel);
        setVerliehen(verliehen);
    }
    public void setDreiD(boolean dreiD) {
        this.dreiD = dreiD;
    }
    public boolean isDreiD() {
        return dreiD;
    }
    

}
