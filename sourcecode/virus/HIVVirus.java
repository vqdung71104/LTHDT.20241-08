public class HIVVirus extends EnvelopedVirus {
    // Constructor
    public HIVVirus() {
        super("HIV", "RNA", "Icosahedral", "Spherical", 120.0f, "Lipid", true);
    }

    // Override getInfectionMechanism
    @Override
    public String getInfectionMechanism() {
        return "HIV attacks the immune system by targeting CD4 cells (T cells).";
    }

    // Override getSpreadingMethod
    @Override
    public String getSpreadingMethod() {
        return "HIV spreads through unprotected sex, blood transfusions, and from mother to child during childbirth.";
    }

    // Override getCausingDiseases
    @Override
    public String getCausingDiseases() {
        return "HIV causes acquired immunodeficiency syndrome (AIDS).";
    }
}
