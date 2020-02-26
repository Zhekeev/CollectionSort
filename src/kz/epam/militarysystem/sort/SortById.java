package kz.epam.militarysystem.sort;

import kz.epam.militarysystem.Employee;

import java.util.Comparator;

public class SortById implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getId() - o2.getId();
    }
}
