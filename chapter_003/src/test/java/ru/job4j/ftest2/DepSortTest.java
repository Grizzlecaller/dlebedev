package ru.job4j.ftest2;

import org.junit.Test;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.List;

/**
 * Class DepSortTest
 * @author Dmitry Lebedev
 * @since 21.08.2019
 */

public class DepSortTest {

    @Test
    public void WhenAddDepThenSotrAtoB() {
        DepSort dep = new DepSort();
        /*dep.addDep(new Dep("K1"));
        dep.addDep(new Dep("K1\\SK1"));
        dep.addDep(new Dep("K1\\SK1\\SSK1"));
        dep.addDep(new Dep("K1\\SK1\\SSK2"));
        dep.addDep(new Dep("K1\\SK2"));
        dep.addDep(new Dep("K2"));
        dep.addDep(new Dep("K2\\SK1"));
        dep.addDep(new Dep("K2\\SK1\\SSK1"));
        dep.addDep(new Dep("K2\\SK1\\SSK2"));*/
        Dep t1 = new Dep("K1");
        Dep t2 = new Dep("K1\\SK1");
        Dep t3 = new Dep("K1\\SK1\\SSK1");
        Dep t4 = new Dep("K1\\SK1\\SSK2");
        Dep t5 = new Dep("K1\\SK2");
        Dep t6 = new Dep("K2");
        Dep t7 = new Dep("K2\\SK1");
        Dep t8 = new Dep("K2\\SK1\\SSK1");
        Dep t9 = new Dep("K2\\SK1\\SSK2");
        List<Dep> tmp = new ArrayList<>();
        tmp.add(t7);
        tmp.add(t2);
        tmp.add(t4);
        tmp.add(t1);
        tmp.add(t5);
        tmp.add(t3);
        tmp.add(t6);
        tmp.add(t8);
        tmp.add(t9);
        List<Dep> result = dep.depSortAtoB(tmp);
        System.out.println("-----");
        for(Dep i : result) {
            System.out.println(i.getName());
        }
    }

    @Test
    public void WhenAddDepThenSotrBtoA() {
        DepSort dep = new DepSort();
        /*dep.addDep(new Dep("K1"));
        dep.addDep(new Dep("K1\\SK1"));
        dep.addDep(new Dep("K1\\SK1\\SSK1"));
        dep.addDep(new Dep("K1\\SK1\\SSK2"));
        dep.addDep(new Dep("K1\\SK2"));
        dep.addDep(new Dep("K2"));
        dep.addDep(new Dep("K2\\SK1"));
        dep.addDep(new Dep("K2\\SK1\\SSK1"));
        dep.addDep(new Dep("K2\\SK1\\SSK2"));*/
        Dep t1 = new Dep("K1");
        Dep t2 = new Dep("K1\\SK1");
        Dep t3 = new Dep("K1\\SK1\\SSK1");
        Dep t4 = new Dep("K1\\SK1\\SSK2");
        Dep t5 = new Dep("K1\\SK2");
        Dep t6 = new Dep("K2");
        Dep t7 = new Dep("K2\\SK1");
        Dep t8 = new Dep("K2\\SK1\\SSK1");
        Dep t9 = new Dep("K2\\SK1\\SSK2");
        List<Dep> tmp = new ArrayList<>();
        tmp.add(t7);
        tmp.add(t2);
        tmp.add(t4);
        tmp.add(t1);
        tmp.add(t5);
        tmp.add(t3);
        tmp.add(t6);
        tmp.add(t8);
        tmp.add(t9);
        List<Dep> result = dep.depSortBtoA(tmp);
        System.out.println("-----");
        for(Dep i : result) {
            System.out.println(i.getName());
        }
    }
}
