package exam;

import org.junit.Before;
import org.junit.runners.Parameterized;
@runwith(value = Parameterized.class)
public class exam1_unitTesting {
    exam1 exam1;

    @Before
    public void setUp() throws Exception {
        exam1 = new exam1();
    }
    @Parameterized.Parameters


}