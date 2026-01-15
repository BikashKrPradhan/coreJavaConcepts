package OOPConcept.InterfaceAndAbstractClass;

public class CreditCardPayment implements Payment{
    @Override
    //I tried implementing a interface which has a method with no access modifier , i had to add public to the implementation.
    //This causes a compile-time error: attempting to assign weaker access privileges; was public
    // ❌ package-private
    //Java does not allow weaker access in overriding/implementing
    public void pay(double amount) {
        System.out.println(amount);
    }
}
