package chap_04;

public class BlackBox2 {
    String name;
    String resolution;
    int price;
    String color;

    //클래스 변수
    static boolean canAutoReport = false; //자동신고기능  // static을 붙이면 모든 인스턴스들의 값이 동일해진다.(03 참고)


    //07-2 1씩 더해주는 고유 넘버
    int indexNum;
    static int coutner=0; // index고유 번호를 생성해주는 역할

    BlackBox2(){

    }

    // Getter
    String getModelName(){
        return name;
    }
    // Setter
    void setModelName(String modelName){
      this.name=modelName;
    }



    String getResolution (){
        if(resolution == null || resolution.isEmpty()){
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }
    void setResolution(String resolution){
        this.resolution=resolution;
    }



    int getPrice (){
        return price;
    }
    void setPrice(int price){
        if(price<=0){
            this.price=10000;
        }else{
            this.price=price;

        }
    }


    String getColor (){
        if(color == null || color.isEmpty()){
            return "판매자에게 문의하세요.";
        }
        return color;
    }
    void setColor(String color){
        this.color=color;
    }

}
