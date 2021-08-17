package com.github.YBychkovskyi.FirstProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tasks19_46Test {

  @Test
  void shifts() {
    var result = Tasks19_46.shifts(new int[]{1, 2, 3, 4, 5, 6, 7}, -3);
    assertArrayEquals(new int[]{ 4, 5, 6, 7, 1, 2, 3}, result);

    result = Tasks19_46.shifts(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, result);

  }
}