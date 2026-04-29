public class Rectangle2 {
    private double wide ;
    private double length;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    public double getLength() {
        return length;
    }

    public double getWide() {
        return wide;
    }
    public void positive (double wide , double length){
        if(wide > 0 && length >0 ){
            System.out.println("Positive number");
        } else {
            System.out.println("Error");
        }
    }

    public double Area(double wide , double length){
        double div = wide * length ;
        return div;
    }
    public double g (double wide , double length){
        double div = 2 * wide + length *2 ;
        return div;
    }







}
