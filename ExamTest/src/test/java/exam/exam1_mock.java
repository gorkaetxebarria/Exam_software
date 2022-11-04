package exam;

import org.easymock.EasyMock;
import org.easymock.EasyMockSupport;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class exam1_mock extends EasyMockSupport {
   exam1 exam1Mock;
    @Before
    public  void setUp() {
      exam1Mock=EasyMock.partialMockBuilder(exam1.class).addMockedMethods("oneHalf", "getRestZero").createMock();
    }

    @Test
    public void examMockTest() {

        EasyMock.expect(exam1Mock.oneHalf(2)).andReturn(1);
        EasyMock.expect(exam1Mock.getRestZero(2, 1)).andReturn(false);
        replayAll();
        assertEquals(1,exam1Mock.oneHalf(2));
        assertFalse(exam1Mock.getRestZero(2, 1));
        verifyAll();
    }


}