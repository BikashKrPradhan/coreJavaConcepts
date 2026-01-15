import OOPConcept.Encapsulation.BankAccount;

void main() {
    BankAccount bankAccount = new BankAccount(123, 98736.26);
    bankAccount.deposit(1000.00);
    bankAccount.withdraw(456.45);
    double savings = bankAccount.getBalance();
    System.out.println(savings);
}
