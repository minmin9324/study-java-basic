package chap_04;

public class _16_Enum {
    public static void main(String[] args) {
        // 열거형 Enum


        Resolution resolution = Resolution.HD;
        System.out.println(resolution);

        resolution= Resolution.valueOf("URD");
        System.out.println(resolution);

        for(Resolution resolution1:Resolution.values()) {
            System.out.print("keyname :"+resolution1.getKeyName() + ", size : "+resolution1.getSize());
            System.out.println(", member :" +resolution1.name() + " orderIndex : " + resolution1.ordinal());
        }

        switch (resolution){
            case HD:
                System.out.println("HD");
                break;
            case FHD:
                System.out.println("FHD");
                break;
            case URD:
                System.out.println("URD");
                break;
        }
    }
}

enum Resolution {
    HD("hd",1280),FHD("fhd",1920),URD("urd",3840);

    int size ;
    String keyName ;

    Resolution(String keyName, int size){
            this.keyName=keyName;
            this.size=size;
    }

    public String getKeyName(){
        return this.keyName;
    }

    public int getSize(){
        return this.size;
    }
}