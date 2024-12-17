public class RotaVirus extends NonEnvelopedVirus {
    // Constructor
    public RotaVirus() {
        super("RotaVirus", "RNA", "Icosahedral", "Spherical", 70.0f);
    }

    // RotaVirus-specific methods
    public String getSpreadingMethod() {
        return "Spread through the fecal-oral route.";
    }

    public String getCausingDiseases() {
        return "Causes severe diarrhea in infants and young children.";
    }
}
