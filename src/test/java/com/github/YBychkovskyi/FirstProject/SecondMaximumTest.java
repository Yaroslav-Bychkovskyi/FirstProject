package com.github.YBychkovskyi.FirstProject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SecondMaximumTest {

  @Test
  void secondMaximum() {
    assertEquals(99, SecondMaximum.secondMaximum(new int[]{25, 26, 100, 99, 52}));
  }
}