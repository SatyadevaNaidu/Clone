import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;
public class MainClass_test {
        private static MainClass uc;

        @BeforeClass
        public static void setup() {
            uc =new MainClass();
        }

        @Test
        public void test_distance_conveter() {
            assertEquals(10,uc.distace_converter(2));
        }
}
