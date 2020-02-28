package kz.epam.company;

public class EmployeeManagement implements Employee {

    private int id;
    private String name;
    private String lastName;
    private String position;

    public EmployeeManagement(int id, String name, String lastName, String position){
        this.id = id;
        this.name=name;
        this.lastName = lastName;
        this.position = position;
    }

    @Override
    public int getId() {

        return id;
    }

    @Override
    public String getName() {

        return name;
    }

    @Override
    public String getLastName() {

        return lastName;
    }

    @Override
    public String getPosition()
    {

        return position;
    }

    public void getInfo() {
        System.out.println("Id = " + id + "| Name = " + name + "| Last Name = " + lastName + "| SortByPosition = " + position);
    }
}
