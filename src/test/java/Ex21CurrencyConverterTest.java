import ejercicios.Ex21CurrencyConverter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class Ex21CurrencyConverterTest {

    @InjectMocks
    Ex21CurrencyConverter ex21CurrencyConverter;
    @Mock
    Scanner input = new Scanner(System.in);

    @Test
    public void currencyConverterTest(){
        when(input.nextDouble()).thenReturn(5.00);
        when(input.nextInt()).thenReturn(1);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Ex21CurrencyConverter.runConverter(input);

        Assert.assertTrue(out.toString().contains(" EUR to "));

    }

    @Test
    public void euroToDollarTest(){

        when(input.nextDouble()).thenReturn(5.00);
        when(input.nextInt()).thenReturn(1);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Ex21CurrencyConverter.runConverter(input);

        Assert.assertTrue(out.toString().contains("5.0 EUR to Dollar = "+5*1.28611));

    }

    @Test
    public void euroToYenTest(){

        when(input.nextDouble()).thenReturn(5.00);
        when(input.nextInt()).thenReturn(2);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Ex21CurrencyConverter.runConverter(input);

        Assert.assertTrue(out.toString().contains("5.0 EUR to Yen = "+5*129.852));

    }

    @Test
    public void euroToPoundTest(){

        when(input.nextDouble()).thenReturn(5.00);
        when(input.nextInt()).thenReturn(3);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Ex21CurrencyConverter.runConverter(input);

        Assert.assertTrue(out.toString().contains("5.0 EUR to Pound = "+5*0.86));

    }

}
