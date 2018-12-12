package com.example.springboot_jpa_h2_demo;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.LinkedList;
import java.util.List;

public class MockitoDemo {

    @Test
    public void verify_behaviour() {
        List mockList = Mockito.mock(List.class);

        //调用某个函数
        mockList.add("one");
        mockList.clear();

        //验证是否调用了某个函数
        Mockito.verify(mockList).add("one");
        Mockito.verify(mockList).clear();
    }

    @Test(expected = RuntimeException.class)
    public void when_thenReturn() {

        LinkedList mockedList= Mockito.mock(LinkedList.class);
        mockedList.add("add");
        //打桩:某个接口或者类的方法可能没实现,你可以先给他一个假数据
        Mockito.when(mockedList.get(0)).thenReturn("fewgew");
        Mockito.when(mockedList.get(1)).thenThrow(new RuntimeException());

        //调用测试桩函数,默认所有函数都会有返回值,默认返回null
        System.out.println(mockedList.get(0));
        System.out.println(mockedList.get(1));
        System.out.println(mockedList.get(999));

        Mockito.verify(mockedList).get(0);
    }

    @Test
    public void with_arguments(){

    }
}
