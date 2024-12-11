public class RhinoVirus extends NonEnvelopedVirus {
    // Constructor
    public RhinoVirus() {
        super("RhinoVirus", "RNA", "Icosahedral", "Spherical", 20.0f);
    }

    // RhinoVirus-specific methods
    public String getSpreadingMethod() {
        return "Spread through respiratory droplets.";
    }

    public String getCausingDiseases() {
        return "Causes the common cold.";
    }

    public String getInfectionVideoPath() {
        return "/videos/rhinovirus_infection.mp4";
    }
}
