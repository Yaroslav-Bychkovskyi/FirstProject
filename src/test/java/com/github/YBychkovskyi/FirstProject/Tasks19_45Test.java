package com.github.YBychkovskyi.FirstProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tasks19_45Test {

  @Test
  void shiftRight() {
    final var result = Tasks19_45.shiftRight(new int[]{1, 3, 5, 7});
    assertArrayEquals(new int[]{7, 1, 3, 5}, result);
  }
}