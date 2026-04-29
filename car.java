public class car {
    private String brand;
    private int model;

    public void setBrand(String brand) {
        this.brand = brand;
        if (brand .equals("")) {
            System.out.println("error");
        }
    }
    public String getBrand() {
        return brand;
    }
    public void setModel(int model){
        if (model<2025&&model>1886) {
            this.model = model;
        }
    }

    public int getModel() {
        return model;
    }

    public void print(){
        System.out.println("the brand is: "+getBrand());
        System.out.println("the model is: "+getModel());

    }


}