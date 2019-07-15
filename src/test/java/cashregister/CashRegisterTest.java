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
        Item[] items = {new Item("milkTea", 15), new Item("chocolate", 6)};
        Purchase purchase = new Purchase(items);
        Printer printer = new Printer();
        CashRegister cashRegister = new CashRegister(printer);

        cashRegister.process(purchase);

        assertThat(byteArrayOutputStream.toString()).isEqualTo("milkTea\t15.0\nchocolate\t6.0\n");  // 加toString转为string类型
//      assertEquals("milkTea\t15\nchocolate\t6\n", byteArrayOutputStream.toString());  // 为什么这一条不对
    }

    @Test
    public void should_print_the_stub_purchase_when_call_process() {
         Printer printer = new Printer();
        CashRegister cashRegister = new CashRegister(printer);
        Purchase purchase = mock(Purchase.class);
        when(purchase.asString()).thenReturn("mock purchase");

        cashRegister.process(purchase);

        assertThat(byteArrayOutputStream.toString()).isEqualTo("mock purchase");
    }

    @Test
    public void should_verify_with_process_call_with_mockito() {
        //given
        //when
        //then
    }

}
