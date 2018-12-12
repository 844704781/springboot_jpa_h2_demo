package com.example.springboot_jpa_h2_demo;

import java.sql.SQLOutput;
import java.util.Optional;

/**
 * Optional的使用
 */
public class OptionalTest {
    public static void main(String args[])
    {
        //test01();
        test02();
    }

    public static void test02(){
        Card card01 =new Card();
        card01.setGender("12");
        Card card02 =null;
        //返回原始对象
        //原始对象不为空
        Optional<Card> cardOptional01=Optional.ofNullable(card01);
        Card card03=cardOptional01.get();
        System.out.println(card03.getGender());//print 12

        System.out.println(cardOptional01);// print Optional[com.example.springboot_jpa_h2_demo.Card@1ddc4ec2]
        //optional.isPresent() 判断对象是否存在
        System.out.println(cardOptional01.isPresent());//print true

        //原始对象为空
        Optional<Card> cardOptional02=Optional.ofNullable(card02);
        Card card04=cardOptional02.orElse(new Card());
        System.out.println(card04.getGender());//print null
        System.out.println(cardOptional02); // print Optional.empty
        //optional.isPresent() 判断对象是否存在
        System.out.println(cardOptional02.isPresent());//print false
        //创建一个空的optional对象
        Optional optional=Optional.empty();
        System.out.println(optional.isPresent());//print false
    }

    public static void test01(){
        Integer value1=null;
        Integer value2=new Integer(10);
        Optional<Integer> a = Optional.ofNullable(value1);
        System.out.println(a);

        Optional<Integer> b =Optional.of(value2);
        System.out.println(OptionalTest.sum(a,b));
    }


    public static Integer sum(Optional<Integer> a ,Optional<Integer> b){
        System.out.println("第一个参数值存在:"+a.isPresent()); //print false
        System.out.println("第二个参数值存在:"+b.isPresent()); //print true
        Integer value1 = a.orElse(new Integer(0));
        Integer value2 = b.get();
        return value1+value2;
    }
}
