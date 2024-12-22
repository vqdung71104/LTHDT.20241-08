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

   
}
