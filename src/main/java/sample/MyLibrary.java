package sample;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MyLibrary {
  private final Properties prop;

  public MyLibrary() throws IOException {
    prop = new Properties();
    try(InputStream inStream = MyLibrary.class.getClassLoader().getResourceAsStream("my-library.properties")){
      prop.load(inStream);
    }
  }

  public String sayHello(){
    return prop.getProperty("hello");
  }
}
