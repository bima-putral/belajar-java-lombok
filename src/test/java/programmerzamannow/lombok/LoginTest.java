package programmerzamannow.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest {

    @Test
    void testCreate() {
        var login1 = Login.create("bima", "12345");

        Assertions.assertEquals("bima", login1.getUsername());
        Assertions.assertEquals("12345", login1.getPassword());

        var login2 = Login.createEmpty();

        Assertions.assertNull(login2.getUsername());
        Assertions.assertNull(login2.getPassword());
    }

    @Test
    void testToString() {
        var login = Login.create("bima", "abcd123");
        System.out.println(login);
    }
}
