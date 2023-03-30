package org.example;

public class TooFewSidesException extends RuntimeException {

  private int numberOfSides;
  private String message;
  public TooFewSidesException(String message, int numberOfSides) {
    this.message = message;
    this.numberOfSides = numberOfSides;
  }
}
