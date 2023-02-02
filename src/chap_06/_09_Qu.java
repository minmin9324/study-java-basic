package chap_06;

import java.util.ArrayList;

public class _09_Qu {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student("최정민","java"));
        arrayList.add(new Student("최정민1","c++"));
        arrayList.add(new Student("최정민2","java"));
        arrayList.add(new Student("최정민3","python"));
        arrayList.add(new Student("최정민4","javaa"));

        System.out.println("자바를 보유하고 있는 학생");
        System.out.println("-------------------");

        for(Student s:arrayList){
            if(s.lang.equals("java")){
                System.out.println(s.name);
            }
        }

    }
}

 class Student {
     public String name;
     public String lang;
    public Student (String name,String lang){
        this.name=name;
        this.lang = lang;
    }
}

// private, public, protected, defalut 구분
// interface, abstract 구분
// iterator 원리 ?