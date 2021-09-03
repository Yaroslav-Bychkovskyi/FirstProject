package com.github.YBychkovskyi.FirstProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tasks19_62Test {

  @Test
  void parallelPairs() {

    int[] res = Tasks19_62.parallelPairs(new int[]{4, 6, 7, 2, 5, 3}, new int[]{5, 6, 2, 2, 4, 3});
    assertArrayEquals(new int[]{6, 2, 3}, res);
  }
}