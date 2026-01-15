package OOPConcept.InheritanceAndMethodOverRiding;

class Employee {
    protected double baseSalary;
    Employee(double salary){
        this.baseSalary = salary;
    }
    double calculateSalary(){
        return this.baseSalary;
    }
}

