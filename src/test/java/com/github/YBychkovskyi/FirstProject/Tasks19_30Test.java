package com.github.YBychkovskyi.FirstProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tasks19_30Test {

  @Test
  void orderedAscending() {
   assertFalse(Tasks19_30.orderedAscending(new int[]{25, 26, 6546, 23234, 52}));
    assertTrue(Tasks19_30.orderedAscending(new int[]{-1, 1, 1, 2, 3, 4, 5, 6}));
  }
}