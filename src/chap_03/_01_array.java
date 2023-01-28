package chap_03;

public class _01_array {
    public static void main(String[] args) {
        // 첫번째 방법
        String[] arr = new String[5];  // 크기가 5개인 배열을 만듬.
        arr[2]="3번이야";

        // 두번ㄷ째
        String[] arr2 = new String[]{ "", "","3번이야",""};

        // 세번째
        String[] arr3 = { "", "","3번이야",""};

        System.out.println(arr);
        System.out.println(arr2);
        System.out.println(arr3);
        System.out.println(arr[2]);
        System.out.println(arr2[2]);
        System.out.println(arr3[2]);

    }
}
