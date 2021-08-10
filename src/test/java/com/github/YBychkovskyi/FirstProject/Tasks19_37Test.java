package com.github.YBychkovskyi.FirstProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tasks19_37Test {

  @Test
  void serialNumber() {
   assertEquals(2, Tasks19_37.serialNumber(new int[]{25, 26, 100, 99, 52}));
    assertEquals(2, Tasks19_37.serialNumber(new int[]{25, 26, 100, 100, 52}));
  }

}