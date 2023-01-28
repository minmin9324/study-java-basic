package chap_03;

public class _06_MainMethod_Quiz {

    public static String hidden(String data , int index){
        String star ="";
        for (int i=0 ;i<=(data.length()-1)-index;i++){
            star+="*";
        }
        return  data.substring(0,index)+star;
    }



    public static void main(String[] args) {

        String name;
        String num;
        String phone;

        name = args[0].substring(0,1)+("**");
        num = args[1].substring(0,args[1].indexOf("-")+2)+("******");
        phone =args[2].substring(0,args[2].lastIndexOf("-")+1)+("****");

        System.out.println("이름 : "+name);
        System.out.println("주민 : "+num);
        System.out.println("번호 : "+phone);


        System.out.println("이름 : "+ hidden(args[0],1));
        System.out.println("주민 : "+ hidden(args[1],8));
        System.out.println("번호 : "+ hidden(args[2],9));




    }
}
