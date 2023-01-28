package chap_04;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox box=new BlackBox();
        box.handleCanAutoReport();
        System.out.println("-- 기능구현 후 --");
        BlackBox.canAutoReport=true;
        box.handleCanAutoReport();


        int fileCount = box.getVideoCount(1);
        System.out.println(fileCount);

        int fileCount1 = box.getVideoCount(2);
        System.out.println(fileCount1);

        int fileCount2 = box.getVideoCount(4);
        System.out.println(fileCount2);



        String str = box.handleRecord("mangooo");
        System.out.println(str);

        String str1 = box.handleRecord(24);
        System.out.println(str1);

        String str2 = box.handleRecord("mangooo",24,"금요일");
        System.out.println(str2);

    }
}
