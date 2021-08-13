package com.github.YBychkovskyi.FirstProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tasks19_43Test {

  @Test
  void noRepetitionsValues() {
    final var result = Tasks19_43.noRepetitionsValues(new int[]{1, 3, 5, 7}, new int[]{2, 5, 7, 9, 11});

    assertArrayEquals(new int[]{1, 2, 3, 5, 7, 9, 11}, result);
  }

  @Test
  void removeElement() {
  }

  @Test
  void itemSearch(){
    assertTrue(Tasks19_43.itemSearch(new int[]{1, 2, 3, 9, 5}, 3));
    assertFalse(Tasks19_43.itemSearch(new int[]{1, 2, 3, 9, 5}, 7));
  }
}