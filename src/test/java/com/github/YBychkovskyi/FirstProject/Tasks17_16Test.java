package com.github.YBychkovskyi.FirstProject;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Tasks17_16Test {
  @Test
  void name() {
    int[] x= Tasks17_16.leftDigit(475);
    System.out.println(Arrays.toString(x));
  }
}