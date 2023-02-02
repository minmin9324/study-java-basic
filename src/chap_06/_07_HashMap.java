package chap_06;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        // 맵 (key,value)
        // 순서 보장 되지않음.
        // 키값의 중복허용 안됨.
        HashMap<String,Integer> map =new HashMap<String, Integer>();

        // 데이터 추가
        map.put("유재석",10);
        map.put("장도연",23);
        map.put("서강준",3);
        map.put("송중기",4);
        map.put("서장훈",6);
        System.out.println("총 갯수 : " + map.size());
        System.out.println("-------");

        System.out.println("유재석의 value : "+ map.get("유재석"));
        System.out.println("서장훈의 value : "+ map.get("서장훈"));

        if(map.containsKey("서장훈")){
            int value =map.get("서장훈");
            map.put("서장훈",++value);
        }else {
            map.put("서장훈",1);
        }
        System.out.println("서장훈의 value가 1증가 : "+ map.get("서장훈"));
        map.remove("서장훈");
        System.out.println("서장훈의 value가 삭제됐는데 ? : "+ map.get("서장훈"));
        System.out.println("총 갯수 : " + map.size());
        map.clear();
        System.out.println("다 삭제했지 : " + map.size());
        System.out.println("-------");
        map.put("유재석",10);
        map.put("장도연",23);
        map.put("서강준",3);
        map.put("송중기",4);
        map.put("서장훈",6);

        System.out.println(map.keySet());  // 순서 보장 되지않음.
        System.out.println(map.values());

        for(String key:map.keySet()){
            System.out.println("key: "+key+" value : "+map.get(key));
        }
        for(int key:map.values()){
            System.out.println("value: "+key);
        }

        System.out.println("-------");

        // 순서를 보장하고 싶을때
        HashMap<String,Integer> map2 =new LinkedHashMap<>();
        map2.put("유재석",10);
        map2.put("장도연",23);
        map2.put("서강준",3);
        map2.put("송중기",4);
        map2.put("서장훈",6);
        System.out.println(map2.keySet());
    }
}
