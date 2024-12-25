public class DataModel {
    private Virus selectedVirus;
    

    //setter for seletedVirus
    public void setVirus(Virus virus) {
        this.selectedVirus = virus;
    }
    //getter for seletedVirus
    public Virus getVirus() {
       // return this.selectedVirus;
       return selectedVirus;
    }
 
    public static void main(String[] args) {
        DataModel model = new DataModel();
    
        // Đặt virus mặc định, ví dụ CoronaVirus
        model.setVirus(new CoronaVirus());
    
        // Hiển thị Frame chính
        BaseFrame baseFrame = new BaseFrame(model) {};
        baseFrame.setVisible(true);
    }
    
    
}
