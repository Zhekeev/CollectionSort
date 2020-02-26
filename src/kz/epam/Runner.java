package kz.epam;

import kz.epam.militarysystem.*;
import kz.epam.militarysystem.sort.*;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<EmployeeManagement> ceo = new ArrayList<>();
        List<EmployeeManagement> deputyHead = new ArrayList<>();
        List<EmployeeManagement> manager = new ArrayList<>();
        List<EmployeeManagement> worker = new ArrayList<>();

        ceo.add(new EmployeeManagement(1,"Trey","Parker", Position.CEO));

        deputyHead.add(new EmployeeManagement(5,"Jack","Daniels", Position.DEPUTY_HEAD));
        deputyHead.add(new EmployeeManagement(6,"Bill","Gates", Position.DEPUTY_HEAD));

        manager.add(new EmployeeManagement(8,"Yergazy","Zhekeev", Position.MANAGER));
        manager.add(new EmployeeManagement(9,"Bread","Pitt",Position.MANAGER));
        manager.add(new EmployeeManagement(10,"John","Wick",Position.MANAGER));

        worker.add(new EmployeeManagement(12,"Eric","Cartman",Position.WORKER));
        worker.add(new EmployeeManagement(13,"Stan","Marsh", Position.WORKER));
        worker.add(new EmployeeManagement(13,"Kyle","Broflovski", Position.WORKER));
        worker.add(new EmployeeManagement(13,"Kenny","McCormick", Position.WORKER));

        manager.addAll(worker);
        deputyHead.addAll(manager);
        ceo.addAll(deputyHead);

        System.out.println("Sort by ID");
        ceo.sort(new SortById());
        for (EmployeeManagement employeeManagement:ceo) {
            employeeManagement.getInfo();
        }
        System.out.println("*******************************************");
        System.out.println("Sort by Name");
        ceo.sort(new SortByName());
        for (EmployeeManagement employeeManagement:ceo) {
            employeeManagement.getInfo();
        }
        System.out.println("*******************************************");
        System.out.println("Sort by Last Name");
        ceo.sort(new SortByLastName());
        for (EmployeeManagement employeeManagement:ceo) {
            employeeManagement.getInfo();
        }
        System.out.println("*******************************************");
        System.out.println("Sort by SortByPosition");
        ceo.sort(new SortByPosition());
        for (EmployeeManagement employeeManagement:ceo) {
            employeeManagement.getInfo();
        }
    }
}
