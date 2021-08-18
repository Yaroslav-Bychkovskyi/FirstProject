package com.github.YBychkovskyi.FirstProject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tasks19_47Test {

  @Test
  void arraysIdentical() {
    final boolean result = Tasks19_47.arraysIdentical(new int[]{1, 3, 5, 7}, new int[]{1, 3, 5, 7});

    assertTrue(result);
  }

}