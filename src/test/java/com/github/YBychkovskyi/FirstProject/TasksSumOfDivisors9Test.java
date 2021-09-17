package com.github.YBychkovskyi.FirstProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TasksSumOfDivisors9Test {

  @Test
  void getNumeric() {
    int a = TasksSumOfDivisors9.getNumeric(5);
    assertEquals(4, a);

     a = TasksSumOfDivisors9.getNumeric(10);
    assertEquals(6, a);
  }
}