package chap_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {

  public static void main(String[] args) {
    // 스트림

    // 스트림 생성
    // Arrays.stream
    int[] score = {100, 95, 85, 80};
    IntStream scoreStream = Arrays.stream(score);

    String[] strings = {"python", "java", "c"};
    Stream<String> stringsStream = Arrays.stream(strings);

    // Collection.stream
    List<String> langList = new ArrayList<>();
    // langList.add("python","java");
    langList = Arrays.asList("python", "java", "c");
    Stream<String> langListStream = langList.stream();
    System.out.println(langList);

    // Stream.of()
    Stream<String> stream = Stream.of("python", "java", "c");

    // 스트림 사용
    // 중간연산 (intermediate Operation) : filter. sorted. distinct, skip ...
    // 최종연산 (Terminal Operation) : count . min . max .sum , forEach. anyMatch. allMatch ...
   Arrays.stream(score).filter((ele) -> ele > 90).forEach((ele)-> System.out.println(ele));
    Arrays.stream(score).filter((ele) -> ele > 90).forEach(System.out::println); // 클래스명 :: 메소드명 하면 자동으로 ele값 넘어감.

    int count = (int)Arrays.stream(score).filter((ele) -> ele > 90).count();
    System.out.println(count);
    System.out.println("---------");

    long count2 = Arrays.stream(score).filter((ele) -> ele > 90).count();
    System.out.println(count2);
    System.out.println("---------");

    int sum = Arrays.stream(score).filter((ele) -> ele > 90).sum();
    System.out.println(sum);
    System.out.println("---------");

    Arrays.stream(score).filter((ele) -> ele > 90).sorted().forEach((ele)-> System.out.println(ele));
    //
    Arrays.stream(strings).filter((str)->str.startsWith("p")).forEach(System.out::println);
    System.out.println("---------");
    Arrays.stream(strings).filter((str)->str.contains("j")).forEach(System.out::println);
    System.out.println("---------");
    langList.stream().filter((str)->str.length()>1).sorted().forEach(System.out::println);
    System.out.println("---------");
    langList.stream().filter((str)->str.length()>1&&str.contains("p")).sorted().forEach(System.out::println);

    // 리스트로 저장.
    List<String> collect = langList.stream().filter((str) -> str.length() > 1).sorted()
        .collect(Collectors.toList());
    collect.stream().forEach(System.out::println);
  }

}
