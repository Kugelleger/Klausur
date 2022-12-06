public class Mitarbeiter {
    String vorname;
    String nachname;
    int mitarbeiternummer;

    public Mitarbeiter(String vorname, String nachname, int mitarbeiternummer){
        setMitarbeiternummer(mitarbeiternummer);
        setNachname(nachname);
        setVorname(vorname);
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

    public int getMitarbeiternummer() {
        return mitarbeiternummer;
    }

    public void setMitarbeiternummer(int mitarbeiternummer) {
        this.mitarbeiternummer = mitarbeiternummer;
    }

    
}
