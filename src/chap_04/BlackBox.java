package chap_04;



public class BlackBox {
    // 인스턴스 변수
    String name;
    String resolution;
    int price = 20000;
    String color;

    //클래스 변수
    static boolean canAutoReport = false; //자동신고기능  // static을 붙이면 모든 인스턴스들의 값이 동일해진다.(03 참고)


    //07-2 1씩 더해주는 고유 넘버
    int indexNum;
    static int coutner=0; // index고유 번호를 생성해주는 역할

    // 07 생성자 -> 클래스 이름 그대로 적어주면된다.
    BlackBox () {
        System.out.println("-----------------");
        System.out.println("기본생성자 호출");
        //07-2 1씩 더해주는 고유 넘버
        this.indexNum=coutner++;
        System.out.println("새로운 시리얼 넘버를 발급받았습니다." + this.indexNum);
        System.out.println("-----------------");
    }

    BlackBox (String name,String resolution,int price, String color) {
        this(); // 기본생성자 호출

        System.out.println("사용자 정의 생성자 호출");
        this.name=name;
        this.resolution=resolution;
        this.price=price;
        this.color=color;
    }

    // method
    void handleCanAutoReport (){
        if(canAutoReport){
            System.out.println("자동신고기능 있습니다.");
        }else {
            System.out.println("자동신고기능 지원하지 않습니다.");
        }
    }

    void handleMemoryCard (int capacity){
            System.out.println(capacity + "MB 메모리카드가 삽입.");
    }

    // 충돌영상 갯수 반환 충돌 크기에 따라 1 -> 일반영상 , 2 -> 충돌큰영상
    int getVideoCount (int type){
        if(type==1){
            return 9;
        } else if (type ==2) {
            return  16;
        }
        return 25;
    }



    //overloading
    String handleRecord (String name,int num, String day){
       return "이름은: "+name + " 나이는: "+ num+" day : "+day ;
    }
    String handleRecord (String name, int num){
        return handleRecord(name,num,"월요일");
    }
    String handleRecord (String name){
        return handleRecord(name,26,"월요일");
    }
    String handleRecord (int age){
        return handleRecord("mango",age,"월요일");
    }

    //Class Method
    static void callServiceCenter(){   // 모든 객체에서 같은 동작을 한다.
        System.out.println("서비스센터 (1588-0000) 로 연결합니다.");
        canAutoReport =true;  // static으로 선언한 class 변수는 static 메소드에서 바로 사용할수 있다.
        // name = "mango" 이건 인스턴스 변수라 객체가 만들어져야 만들어지기때문에 static 메소드에서 바로사용할 수 없다.
    }

     void appendModalName(String name) {
        this.name+=name;
    }
}
