package sample;

import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyLibraryTest {
  
  @Test
  public void shouldSayHello() throws IOException{
    MyLibrary my = new MyLibrary();
    Assertions.assertEquals("everyone", my.sayHello());
  }
}
