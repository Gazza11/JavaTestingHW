import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle bottleOne;

    @Before
    public void before() {
        bottleOne = new WaterBottle(100);
    }

    @Test
    public void initialVolume(){
        assertEquals(100, bottleOne.getVolume());
    }

    @Test
    public void afterOneDrink(){
        bottleOne.takeDrink();
        assertEquals(90, bottleOne.getVolume());
    }

    @Test
    public void afterTwoDrinks(){
        bottleOne.takeDrink();
        bottleOne.takeDrink();
        assertEquals(80, bottleOne.getVolume());
    }

    @Test
    public void emptyBottle(){
        bottleOne.empty();
        assertEquals(0, bottleOne.getVolume());
    }

    @Test
    public void filledBottle(){
        bottleOne.fill();
        assertEquals(100, bottleOne.getVolume());
    }
}
