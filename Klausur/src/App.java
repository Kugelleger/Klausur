import java.util.ArrayList;



public class App {


    
    static ArrayList<Kundendatenbank>Kunden;
    static ArrayList<Mitarbeiter>mitarbeiterinnen;
    static ArrayList<Medien>multimedia;
    
    public static void main(String[] args) throws Exception {
        
    }
    
    public static void createKundendb(){
        Kunden.add(new Kundendatenbank(1, "Hans", "Peter", 19));
        Kunden.add(new Kundendatenbank(2, "Laura", "Stern", 25));
        Kunden.add(new Kundendatenbank(3, "Wurst", "Markt", 18));
    }
    
    public static void setKunden(ArrayList<Kundendatenbank> kunden) {
        Kunden = kunden;
    }
    public static ArrayList<Kundendatenbank> getKunden() {
        return Kunden;
    }


    public static void createMitarbeiterdb(){
        mitarbeiterinnen.add(new Mitarbeiter("Klaus", "Peter", 1));
        mitarbeiterinnen.add(new Mitarbeiter("Snupi", "Miller", 2));
    }
    public static void setMitarbeiterinnen(ArrayList<Mitarbeiter> mitarbeiterinnen) {
        App.mitarbeiterinnen = mitarbeiterinnen;
    }
    public static ArrayList<Mitarbeiter> getMitarbeiterinnen() {
        return mitarbeiterinnen;
    }
    
    public static void createMultiMediadb(){
        multimedia.add(new Medien("CD", 12, 100, 0));
        multimedia.add(new Medien("DVD", 16, 210, 0));
    }
    public static void setMultimedia(ArrayList<Medien> multimedia) {
    App.multimedia = multimedia;
    }
    public static ArrayList<Medien> getMultimedia() {
    return multimedia;
    }

    public void ausleihen(int kNummer, int mNummer){
        for (Kundendatenbank kundendatenbank : getKunden()) {
            if(kNummer == 1 && mNummer == 1);

        }
    }
    
}
