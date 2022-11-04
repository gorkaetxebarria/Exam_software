package exam;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@RunWith(value = Parameterized.class)
public class exam1_unitTesting extends TestCase {
    int n;
    boolean expected;


    @Parameterized.Parameters
    public static Collection<Object[]> numbers(){
        return List.of(new Object[][]{
                {0,false},
                {1,false},
                {2,true},
                {3,true},
                {4,false},
                {5,true},
                {6,false},
                {7,true},
                {8,false},
                {9,false},
                {10,false},
        });
    }

    public  exam1_unitTesting(int n, boolean expected) {
        this.n = n;
        this.expected = expected;
    }

    @Test
    public void TestExam() {
        assertEquals(expected, exam1.exam(n));
    }
}