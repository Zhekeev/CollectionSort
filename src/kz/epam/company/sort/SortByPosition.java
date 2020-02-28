package kz.epam.company.sort;

import kz.epam.company.Employee;
import kz.epam.company.Position;

import java.util.Comparator;

public class SortByPosition extends Position implements Comparator<Employee> {

    @Override
    public int compare(Employee o, Employee o2) {
        return positionPriority.get(o.getPosition()) - positionPriority.get(o2.getPosition());
    }
}
