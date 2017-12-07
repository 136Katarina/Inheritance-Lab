import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager ("John","RT56", 30406.76,"IT");
    }

    @Test
    public void canGetname(){
        assertEquals("John", manager.getName());
    }

    @Test
    public void canGetDeptName(){
        assertEquals("IT", manager.getDeptName());
    }
}
