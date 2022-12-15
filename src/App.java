import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;
import java.util.ArrayList;
import java.util.List;

public class App {

  public static void main(String[] args) {
    //aki eu criei 3 variavel do tipo Account so que eu estou instanciando os objetos de tipos diferentes
    //fazendo o polimorfisimo upcasting igual foi pasados nas aulas passadas
    //repara que esta dando erro no acc1 por causa do abstract na clas Account

    // Account acc1 = new Account(1001, "Alex", 1000.0);
    //  Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
    // Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);

    //	acc1.withdraw(200.0);
    //System.out.println(acc1.getBalance());
    //	acc2.withdraw(200.0);
    //System.out.println(acc2.getBalance());
    //acc3.withdraw(200.0);
    //System.out.println(acc3.getBalance());
    //=====================================================================================================
    //=====================================================================================================
    //=====================================================================================================

    List<Account> list = new ArrayList<>();

    list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
    list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
    list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
    list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));

    double sum = 0.0;
    for (Account acc : list) {
      sum += acc.getBalance();
    }
    System.out.println("================================");
    System.out.printf("Total balance: %.2f%n", sum);

    for (Account acc : list) {
      acc.deposit(10.0);
    }
    for (Account acc : list) {
      System.out.printf(
        "Updated balance for account %d: %.2f%n",
        acc.getNumber(),
        acc.getBalance()
      );
    }
  }
}
