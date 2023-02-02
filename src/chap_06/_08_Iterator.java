package chap_06;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        // 이터레이터 -> 순회 , 순회도중 삭제 가능
        List<String> list =new ArrayList<>();
        list.add("유재석" );
        list.add("알수없음" );
        list.add("조세호");
        list.add("알수없음" );
        list.add("알수없음" );
        list.add("김종국" );
        list.add("장도연" );
        for (String s:list){
            System.out.println(s);
        }
        System.out.println("-----------------");

        Iterator<String> iterator =list.iterator();  // 리스트의 처음 item부터 담김.
        System.out.println(iterator.next());  // 출력하고 난뒤 하나 이동함.
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println("-----------------");

        iterator=list.iterator(); // 다시 처음위치로이동.
        System.out.println(iterator.hasNext()); // 다음 이동할 iterator 가 있는지 확인. true/false ,

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("-----------------");
        iterator=list.iterator(); // 다시 처음위치로이동.
        while (iterator.hasNext()){
            String str = iterator.next();
            if(str.contains("알수없음")){
                System.out.println(str+" 삭제");
                iterator.remove();
            }else{
                System.out.println(str);
            }
        }
        System.out.println("---------삭제된 후 --------");
        iterator=list.iterator(); // 다시 처음위치로이동.
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("-----------------");

        HashSet<String> set =new HashSet<>();
        set.add("김종국" );
        set.add("장도연" );
        Iterator iSet=set.iterator();
        while (iSet.hasNext()){
            System.out.println(iSet.next());
        }

        System.out.println("-----------------");

        HashMap<String,Integer> map =new HashMap<>();
        map.put("아이스크림", 5000 );
        map.put("과자",7000 );
        // map은 iterator 제공하지않음. Iterator iMap=map.iterator();
        Iterator<String> iMap=map.keySet().iterator();
        Iterator<Integer> iMapValue=map.values().iterator();
        while (iMap.hasNext()){
            String keyStr =iMap.next();
            System.out.println(keyStr + ", value : "+map.get(keyStr));
        }
        while (iMapValue.hasNext()){
            Integer iValue =iMapValue.next();
            System.out.println(" value : "+iValue);
        }

        System.out.println(map.entrySet());
        Iterator<Map.Entry<String, Integer>> iterator1 = map.entrySet().iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

    }
}
