import org.junit.Assert;
import org.junit.Test;

public class BankAppTests {

    @Test
    public void method_to_see_if_withdrawal_works() {
        AccDetails accDetails = new AccDetails();
        accDetails.setBalance(100);
        long expectedResult = accDetails.getBalance();
        Assert.assertEquals(expectedResult, accDetails.getBalance());
    }
}
