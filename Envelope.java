public class Envelope extends VirusComponent {
    // Thuộc tính riêng
    private String anchorType; // Loại liên kết giúp virus bám vào tế bào chủ

    // Constructor
    public Envelope(String name, String details, String anchorType) {
        super(name, "Envelope", details); // Gọi constructor của lớp cha
        this.anchorType = anchorType;
    }

    // Getter cho anchorType
    public String getAnchorType() {
        return anchorType;
    }

    // Ghi đè phương thức getSpecifications
    @Override
    public String getSpecifications() {
        return super.getSpecifications() + "\nAnchor Type: " + anchorType;
    }

    // Ghi đè phương thức getFunctionalities
    @Override
    public String getFunctionalities() {
        return "Helps the virus attach and enter host cells.";
    }

    // Main để kiểm tra
    public static void main(String[] args) {
        Envelope envelope = new Envelope("Lipid Envelope", "Double-layered lipid membrane", "Protein anchors");
        System.out.println(envelope.getDetails());
        System.out.println("Specifications: " + envelope.getSpecifications());
        System.out.println("Functionalities: " + envelope.getFunctionalities());
    }
}
