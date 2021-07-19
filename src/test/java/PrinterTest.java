import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(50, 100);
    }

    @Test
    public void numberOfSheets(){
        assertEquals(50, printer.getSheets());
    }

    @Test
    public void printCheck(){
        printer.print(5, 2);
        assertEquals(40, printer.getSheets());
    }

    @Test
    public void printCheckNotEnough(){
        printer.print(25, 4);
        assertEquals(50, printer.getSheets());
    }

    @Test
    public void checkToner(){
        assertEquals(100, printer.getToner());
    }

    @Test
    public void printRemovesToner(){
        printer.print(5, 4);
        assertEquals(80, printer.getToner());
    }
}
