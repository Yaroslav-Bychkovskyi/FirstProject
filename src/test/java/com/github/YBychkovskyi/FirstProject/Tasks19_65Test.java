package com.github.YBychkovskyi.FirstProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tasks19_65Test {

  @Test
  void balancePoint() {
    assertTrue(Tasks19_65.balancePoint(new int[]{3, 5, 7, 2, -3, 5, 8, -4}));
    assertTrue(Tasks19_65.balancePoint(new int[]{2, 2, 0, 1, 1, 1, 1}));
    assertFalse(Tasks19_65.balancePoint(new int[]{2, 3, 0, 1, 1, 1, 1}));

  }
}