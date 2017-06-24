package test;

import main.FizzBuzz;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by tutan on 6/24/2017.
 */
public class FizzBuzzTest {


    FizzBuzz fizzBuzz;
    @Before
    public void setUp(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void of_0is0(){
        assertThat(fizzBuzz.of(0), is("0"));
    }

    @Test

    public void of_1is1() {
        assertThat(fizzBuzz.of(1), is("1"));
    }

    @Test
    public void of_3isFizz() {
        assertThat(fizzBuzz.of(3), is("Fizz"));
    }

    @Test
    public void of_5isBuzz() {
        assertThat(fizzBuzz.of(5), is("Buzz"));
    }

    @Test
    public void of_6isFizz() {
        assertThat(fizzBuzz.of(6), is("Fizz"));
    }

    @Test
    public void of_10isBuzz() {
        assertThat(fizzBuzz.of(10), is("Buzz"));
    }

    @Test
    public void of_15isFizzBuzz() {
        assertThat(fizzBuzz.of(15), is("FizzBuzz"));
    }
}
