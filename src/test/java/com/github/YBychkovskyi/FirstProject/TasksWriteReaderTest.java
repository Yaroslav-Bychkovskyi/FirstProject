package com.github.YBychkovskyi.FirstProject;

import static org.junit.jupiter.api.Assertions.*;


import java.io.IOException;

import org.junit.jupiter.api.Test;

class TasksWriteReaderTest {

  @Test
  void reader() throws IOException {

    final var content = TasksWriteReader.reader("input.txt");

    assertEquals("kjhk\n" +
      "vjhkghjkg\n" +
      "\n" +
      "ghjk\n" +
      "hjk\n" +
      "46546\n", content);
  }
}