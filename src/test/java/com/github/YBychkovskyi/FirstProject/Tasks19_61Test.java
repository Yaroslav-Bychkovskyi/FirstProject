package com.github.YBychkovskyi.FirstProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tasks19_61Test {

  @Test
  void onlyOnce() {
    final var result = Tasks19_61.onlyOnce(new int[]{1, 1, 3, 4, 2, 1, 2, 6, 7, 1});
    assertArrayEquals(new int[]{1, 3, 4, 2, 6, 7}, result);
  }
}