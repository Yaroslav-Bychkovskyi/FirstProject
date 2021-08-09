package com.github.YBychkovskyi.FirstProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tasks19_31Test {

  @Test
  void sortedDescendingOrder() {
    assertFalse(Tasks19_31.sortedDescendingOrder(new int[]{25, 26, 6546, 23234, 52}, 3));
    assertTrue(Tasks19_31.sortedDescendingOrder(new int[]{6, 5, 4, 3, 2, 1, 1, -1}, 5));
    assertTrue(Tasks19_31.sortedDescendingOrder(new int[]{6, 5, 4, 3, 2, 1, 1, -1, 7, 8,9}, 5));
  }
}