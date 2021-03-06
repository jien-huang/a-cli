/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import com.automationtest.cli.App;

public class AppTest {
    private final ByteArrayOutputStream consoleText = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream console = System.out;
    private final PrintStream originalErr = System.err;

    private App app;

   @Before
   public void setUp() {
      System.setOut(new PrintStream(consoleText));
      app = new App();
   }

    // @After
    // public void restoreStreams() {
    //     System.setOut(originalOut);
    //     System.setErr(originalErr);
    // }

    // @Test
    // public void testAppHasAGreeting() {
    //     App.handle(new String[0]);
    //     ;
    // }
}
