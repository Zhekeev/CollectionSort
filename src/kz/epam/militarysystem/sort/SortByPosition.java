package kz.epam.militarysystem.sort;

import kz.epam.militarysystem.Employee;
import kz.epam.militarysystem.Position;

import java.util.Comparator;

public class SortByPosition extends Position implements Comparator<Employee> {

    @Override
    public int compare(Employee o, Employee o2) {
        return positionPriority.get(o.getRank()) - positionPriority.get(o2.getRank());
    }
}
