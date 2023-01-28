package chap_04;

public class BlackBoxRefurbish {
    public String name;
    String resolution;
    private int price;
    protected String color;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResolution() {
        if(resolution == null || resolution.isEmpty()){
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price<=0){
            this.price=10000;
        }else{
            this.price=price;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



}
