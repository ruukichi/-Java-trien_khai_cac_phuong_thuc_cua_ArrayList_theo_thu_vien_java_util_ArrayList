package com.codegym;

public class Main {

    public static void main(String[] args) {
        MyList<String> arr = new MyList<>();
        arr.add("aaa");
        arr.add("bbb");
        arr.add("CCC");
        arr.add("ddD");

        printMyArrayList(arr, "init array");
        arr.remove(1);
        printMyArrayList(arr, "remove #1");

        arr.add(1, "eee");
        arr.add("ggg");
        printMyArrayList(arr, "add #1 and #last");

        arr.remove();
        printMyArrayList(arr, "remove #last");

        arr.add(-1, "000");
        printMyArrayList(arr, "add #0");

    }

    public static void printMyArrayList(MyList list, String msg) {
        System.out.printf("---%s---\n", msg);
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("---------------------");
    }

    public static void printMyArrayList(MyList list) {
        printMyArrayList(list, "---------------");
    }
    }

