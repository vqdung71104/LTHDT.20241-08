public class PolioVirus extends NonEnvelopedVirus {
    // Constructor
    public PolioVirus() {
        super("PolioVirus", "RNA", "Icosahedral", "Spherical", 30.0f);
    }

    // PolioVirus-specific methods
    public String getSpreadingMethod() {
        return "Spread through contaminated water or food.";
    }

    public String getCausingDiseases() {
        return "Causes poliomyelitis (polio).";
    }

    public String getInfectionVideoPath() {
        return "/videos/poliovirus_infection.mp4";
    }
}
