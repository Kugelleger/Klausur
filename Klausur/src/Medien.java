public class Medien {
    
    String titel;
    int FSK;
    int Laenge;
    int verliehen;

    public Medien(String titel, int FSK, int laenge, int verliehen){
        setFSK(FSK);
        setLaenge(laenge);
        setTitel(titel);
        setVerliehen(verliehen);
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getFSK() {
        return FSK;
    }

    public void setFSK(int fSK) {
        FSK = fSK;
    }

    public int getLaenge() {
        return Laenge;
    }

    public void setLaenge(int laenge) {
        Laenge = laenge;
    }
    public void setVerliehen(int verliehen) {
        this.verliehen = verliehen;
    }
    public int getVerliehen() {
        return verliehen;
    }


    
}
