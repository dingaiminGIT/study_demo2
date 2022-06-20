package com.aiminding.study.demo.javabase;


import org.junit.Test;

public class LongTest {

    @Test
    public void test2() {
        long a = get();
        System.out.println(a);
    }

    private Long get() {
        return null;
    }
    
    @Test
    public void test() {
        Dog dog = new Dog();
        dog.setId(0L);
        System.out.println(dog.getId().equals(0L));
    }

    class Dog {
        Long id;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
    }
}
