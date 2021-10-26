package HalloNachbar;


public class Nachbar {
    private String Name;
    private String Vorname;

    Nachbar(String Vorname, String Name) {
        this.Name = Name;
        this.Vorname = Vorname;
    }

    @Override
    public String toString() {
        return Vorname + " " + Name;
    }
}
