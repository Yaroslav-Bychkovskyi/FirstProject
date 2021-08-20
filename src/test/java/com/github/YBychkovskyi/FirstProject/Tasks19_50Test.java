package com.github.YBychkovskyi.FirstProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tasks19_50Test {

  @Test
  void sameNumbers() {
    int res = Tasks19_50.sameNumbers(new int[]{4, 6, 7, 2, 5, 3}, new int[]{5, 6, 2, 2, 4, 3});
    assertEquals(3, res);
  }

  @Test
  void sameNumbers1() {
    int res = Tasks19_50.sameNumbers(new int[]{4, 8, 7, 4, 5, 1}, new int[]{5, 6, 2, 2, 4, 3});
    assertEquals(0, res);
  }
}