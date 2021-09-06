package com.github.YBychkovskyi.FirstProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tasks19_66Test {

  @Test
  void relativesByValue(){
    assertTrue(Tasks19_66.relativesByValue(new int[]{4, 3, 6, 2, 1, 3, 1}));
    assertFalse(Tasks19_66.relativesByValue(new int[]{4, 3, 6, 2, 1, 6, 1}));
  }

}