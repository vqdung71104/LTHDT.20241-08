public class CoronaVirus extends EnvelopedVirus {
    // Constructor
    public CoronaVirus() {
        super("CoronaVirus", "RNA", "Helical", "Spherical", 80.0f, "Lipid", true);
    }

    // Override getInfectionMechanism
    @Override
    public String getInfectionMechanism() {
        return "Coronavirus infects cells by binding to the ACE2 receptor on host cells.";
    }

    // Override getSpreadingMethod
    @Override
    public String getSpreadingMethod() {
        return "CoronaVirus spreads via respiratory droplets, contact with contaminated surfaces, and aerosols.";
    }

    // Override getCausingDiseases
    @Override
    public String getCausingDiseases() {
        return "Coronavirus causes diseases such as COVID-19.";
    }
}
