from Car import Car
class ElectricCar(Car):
    def __init__(self, makeAndModel = "none assigned", numberOfDoors = 4, maximumNumberOfPassengers = 5, batterySize = -1):
        super().__init__(makeAndModel, numberOfDoors, maximumNumberOfPassengers)
        self.batterySize = batterySize

    def getBatterySize(self):
        return self.batterySize
    
    def setBatterySize(self, battery):
        self.batterySize = battery

    def __str__(self) -> str:
        return f"{super().__str__()} \nBattery Size: {str(self.batterySize)} \nELECTRIC CAR"
if __name__ == "__main__":
    electricCar1 = ElectricCar()
    electricCar1.setBatterySize(10)
    print(electricCar1.getBatterySize())
    print(electricCar1)