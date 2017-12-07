import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;


    @Before
    public void before(){
        employee = new Employee("Maria", "ERT267", 18000.50);
    }

    @Test
    public void canGetName(){
        assertEquals("Maria",employee.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals("ERT267", employee.getNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(18000.50, employee.getSalary(), 0.1);
        assertEquals(18000.60, employee.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        employee.raiseSalary(500.55);
        assertEquals(18501.05, employee.getSalary(), 0.1);
    }
    @Test
    public void canPayBonus(){
        assertEquals(180.01, employee.payBonus(), 0.1);
    }

    @Test
    public void canChangeName(){
        employee.setName("Tom");
        assertEquals("Tom", employee.getName());
    }

    @Test
    public void cannotChangeNameIfNull(){
        employee.setName(null);
        assertEquals("Maria", employee.getName());
    }

    @Test
    public void cannotChangeNameIfEmpty(){
        employee.setName(" ");
        assertEquals("Maria", employee.getName());
    }

}
