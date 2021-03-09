import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StrEditTest {

    private StrEdit str;

    @Before
    public void setup() {
        str = new StrEdit();
    }

    @Test
    public void size() {
        String temp = "Good morning!";
        Assert.assertEquals(13, str.size(temp));
    }

    @Test
    public void merge() {
        String temp1 = "Good", temp2 = "morning";
        Assert.assertEquals("Goodmorning", str.merge(temp1, temp2));
    }

    @Test
    public void toLow() {
        String temp = "Hello";
        Assert.assertEquals("HELLO", str.toLow(temp));
    }

    @Test
    public void toUp() {
        String temp = "Hello";
        Assert.assertEquals("HELLO", str.toUp(temp));

    }
}
