package it.euris.ires.junittesting;

public class Car {

  private String brand;
  private String model;
  private int fuelTankSize;
  private double fuelTankLevel;
  private double kilometersPerLiter;
  private double kilometersDriven = 0;

  public Car(String brand, String model, int fuelTankSize, double kilometersPerLiter) {
    this.brand = brand;
    this.model = model;
    this.fuelTankSize = fuelTankSize;
    // Gas tank level defaults to a full tank
    this.fuelTankLevel = fuelTankSize;
    this.kilometersPerLiter = kilometersPerLiter;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getFuelTankSize() {
    return fuelTankSize;
  }

  public void setFuelTankSize(int fuelTankSize) {
    this.fuelTankSize = fuelTankSize;
  }

  public double getFuelTankLevel() {
    return fuelTankLevel;
  }

  public void setFuelTankLevel(double fuelTankLevel) {
    this.fuelTankLevel = fuelTankLevel;
  }

  public double getKilometersPerLiter() {
    return kilometersPerLiter;
  }

  public void setKilometersPerLiter(double kilometersPerLiter) {
    this.kilometersPerLiter = kilometersPerLiter;
  }

  public double getKilometersDriven() {
    return kilometersDriven;
  }

  /**
   * Drive the car an amount of kilometers. If not enough fuel, drive as far as fuel allows. Adjust
   * fuel levels based on amount needed to drive the distance requested. Add kms to driven
   * kilometers.
   *
   * @param miles - the kilometers to drive
   */
  public void drive(double miles) {
    // adjust fuel based on kpl and km requested to drive
    double maxDistance = this.kilometersPerLiter * this.fuelTankLevel;
    double kilometersAbleToTravel = miles > maxDistance ? maxDistance : miles;
    double litersUsed = kilometersAbleToTravel / this.kilometersPerLiter;
    this.fuelTankLevel = this.fuelTankLevel - litersUsed;
    this.kilometersDriven += kilometersAbleToTravel;
  }

  public void addFuel(double liters) {
    if (this.fuelTankLevel + liters > this.fuelTankSize) {
      throw new IllegalArgumentException("Cannot add that much fuel!");
    } else {
      this.fuelTankLevel += liters;
    }
  }
}
