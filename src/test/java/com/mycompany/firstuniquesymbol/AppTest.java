package com.mycompany.firstuniquesymbol;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {

  private final PrintStream standardOut = System.out;
  private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

  @BeforeEach
  public void setUp() {
    System.setOut(new PrintStream(outputStreamCaptor));
  }

  @Test
  public void testTaskExample() {
    App myApp = new App();
    myApp.main(new String[]{"The Tao gave birth to machine language.  Machine language gave birth\n"
        + "to the assembler.\n"
        + "The assembler gave birth to the compiler.  Now there are ten thousand\n"
        + "languages.\n"
        + "Each language has its purpose, however humble.  Each language\n"
        + "expresses the Yin and Yang of software.  Each language has its place within\n"
        + "the Tao.\n"
        + "But do not program in COBOL if you can avoid it.\n"
        + "        -- Geoffrey James, \"The Tao of Programming\""});

    assertEquals("m", outputStreamCaptor.toString()
        .trim());

  }

  @Test
  public void testAskExample() {
    App myApp = new App();
    myApp.main(new String[]{
        "C makes it easy for you to shoot yourself in the foot. C++ makes that harder, but when you do, it blows away your whole leg. (с) Bjarne Stroustrup"});

  }
}
