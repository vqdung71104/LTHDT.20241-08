public class HepatitisBVirus extends EnvelopedVirus {
    // Constructor
    public HepatitisBVirus() {
        super("Hepatitis B", "DNA", "Icosahedral", "Spherical", 42.0f, "Lipid", true);
    }

    // Override getInfectionMechanism
    @Override
    public String getInfectionMechanism() {
        return "Hepatitis B infects the liver cells and can cause chronic liver disease.";
    }

    // Override getSpreadingMethod
    @Override
    public String getSpreadingMethod() {
        return "Hepatitis B spreads through contact with infected blood, unprotected sex, and from mother to child during childbirth.";
    }

    // Override getCausingDiseases
    @Override
    public String getCausingDiseases() {
        return "Hepatitis B causes liver inflammation and can lead to cirrhosis or liver cancer.";
    }

    public static void main(String[] args) {
        HepatitisBVirus hepatitisB = new HepatitisBVirus();
        System.out.println(hepatitisB.getDetails());
        System.out.println("Image Path: " + hepatitisB.getImagePath());
        System.out.println("Infection Mechanism: " + hepatitisB.getInfectionMechanism());
        System.out.println("Spreading Method: " + hepatitisB.getSpreadingMethod());
        System.out.println("Causing Diseases: " + hepatitisB.getCausingDiseases());
        System.out.println("Infection Video Path: " + hepatitisB.getInfectionVideoPath());
    }
}
