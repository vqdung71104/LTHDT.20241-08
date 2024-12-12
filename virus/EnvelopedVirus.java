public class EnvelopedVirus extends Virus {
    private Envelope envelope;

    // Constructor
    public EnvelopedVirus(String name, String nucleicAcidType, String capsidShape, String shape, float size,
            String envelopeMaterial, boolean hasGlycoproteins) {
        super(name, nucleicAcidType, capsidShape, shape, size); // Call Virus constructor
        this.envelope = new Envelope("Lipid Envelope", "Double-layered lipid membrane", "Protein anchors", envelopeMaterial, hasGlycoproteins);
    }

    // Override getDetails
    @Override
    public String getDetails() {
        return super.getDetails() + "\n" + envelope.describe();
    }

    // Override getImagePath
    @Override
    public String getImagePath() {
        return "/images/viruses/" + getName().toLowerCase() + "_enveloped.png";
    }

    // Main method for test
    public static void main(String[] args) {
        EnvelopedVirus virus = new EnvelopedVirus(
            "HIV", "RNA", "Icosahedral", "Spherical", 120.0f, "Lipid", true
        );
        System.out.println(virus.getDetails());
        System.out.println("Image Path: " + virus.getImagePath());
        System.out.println("Infection Mechanism: " + virus.getInfectionMechanism());
        System.out.println("Spreading Method: " + virus.getSpreadingMethod());
        System.out.println("Causing Diseases: " + virus.getCausingDiseases());
        System.out.println("Infection Video Path: " + virus.getInfectionVideoPath());
}
}