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
}