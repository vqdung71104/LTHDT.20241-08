public class VirusComponent implements Displayable {
    // Attribute
    private String name;
    private String type; // Loại cụ thể, ví dụ: "Capsid", "Envelope", hoặc "NucleicAcid"
    private String details; // Thông tin chi tiết của component

    // Constructor
    public VirusComponent(String name, String type, String details) {
        this.name = name;
        this.type = type;
        this.details = details;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for type
    public String getType() {
        return type;
    }

    // Getter for details
    public String getDetailsInfo() {
        return details;
    }

    // Method for Displayable interface
    @Override
    public String getDetails() {
        return "Component Name: " + name + "\n" +
               "Type: " + type + "\n" +
               "Details: " + details;
    }

    @Override
    public String getImagePath() {
        return "/images/components/" + name.toLowerCase() + ".png";
    }

    // Additional methods
    public String getSpecifications() {
        return "Specifications for " + name + " (" + type + ")";
    }

    public String getFunctionalities() {
        switch (type.toLowerCase()) {
            case "capsid":
                return "Protects nucleic acids inside.";
            case "envelope":
                return "Helps virus attach to host cell.";
            case "nucleicacid":
                return "Stores genetic information.";
            default:
                return "Unknown functionality.";
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Kiểm tra với Capsid
        VirusComponent capsid = new VirusComponent("Capsid", "Capsid", "Icosahedral structure");
        System.out.println(capsid.getDetails());
        System.out.println("Image Path: " + capsid.getImagePath());
        System.out.println("Specifications: " + capsid.getSpecifications());
        System.out.println("Functionalities: " + capsid.getFunctionalities());
        System.out.println("===================================");

        // Kiểm tra với Envelope
        VirusComponent envelope = new VirusComponent("Envelope", "Envelope", "Lipid bilayer with proteins");
        System.out.println(envelope.getDetails());
        System.out.println("Image Path: " + envelope.getImagePath());
        System.out.println("Specifications: " + envelope.getSpecifications());
        System.out.println("Functionalities: " + envelope.getFunctionalities());
        System.out.println("===================================");

        // Kiểm tra với NucleicAcid
        VirusComponent nucleicAcid = new VirusComponent("Nucleic Acid", "NucleicAcid", "RNA genetic material");
        System.out.println(nucleicAcid.getDetails());
        System.out.println("Image Path: " + nucleicAcid.getImagePath());
        System.out.println("Specifications: " + nucleicAcid.getSpecifications());
        System.out.println("Functionalities: " + nucleicAcid.getFunctionalities());
    }
}
