package com.github.YBychkovskyi.FirstProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tasks19_21Test {

  @Test
  void audit() {

    assertFalse(Tasks19_21.audit(new int[]{2, 3, 4}, 5));
    assertTrue(Tasks19_21.audit(new int[]{2, 3, 4}, 3));
  }
}