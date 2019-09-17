package ru.job4j.ftest2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Class DepSort
 * @author Dmitry Lebedev
 * @since 21.08.2019
 */

public class DepSort {

    private List<Dep> depList = new ArrayList<>();

    /*public void addDep(Dep dep) {
        depList.add(dep);
    }*/

    /*public void delDep(Dep dep) {
        depList.remove(dep);
    }*/

    List<Dep> getAllDep(List<Dep> tmp) {
        List<Dep> result = new ArrayList<>();
        result.addAll(tmp);
        result.sort(new DepCompare());
        return result;
    }

    List<Dep> depSortAtoB(List<Dep> tmp) {
        List<Dep> result = new ArrayList<>();
        result.addAll(tmp);
        result.sort(new DepCompare());
        return result;
    }

    /*List<Dep> depSortBtoA(List<Dep> tmp) {
        List<Dep> result = new ArrayList<>();
        result.addAll(tmp);
        result.sort(new DepCompare().reversed());
        return result;
    }*/
    List<Dep> nameSortBtoA(List<Dep> tmp) {
        List<Dep> result = new ArrayList<>();
        for (int i = 0; i < tmp.size() - 1; i++) {
            for(int j = 0; j < Math.min(tmp.get(i).getLength(), tmp.get(i + 1).getLength()); j++) {
                if (tmp.get(i).getName().charAt(j) != tmp.get(i + 1).getName().charAt(j)) {

                }
            }
        }
        return null;
    }
}
