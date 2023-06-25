package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        MySet myobj = new MySet();
        System.out.println(myobj.add(1));
        System.out.println(myobj.add(2));
        System.out.println(myobj.add(1));
        System.out.println(myobj.get(1));
        System.out.println(myobj.isEmpty());
        //System.out.println(myobj.del(1));
        //System.out.println(myobj.del(2));
        //System.out.println(myobj.del(1));
        System.out.println(myobj.isEmpty());

        Iterator<Integer>iterator= myobj.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            System.out.println(i);
        }

    }
}
    class MySet {
        //private List <Integer> mylist = new ArrayList<>();
        private HashMap<Integer, Object> myDb = new HashMap<>();
        private static final Object MYOBJ = new Object();

        public boolean add(int elem) {
            return myDb.put(elem, MYOBJ) == null;
        }

        public boolean del(int elem) {
            return myDb.remove(elem)==MYOBJ;
        }

        public boolean isEmpty() {
            return myDb.isEmpty();
        }
        public boolean conteins (int elem) {
            return myDb.containsKey(elem);
        }
        public int get (int index) {
            Object[] a=myDb.keySet().toArray();
            return (int) a[index];
        }
        public Iterator<Integer> iterator() {
            return myDb.keySet().iterator();
        }
    }