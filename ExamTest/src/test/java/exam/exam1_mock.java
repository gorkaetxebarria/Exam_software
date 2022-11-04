package exam;

import org.easymock.EasyMockSupport;
import org.junit.Before;

public class exam1_mock extends EasyMockSupport {
    exam1 exam1;
    @Before
    public void setUp() throws Exception {
        exam1 = partialMockBuilder(exam1.class).addMockedMethod("oneHalf").addMockedMethod("getRestZero").createMock();
    }


}