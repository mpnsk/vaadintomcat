package exmaple;

import java.io.Serializable;

public class SimpleGreetingImpl implements Greeting, Serializable {

  @Override
  public String getText() {
    return "Hello, World!";
  }
}