package com.github.YBychkovskyi.FirstProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tasks19_25Test {
  @Test
  void sumAdjacentCells() {
    assertFalse(Tasks19_25.sumAdjacentCells(new int[]{25, 26, 6546, 23234, 52}, 52));
    assertTrue(Tasks19_25.sumAdjacentCells(new int[]{546, 23234, 52, 25, 26, 78878}, 51));
    assertTrue(Tasks19_25.sumAdjacentCells(new int[]{546, 23234, 52, 25, 26}, 51));
  }
}