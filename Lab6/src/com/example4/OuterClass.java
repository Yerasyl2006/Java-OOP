package com.example4;


public class OuterClass {

    public void method() {

        class LocalClass1 {
            void display() {
                System.out.println("LocalClass1 inside method");
            }
        }
        LocalClass1 lc1 = new LocalClass1();
        lc1.display();


        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Local Inner Class Runnable");
            }
        };
        r.run();
    }


    private Runnable anonymous1 = new Runnable() {
        @Override
        public void run() {
            System.out.println("Anonymous Inner Class 1");
        }
    };

    private Runnable anonymous2 = new Runnable() {
        @Override
        public void run() {
            System.out.println("Anonymous Inner Class 2");
        }
    };


    class MemberInnerClass1 {
        void display() {
            System.out.println("Member Inner Class 1");
        }
    }

    class MemberInnerClass2 {
        void display() {
            System.out.println("Member Inner Class 2");
        }
    }

    class MemberInnerClass3 {
        void display() {
            System.out.println("Member Inner Class 3");
        }
    }


    static class StaticNestedClass {
        void display() {
            System.out.println("Static Nested Class");
        }
    }

    public void anotherMethod() {

        class LocalClass2 {
            void display() {
                System.out.println("LocalClass2 inside anotherMethod");
            }
        }
        LocalClass2 lc2 = new LocalClass2();
        lc2.display();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.method();
        outer.anotherMethod();

        OuterClass.MemberInnerClass1 member1 = outer.new MemberInnerClass1();
        member1.display();

        OuterClass.MemberInnerClass2 member2 = outer.new MemberInnerClass2();
        member2.display();

        OuterClass.MemberInnerClass3 member3 = outer.new MemberInnerClass3();
        member3.display();

        OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
        staticNested.display();
    }
}