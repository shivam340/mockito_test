package io.com.mockitoimplementation;

import android.test.suitebuilder.annotation.SmallTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
/**
 * Created by shivam on 2/24/16.
 */
@SmallTest
@RunWith(MockitoJUnitRunner.class)
public class DemoTest {

    private static final int a = 10;
    private static final int b = 20;

    private static int additionResult;
    private static int subTractionResult;
    private static int multiplicationResult;

    private static int falseAdditionResult;
    private static int falseSubTractionResult;


    static {
        additionResult = a + b;
        subTractionResult = a - b;
        multiplicationResult = a * b;

        falseAdditionResult = 10;
        falseSubTractionResult = 12;

    }

    @Mock
    MyMath mMyMath;

    @Before
    public void initMocks(){
        when(mMyMath.add(a,b)).thenReturn(falseAdditionResult);
        when(mMyMath.sub(a,b)).thenReturn(falseSubTractionResult);
        when(mMyMath.multi(a,b)).thenReturn(multiplicationResult);

    }


    @Test
    public void testAddition(){
        assertThat("failed to add numbers", mMyMath.add(a, b), is(additionResult));
    }

    @Test
    public void testSubtraction(){
        assertThat("failed to subtract numbers", mMyMath.sub(a, b), is(subTractionResult));
    }


    @Test
    public void testMultiplication(){
        assertThat("failed to multiply numbers", mMyMath.multi(a, b), is(multiplicationResult));
    }
}
