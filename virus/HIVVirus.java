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

    public static void main(String[] args) {
        HIVVirus hiv = new HIVVirus();
        System.out.println(hiv.getDetails());
        System.out.println("Image Path: " + hiv.getImagePath());
        System.out.println("Infection Mechanism: " + hiv.getInfectionMechanism());
        System.out.println("Spreading Method: " + hiv.getSpreadingMethod());
        System.out.println("Causing Diseases: " + hiv.getCausingDiseases());
        System.out.println("Infection Video Path: " + hiv.getInfectionVideoPath());
    }
}
