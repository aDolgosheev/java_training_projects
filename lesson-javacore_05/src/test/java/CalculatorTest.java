import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorTest {

    Calculator sut;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before all");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After all");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Before each");
        sut = new Calculator();
    }

    @AfterEach
    public void afterEach() {
        System.out.println("After each");
        sut = null;
    }

    @Test
    public void testAdd() {
        //arrange
        int a = 2;
        int b = 19;
        int expected = 21;

        //act
        int result = sut.add(a, b);

        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testSubtraction() {
        //arrange
        int a = 21;
        int b = 19;
        int expected = 2;

        //act
        int result = sut.subtraction(a, b);

        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testMultiply() {
        //arrange
        int a = 2;
        int b = 8;
        int expected = 16;

        //act
        int result = sut.multiply(a, b);

        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testDivide() {
        //arrange
        int a = 25;
        int b = 5;
        int expected = 5;

        //act
        int result = sut.divide(a, b);

        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testDivideByZero() {
        //arrange
        int a = 25;
        int b = 0;
        //int expected = 5;
        Class<ArithmeticException> excepted = ArithmeticException.class;

        //act
        Executable executable = () -> sut.divide(a, b);

        //assert                                                //act
        Assertions.assertThrows(excepted, executable);
        //Assertions.assertEquals(expected, result);
    }

    public static Stream<Arguments> mySource() {
        return Stream.of(Arguments.of(1, 2, 3), Arguments.of(2, 3, 5), Arguments.of(1, 45, 46), Arguments.of(0, 0, 0));
    }

    @ParameterizedTest
    @MethodSource("mySource")
    public void testAddWithParameters(int a, int b, int expected) {
        //act
        int result = sut.add(a, b);

        //assert
        Assertions.assertEquals(expected, result);
    }
}