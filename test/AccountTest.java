import org.junit.jupiter.api.Test;

public class AccountTest { @Test
    public void testWithdrawalMethod() {
        Account JackAccount = new Account();
        JackAccount.withdrawal(100.0);
    }
}
