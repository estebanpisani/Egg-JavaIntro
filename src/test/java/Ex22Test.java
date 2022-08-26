import ejercicios.Ex22100NumsVector;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static ejercicios.Ex22100NumsVector.fillVector;

@RunWith(MockitoJUnitRunner.class)
public class Ex22Test {

    @InjectMocks
    Ex22100NumsVector ex22100NumsVector;

    @Test
    public void vectorFillTest(){
        int[] vector = new int[100];
        for (int i = 0; i < 100; i++) {
            vector[i] = i;
        }
        Assert.assertArrayEquals( vector, fillVector(vector));
    }

    @Test
    public void vectorShowTest(){
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        int[] vector = new int[100];
        for (int i = 0; i < 100; i++) {
            vector[i] = i;
        }

        Ex22100NumsVector.showVectorDesc(vector);

        Assert.assertTrue(out.toString().contains("99-98-97-96"));
    }

}
