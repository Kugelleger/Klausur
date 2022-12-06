public class CD extends Medien{
    boolean laenge; //--> SP shortplay (true) | LP longplay (false)

    public CD(String titel, int FSK, int laenge, int verliehen){
        super(titel, FSK, laenge, verliehen);
        setLaenge(laenge);
        setFSK(FSK);
        setLaenge(laenge);
        setTitel(titel);
        setVerliehen(verliehen);

    }

    public boolean isLaenge() {
        return laenge;
    }

    public void setLaenge(boolean laenge) {
        this.laenge = laenge;
    }

    
}
