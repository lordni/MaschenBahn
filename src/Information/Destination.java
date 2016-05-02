package Information;

/**
 * Created by lordni on 4/27/16.
 */
public enum Destination {
    DUISBURG(1, "A", "Duisburg"), KOLN(2, "A", "Koln"),
    HANNOVER(1, "B", "Hannover"), KASSEL(2, "B", "Kassel"), FRANKFURT(3, "B", "Frankfurt"),
    BERLIN(1, "C", "Berlin"), LEIPZIG(2, "C", "Leipzig"), NURNBERG(3, "C", "Nurnberg"),
    STUTTGART(4, "D", "Stuttgart"), MUNICH(5, "E", "Munich"),
    HAMBURGHABOUR(7, "F", "Hamburg Habour"), SCANDINAVIA(8, "G", "Scandinavien");

    int number;
    String line;
    String name;

    Destination(int number, String line, String name) {
        this.number = number;
        this.line = line;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getLine() {
        return line;
    }

    public String getName() {
        return name;
    }
}
