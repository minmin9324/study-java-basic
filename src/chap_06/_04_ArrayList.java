package chap_06;

import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크 -> 많은 데이터를 쉽게 관리하기 위해
        // List , Set, Map

        ArrayList<String> list = new ArrayList<>();

        // 데이터 추가
        list.add("유재석" );
        list.add("조세호");
        list.add("김종국" );
        list.add("장도연" );

        // 조회
        System.out.println(list.get(0)+ " index : 0");
        System.out.println(list.get(1)+ " index : 1" );
        System.out.println(list.get(2)+ " index : 2");
        System.out.println(list.get(3)+ " index : 3");

        System.out.println("------------");


        // 삭제
        System.out.println("삭제 전 : "+list.size());
        list.remove("김종국");
        System.out.println("삭제 후 : "+list.size());
        System.out.println(list.get(0)+ " index : 0" );
        System.out.println(list.get(1)+ " index : 1");
        System.out.println(list.get(2)+ " index : 2");
        System.out.println("------------");

        list.remove(list.size()-1);
        System.out.println("마지막 index 삭제 후 : "+list.size());
        for (String a:list){
            System.out.println(a);
        }
        // 변경
        list.set(0,"강호동");
        System.out.println( "변경 후 : "+list.get(0)+ ", index : 0" );

        // 포함되어있는지 확인
        System.out.println("강호동은 어디 : "+list.indexOf("강호동"));
        if(list.contains("강호동")){
            System.out.println("강호동이 포함되었는가 : ㅇㅋ");
        }else {
            System.out.println("강호동이 포함되었는가 : ㄴㄴ");
        }

        // 전체삭제
        System.out.println("전체삭제 전 list 사이즈 : "+list.size());
        list.clear();
        System.out.println("전체삭제 후 list 사이즈 : "+list.size());
        if(list.isEmpty()){
            System.out.println("리스트 비워졌음");
        }
        System.out.println("------------");

        // 정렬 ㄱㄴㄷ순
        list.add("유재석" );
        list.add("유재석" );
        list.add("유재석" );
        list.add("유재석" );
        list.add("조세호");
        list.add("김종국" );
        list.add("장도연" );

        list.remove("유재석");
        Collections.sort(list);
        for (String a:list){
            System.out.println(a);
        }

    }
}
