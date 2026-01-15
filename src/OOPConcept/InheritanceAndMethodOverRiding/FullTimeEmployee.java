package OOPConcept.InheritanceAndMethodOverRiding;

class FullTimeEmployee extends Employee{

    FullTimeEmployee(double salary) {
        super(salary);
    }

    // @Override is for the compiler, if not present it, if method name and signature are different it will compile but throw run time error, but if @Override is written, it will throw error in compile time.
    @Override
    double calculateSalary(){
        return baseSalary + 5000;
    }
}
