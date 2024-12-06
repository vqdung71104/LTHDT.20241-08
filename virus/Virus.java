public class Virus implements Infectable, Displayable {
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

  // Methods for Displayable interface
  @Override
  public String getDetails() {
      return "Virus Name: " + name + "\n" +
             "Shape: " + shape + "\n" +
             "Size: " + size + "\n" +
             "Capsid Shape: " + capsid.getShape() + "\n" +
             "Nucleic Acid Type: " + nucleicAcid.getType();
  }

  @Override
  public String getImagePath() {
      return "/images/viruses/" + name.toLowerCase() + ".png";
  }

  // Methods for Infectable interface
  @Override
  public String getInfectionMechanism() {
      return "Attacks host cells and integrates its genetic material.";
  }

  @Override
  public String getSpreadingMethod() {
      return "Spread through bodily fluids.";
  }

  @Override
  public String getCausingDiseases() {
      return "Causes diseases like AIDS.";
  }

  @Override
  public String getInfectionVideoPath() {
      return "/videos/infections/" + name.toLowerCase() + "_infection.mp4";
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
      System.out.println("Infection Mechanism: " + virus.getInfectionMechanism());
      System.out.println("Spreading Method: " + virus.getSpreadingMethod());
      System.out.println("Causing Diseases: " + virus.getCausingDiseases());
      System.out.println("Infection Video Path: " + virus.getInfectionVideoPath());
  }
}
