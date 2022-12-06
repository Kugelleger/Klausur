public class Schallplatte extends Medien {
    boolean verleihbar;

    public Schallplatte(String titel, int FSK, int laenge, boolean verleihbar, int verliehen){
        super(titel, FSK, laenge, verliehen);
        setVerleihbar(verleihbar);
        setFSK(FSK);
        setLaenge(laenge);
        setTitel(titel);
        setVerliehen(verliehen);

    }
    public void setVerleihbar(boolean verleihbar) {
        this.verleihbar = verleihbar;
    }
    public boolean isVerleihbar() {
        return verleihbar;
    }
    

}
