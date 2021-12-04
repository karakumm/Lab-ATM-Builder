package atm;

import org.junit.Test;

public class ATMTest {
    @Test
    public void processCorrect() {
        ATM atm = new ATM();
            atm.process(500);
    }

    @Test(expected = IllegalArgumentException.class)
    public void processInvalid() {
        ATM atm = new ATM();
        atm.process(501);
    }
}
