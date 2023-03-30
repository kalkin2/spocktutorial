package org.example;

public class Polygon {

  private final int numberOfSides;

  public Polygon(int numberOfSides) {
    if(numberOfSides <= 2){
      throw new TooFewSidesException("면의 갯수는 3개 이상어야 한다. ", numberOfSides);
    }
    this.numberOfSides = numberOfSides;
  }

  public int getNumberOfSides() {
    return numberOfSides;
  }
}
