package com.campusdual.classroom;

public class FuelTank {


  private int actualFuel = 100; // Modificado a private


  public void showDetails() {
    System.out.println("La capacidad actual es de " + getActualFuel() + " litros.");
  }

  // Getter
  public int getActualFuel() {
    return this.actualFuel; // Accede al valor actual de la propiedad
  }

  // Setter
  public void setActualFuel(int fuel) {
    if (fuel < 0) {
      System.out.println("No se puede establecer una capacidad negativa. El valor no se ha modificado.");
    } else {
      this.actualFuel = fuel;
    }
  }
}
