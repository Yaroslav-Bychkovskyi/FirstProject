package com.github.YBychkovskyi.FirstProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tasks19_51Test {

  @Test
  void parallelCellsQueues() {

    int[] res = Tasks19_51.parallelCellsQueues(new int[]{1, 2, 3, 4}, new int[]{6, 7, 8, 9});
    assertArrayEquals(new int[]{1, 6, 2, 7, 3, 8, 4, 9}, res);

  }
}