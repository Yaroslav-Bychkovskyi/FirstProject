
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tasks19_26Test {

  @Test
  void numbersProduct() {
    assertFalse(Tasks19_26.numbersProduct(new int[]{25, 26, 6546, 23234, 52}, 52));
    assertTrue(Tasks19_26.numbersProduct(new int[]{546, 23234, 52, 25, 26, 78878}, 1352));
    assertTrue(Tasks19_26.numbersProduct(new int[]{546, 23234, 52, 25, 26}, 650));
  }
}