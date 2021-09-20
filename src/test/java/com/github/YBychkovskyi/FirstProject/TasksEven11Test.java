package com.github.YBychkovskyi.FirstProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TasksEven11Test {

  @Test
  void getCount() {
    final var result = TasksEven11.getCount(new int[]{1, 2, 4, 5, 6});
    assertEquals(2, result);
  }
}