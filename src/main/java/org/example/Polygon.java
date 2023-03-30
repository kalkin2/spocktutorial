package org.example;

public class Polygon {

  private final int numberOfSides;

  Renderer renderer;

  public Polygon(int numberOfSides) {
    if(numberOfSides <= 2){
      throw new TooFewSidesException("면의 갯수는 3개 이상어야 한다. ", numberOfSides);
    }
    this.numberOfSides = numberOfSides;
    renderer = null;
  }

  public Polygon(Integer numberOfSides, Renderer renderer) {
   this.numberOfSides = numberOfSides;
   this.renderer = renderer;
  }

  public int getNumberOfSides() {
    return numberOfSides;
  }

  public void draw() {
    for(int i = 0; i < numberOfSides; i++) {
      renderer.drawLine();
    }
  }
}
