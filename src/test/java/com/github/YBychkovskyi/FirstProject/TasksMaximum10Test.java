package com.github.YBychkovskyi.FirstProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TasksMaximum10Test {

  @Test
  void getCount() {

    final var result = TasksMaximum10.getCount(new int[]{1, 4, 2, 5, 2, 9,9,9, 5, 3});
    assertEquals(3, result);
  }
}