package cashregister;


import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class CashRegisterTest {
    static ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

    @BeforeAll
    static public void setup() {
        System.setOut(new PrintStream(byteArrayOutputStream));
    }

    @Test
    public void should_print_the_real_purchase_when_call_process() {
        //given
        //when
        //then
    }

    @Test
    public void should_print_the_stub_purchase_when_call_process() {
        //given
        //when
        //then
    }

    @Test
    public void should_verify_with_process_call_with_mockito() {
        //given
        //when
        //then
    }

}
