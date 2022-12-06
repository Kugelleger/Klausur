public class Kundendatenbank {
    int kundennummer;
    String vorname;
    String nachname;
    int alter;

    public Kundendatenbank(int kundennummer, String vorname, String nachname, int alter){
        setAlter(alter);
        setKundennummer(kundennummer);
        setVorname(vorname);
        setNachname(nachname);
    }

    public int getKundennummer() {
        return kundennummer;
    }

    public void setKundennummer(int kundennummer) {
        this.kundennummer = kundennummer;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    
}
