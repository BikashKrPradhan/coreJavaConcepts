package OOPConcept.InheritanceAndMethodOverRiding;

public class Main {
    public static void main(String[] args){
        Employee emp = new FullTimeEmployee(237849.27);
        System.out.println(emp.calculateSalary());
    }
}
