import com.thoughtworks.step.bank.AccountNumber;
import com.thoughtworks.step.bank.Transaction;
import org.junit.Test;

import java.util.Date;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TransactionTest {
    @Test
    public void getDate() throws Exception{
        Transaction transaction;
        Date date = new Date();
        AccountNumber sampleAccountNumber = new AccountNumber("1912-7865");
        transaction = new Transaction(date,1000,sampleAccountNumber);
        assertThat(transaction.getDate(),is(date));
    }
}
