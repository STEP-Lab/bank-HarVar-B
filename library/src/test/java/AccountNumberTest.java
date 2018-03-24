import com.thoughtworks.step.bank.AccountNumber;
import com.thoughtworks.step.bank.InvalidAccountNumberException;
import org.junit.Test;


public class AccountNumberTest {
    @Test(expected= InvalidAccountNumberException.class)
    public void checkAccountNumberFor4Digits() throws Exception{
        new AccountNumber("1234");
    }

    @Test(expected = InvalidAccountNumberException.class)
    public void checkAccountNumberWithAlphanumericCombination() throws Exception{
        new AccountNumber("123a-123a");
    }
}
