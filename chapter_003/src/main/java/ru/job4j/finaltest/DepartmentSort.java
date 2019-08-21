package ru.job4j.finaltest;

import java.util.*;

/**
 * Class DepartmentSort
 * @author Dmitry Lebedev
 * @since 16.08.2019
 */

public class DepartmentSort {
    private List<Department> allDep = new ArrayList<>();

    void add(Department dep) {
        allDep.add(dep);
    }

    void delDep(Department dep) {
        allDep.remove(dep);
    }

    List<Department> getAllDep() {
        List<Department> tmpDep = new ArrayList<>();
        for (Department tmp : allDep) {
            if (tmp != null) {
                tmpDep.add(tmp);
            }
        }
        return tmpDep;
    }

    List<Department> getSpecificDep(Department dep) {
        List<Department> tmpSpec = new ArrayList<>();
        for (Department tmp : allDep) {
            if (tmp.equals(dep)) {
                tmpSpec.add(tmp);
                break;
            }
        }
        return tmpSpec;
    }

    List<Department> sortNaturalDep(List<Department> list) {

        List<Department> result = new ArrayList<Department>();
        result.addAll(list);
        result.sort(new Comparator<Department>() {
            @Override
            public int compare(Department o1, Department o2) {
                int name = o1.getName().compareTo(o2.getName());
                return name;
            }
        });
        return result;
    }

    List<Department> sortReverseDep(List<Department> list) {
        List<Department> result = new ArrayList<Department>();
        result.addAll(list);
        Collections.sort(result, Collections.reverseOrder());
        return result;
    }
}
