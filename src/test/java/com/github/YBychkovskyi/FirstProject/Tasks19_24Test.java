package com.github.YBychkovskyi.FirstProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tasks19_24Test {

  @Test
  void positiveNumbers() {
    assertAll(
      () -> assertFalse(Tasks19_24.positiveNumbers(new int[]{1, -1})),
      () -> assertFalse(Tasks19_24.positiveNumbers(new int[]{-1, 1})),
      () -> assertFalse(Tasks19_24.positiveNumbers(new int[]{-1, -1})),
      () -> assertTrue(Tasks19_24.positiveNumbers(new int[]{1, 1})),
      () -> assertTrue(Tasks19_24.positiveNumbers(new int[]{0, 1})),
      () -> assertTrue(Tasks19_24.positiveNumbers(new int[]{1, 0}))
    );
  }
}