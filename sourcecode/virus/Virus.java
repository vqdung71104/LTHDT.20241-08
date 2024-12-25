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
  
  // Getter
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

public NucleicAcid getNucleicAcid() {
    return nucleicAcid;
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
  /*public static void main(String[] args) {
      Virus virus = new Virus("HIV", "RNA", "Icosahedral", "Spherical", 120.0f);
      System.out.println(virus.getDetails());
      System.out.println("Image Path: " + virus.getImagePath());
      System.out.println("Infection Mechanism: " + virus.getInfectionMechanism());
      System.out.println("Spreading Method: " + virus.getSpreadingMethod());
      System.out.println("Causing Diseases: " + virus.getCausingDiseases());
      System.out.println("Infection Video Path: " + virus.getInfectionVideoPath());
  }*/
}
