package com.github.YBychkovskyi.FirstProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tasks19_53Test {

  @Test
  void orderly() {
    int[] res = Tasks19_53.orderly(new int[]{1, 2, 3, 4,6, 7, 8, 9});
    assertArrayEquals(new int[]{2, 4, 6, 8, 1, 3, 7, 9}, res);
  }
}