import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
    @Test
    void EveryStatement(){

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(new ArrayList<>()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        IllegalArgumentException ex1 = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of("#","0","0")));
        assertTrue(ex1.getMessage().contains("List length should be a perfect square"));

        assertEquals(List.of("1","1","1","#","#","#","#","3","#"), SILab2.function(List.of("0","0","0","#","#","#","#","0","#")));
    }

}
