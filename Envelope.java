public class Capsid extends VirusComponent {
    // Thuộc tính riêng
    private String shape; // Hình dạng của capsid

    // Constructor
    public Capsid(String name, String details, String shape) {
        super(name, "Capsid", details); // Gọi constructor của lớp cha
        this.shape = shape;
    }

    // Getter cho shape
    public String getShape() {
        return shape;
    }

    // Ghi đè phương thức getSpecifications
    @Override
    public String getSpecifications() {
        return super.getSpecifications() + "\nShape: " + shape;
    }

    // Ghi đè phương thức getFunctionalities
    @Override
    public String getFunctionalities() {
        return "Protects and encloses the virus's genetic material.";
    }

    // Main để kiểm tra
    public static void main(String[] args) {
        Capsid capsid = new Capsid("Icosahedral Capsid", "Highly symmetrical", "Icosahedral");
        System.out.println(capsid.getDetails());
        System.out.println("Specifications: " + capsid.getSpecifications());
        System.out.println("Functionalities: " + capsid.getFunctionalities());
    }
}
