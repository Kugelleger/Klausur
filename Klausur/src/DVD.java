public class DVD extends Medien {
    boolean fullHD;

    public DVD(String titel, int FSK, int laenge, boolean fullHD, int verliehen){
    super(titel, FSK, laenge, verliehen);
    setFullHD(fullHD);
    setFSK(FSK);
    setLaenge(laenge);
    setTitel(titel);
    setVerliehen(verliehen);
    }

    public boolean isFullHD() {
        return fullHD;
    }

    public void setFullHD(boolean fullHD) {
        this.fullHD = fullHD;
    }



}
