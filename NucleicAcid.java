public class NucleicAcid extends VirusComponent {
    // Thuộc tính riêng
    private String type; // Loại nucleic acid (DNA, RNA)

    // Constructor
    public NucleicAcid(String name, String details, String type) {
        super(name, "NucleicAcid", details); // Gọi constructor của lớp cha
        this.type = type;
    }

    // Getter cho type
    public String getType() {
        return type;
    }

    // Ghi đè phương thức getSpecifications
    @Override
    public String getSpecifications() {
        return super.getSpecifications() + "\nType: " + type;
    }

    // Ghi đè phương thức getFunctionalities
    @Override
    public String getFunctionalities() {
        return "Stores genetic information of the virus.";
    }

    // Main để kiểm tra
    public static void main(String[] args) {
        NucleicAcid nucleicAcid = new NucleicAcid("Viral RNA", "Single-stranded RNA", "RNA");
        System.out.println(nucleicAcid.getDetails());
        System.out.println("Specifications: " + nucleicAcid.getSpecifications());
        System.out.println("Functionalities: " + nucleicAcid.getFunctionalities());
    }
}
