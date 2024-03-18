from Car import Car
class GasolineCar(Car):
    def __init__(self, makeAndModel = "none assigned", numberOfDoors = 4, maximumNumberOfPassengers = 5, gasTankSize = -1):
        super().__init__(makeAndModel, numberOfDoors, maximumNumberOfPassengers)
        self.gasTankSize = gasTankSize

    def getGasTankSize(self):
        return self.gasTankSize
    
    def setGasTankSize(self, gasTankSize):
        self.gasTankSize = gasTankSize

    def __str__(self) -> str:
        return f"{super().__str__()} \nGas Tank Size: {str(self.gasTankSize)} \nGASOLINE CAR"
if __name__ == "__main__":
    gasolineCar1 = GasolineCar()
    gasolineCar1.setGasTankSize(5)
    print(gasolineCar1.getGasTankSize())
    print(gasolineCar1)