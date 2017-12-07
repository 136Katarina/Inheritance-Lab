import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Wendy", "TFR286", 90500.67, "CEO", 20000);
    }

    @Test
    public void cangetBudget(){
        assertEquals(20000,director.getBudget(), 0.2);
    }

    @Test
    public void canPayDirectorsBonus(){
        assertEquals(1810.01, director.payBonus(),0.2);
    }

}
