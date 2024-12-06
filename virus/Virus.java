public class Virus {
  // Attributes
  private String name;
  private String shape;
  private float size;
  private Capsid capsid;
  private NucleicAcid nucleicAcid;

  // Constructor
  public Virus(String name, String nucleicAcidType, String capsidShape, String shape, float size) {
      this.name = name;
      this.shape = shape;
      this.size = size;
      this.capsid = new Capsid(capsidShape);
      this.nucleicAcid = new NucleicAcid(nucleicAcidType);
  }

  // Methods
  public String getName() {
      return name;
  }

  public String getShape() {
      return shape;
  }

  public float getSize() {
      return size;
  }

  public Capsid getCapsid() {
      return capsid;
  }

  public String getDetails() {
      return "Virus Name: " + name + "\n" +
             "Shape: " + shape + "\n" +
             "Size: " + size + "\n" +
             "Capsid Shape: " + capsid.getShape() + "\n" +
             "Nucleic Acid Type: " + nucleicAcid.getType();
  }

  public String getImagePath() {
      // This method can return a path to the virus image (mock implementation)
      return "/images/viruses/" + name.toLowerCase() + ".png";
  }

  // Inner Classes
  public static class Capsid {
      private String shape;

      public Capsid(String shape) {
          this.shape = shape;
      }

      public String getShape() {
          return shape;
      }
  }

  public static class NucleicAcid {
      private String type;

      public NucleicAcid(String type) {
          this.type = type;
      }

      public String getType() {
          return type;
      }
  }

  // Main method for testing
  public static void main(String[] args) {
      Virus virus = new Virus("HIV", "RNA", "Icosahedral", "Spherical", 120.0f);
      System.out.println(virus.getDetails());
      System.out.println("Image Path: " + virus.getImagePath());
  }
}

