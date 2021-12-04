package builder;

import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void testBuilder() {
        User user = User.builder().name("Oleno4ka").age(18).gender("female").occupation("UCU").build();
        assertEquals(user.toString(), "User(name=Oleno4ka, age=18, gender=female, occupations=[UCU])");
    }
}

