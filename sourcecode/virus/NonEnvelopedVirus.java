public class NonEnvelopedVirus extends Virus {
    // Constructor
    public NonEnvelopedVirus(String name, String nucleicAcidType, String capsidShape, String shape, float size) {
        super(name, nucleicAcidType, capsidShape, shape, size);
    }

    // Methods specific to NonEnvelopedVirus
    public String getInfectionMechanism() {
        return "Directly attaches to the host cell membrane using capsid proteins.";
    }
}
