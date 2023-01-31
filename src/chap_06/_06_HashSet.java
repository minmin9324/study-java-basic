package chap_06;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        // 세트
        // 중복데이터 허용안됨 -> 중복자동제거 , 순서 보장 안됨.
        HashSet<String> set =new HashSet<>();
        set.add("유재석" );
        set.add("유재석" );
        set.add("유재석" );
        set.add("유재석" );
        set.add("조세호");
        set.add("김종국" );
        set.add("장도연" );
        for (String a:set){
            System.out.println(a);
        }
        System.out.println(set.size());
        System.out.println("-------------");
        // 확인
        if(set.contains("유재석")){
            System.out.println("유재석이 있어");
        }
        set.remove("유재석");
        System.out.println("유재석이 삭제했어");
        if(!set.contains("유재석")){
            System.out.println("유재석이 없지");
        }
        System.out.println("-------------");

        //  순서 보장 안됨.
        HashSet<Integer> setInt =new HashSet<>();
        setInt.add(2);
        setInt.add(1);
        setInt.add(13);
        for (int a:setInt){
            System.out.println(a);
        }
        // 중복은 제거하고 싶지만 순서는 보장하고 싶다. -> LinkedHashSet
        System.out.println("-------------");

        HashSet<Integer> setLinkedInt =new LinkedHashSet<>();
        setLinkedInt.add(2);
        setLinkedInt.add(1);
        setLinkedInt.add(13);
        for (int a:setLinkedInt){
            System.out.println(a);
        }
    }
}
