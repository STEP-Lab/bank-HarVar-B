import com.thoughtworks.step.bank.Account;
import com.thoughtworks.step.bank.AccountNumber;
import com.thoughtworks.step.bank.InsufficientFundsException;
import com.thoughtworks.step.bank.MinimumBalanceException;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AccountTest {

    private Account acc;

    @Before
    public void setUp() throws Exception{
            acc = new Account(new AccountNumber("1912-7864"),1200);
    }

    @Test
    public void getBal() {
        assertThat(acc.getBal(),is(1200.0F));
    }


    @Test
    public void debit() throws Exception{
        acc.debit(400);
        assertThat(acc.getBal(),is(800.0F));
    }
    @Test
    public void credit(){
        acc.credit(400);
        assertThat(acc.getBal(),is(1600.0F));
    }

    @Test(expected = InsufficientFundsException.class)
    public void checkIfExcessMoneyCanBeDebitedFromAccount() throws Exception{
        Account harvar;
        harvar = new Account(new AccountNumber("1912-7864"), 1200);
        harvar.debit(400);
        harvar.debit(1000);
    }

    @Test(expected = MinimumBalanceException.class)
    public void checkIfAccountCanBeCreatedWithOutMinimumBalance() throws Exception {
        new Account(new AccountNumber("1912-7864"),800);
    }
}