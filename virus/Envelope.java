public class Envelope {
    private String material;
    private boolean hasGlycoproteins;

    // Constructor
    public Envelope(String material, boolean hasGlycoproteins) {
        this.material = material;
        this.hasGlycoproteins = hasGlycoproteins;
    }

    // Getters
    public String getMaterial() {
        return material;
    }

    public boolean hasGlycoproteins() {
        return hasGlycoproteins;
    }

    // Method to describe the envelope
    public String describe() {
        return "Envelope Material: " + material +
               "\nContains Glycoproteins: " + (hasGlycoproteins ? "Yes" : "No");
    }
}
