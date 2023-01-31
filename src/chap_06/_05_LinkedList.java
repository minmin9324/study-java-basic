package chap_06;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트
        LinkedList<String> list =new LinkedList<>();

        list.add("유재석");
        list.add("조세호");
        list.add("김종국" );
        list.add("장도연" );

        System.out.println(list.get(0)+ " index : 0");
        System.out.println(list.get(1)+ " index : 1" );
        System.out.println(list.get(2)+ " index : 2");
        System.out.println(list.get(3)+ " index : 3");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println("------------");
        list.addFirst("1번 주자 추가");
        for (String a:list){
            System.out.println(a);
        }
        System.out.println("------------");
        list.addLast("마지막 주자 추가");
        for (String a:list){
            System.out.println(a);
        }
        System.out.println("------------");

        list.add(2,"두번째 인덱스에 들어갈래");
        for (String a:list){
            System.out.println(a);
        }
        //삭제
        System.out.println("삭제전 " + list.size());
        list.remove(list.size()-1);
        System.out.println("삭제후 " + list.size());
        System.out.println("------------- 삭제전 " + list.size()+"-------");
        for (String a:list){
            System.out.println(a);
        }

        list.removeFirst();
        list.removeLast();

        System.out.println("--------- 삭제후"+ list.size()+" ---- ");

        for (String a:list){
            System.out.println(a);
        }
        System.out.println("------------");
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
        Collections.sort(list);
        for (String a:list){
            System.out.println(a);
        }



    }
}
