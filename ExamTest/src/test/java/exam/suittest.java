package exam;

import junit.framework.TestCase;
import org.junit.runners.Suite;

@Suite.SuiteClasses({exam1_mock.class, exam1_unitTesting.class})
public class suittest extends TestCase {


    public void testExam() {
        exam1_mock exam1_mock = new exam1_mock();
        exam1_mock.examMockTest();
        exam1_unitTesting exam1_unitTesting = new exam1_unitTesting(1, false);
        exam1_unitTesting.TestExam();
    }
}