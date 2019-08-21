package ru.job4j.finaltest;

/*
  Class DepartmentSortTest
  @author Dmitry Lebedev
 * @since 19.08.2019
 */

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import java.util.*;

public class DepartmentSortTest {

   @Test
    public void whenAddDepartmentThenWeHaveOneDepartment() {
       DepartmentSort dep = new DepartmentSort();
       Department test1 = new Department("Test1");
       Department test2 = new Department("Test2");
       dep.add(test1);
       dep.add(test2);
       assertThat(dep.getAllDep().size(), is(2));
   }
   @Test
   public void whenAddSomeDepsThenWeNeedSortNaturalThem() {
      DepartmentSort dep = new DepartmentSort();
      Department test1 = new Department("K1\\SK1");
      Department test2 = new Department("K1\\SK2");
      Department test3 = new Department("K1\\SK1\\SSK1");
      Department test4 = new Department("K1\\SK1\\SSK2");
      Department test5 = new Department("K2");
      Department test6 = new Department("K2\\SK1\\SSK1");
      Department test7 = new Department("K2\\SK1\\SSK2");
      List<Department> list = new ArrayList<>();
      list.add(test6);
      list.add(test2);
      list.add(test3);
      list.add(test4);
      list.add(test1);
      list.add(test5);
      list.add(test7);
      List<Department> result = dep.sortNaturalDep(list);
      List<Department> expect = new ArrayList<>();
      expect.add(test1);
      expect.add(test2);
      expect.add(test3);
      expect.add(test4);
      expect.add(test5);
      expect.add(test6);
      expect.add(test7);
      //assertThat(result, is(expect));
       System.out.println("-------");
       for (Department tmp : result) {
           System.out.println(tmp.getName());
       }
   }

   @Test
   public void whenAddSomeDepsThenReversSortThem() {
      DepartmentSort dep = new DepartmentSort();
      Department test1 = new Department("K1\\SK1");
      Department test2 = new Department("K1\\SK2");
      Department test3 = new Department("K1\\SK1\\SSK1");
      Department test4 = new Department("K1\\SK1\\SSK2");
      Department test5 = new Department("K2");
      Department test6 = new Department("K2\\SK1\\SSK1");
      Department test7 = new Department("K2\\SK1\\SSK2");
      List<Department> list = new ArrayList<>();
      list.add(test6);
      list.add(test2);
      list.add(test3);
      list.add(test4);
      list.add(test1);
      list.add(test5);
      list.add(test6);
      List<Department> result = dep.sortReverseDep(list);
      List<Department> expect = new ArrayList<>();
      expect.add(test6);
      expect.add(test5);
      expect.add(test4);
      expect.add(test3);
      expect.add(test2);
      expect.add(test1);
      expect.add(test7);
      //assertThat(result, is(expect));
       System.out.println("-------");
       for (Department tmp : result) {
           System.out.println(tmp.getName());
       }
   }
}
