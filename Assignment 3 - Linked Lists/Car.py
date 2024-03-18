class Car:
    def __init__(self, makeAndModel = "None assigned", numberOfDoors = 4, maximumNumberOfPassengers = 5):
        self.makeAndModel = makeAndModel
        self.numberOfDoors = numberOfDoors
        self.maximumNumberOfPassengers = maximumNumberOfPassengers

    def setMakeAndModel(self, mam):
        self.makeAndModel = mam

    def getMakeAndModel(self):
        return self.makeAndModel
    
    def getMaximumNumberOfPassengers(self):
        return self.maximumNumberOfPassengers
    
    def __str__(self) -> str:
        return  f"Make and Model:{self.makeAndModel}\nNumber of doors: {self.numberOfDoors}\nMaximum number of passengers: {self.maximumNumberOfPassengers}" 

if __name__ == "__main__":
    car1 = Car()
    car1.setMakeAndModel("Dodge Dart")
    print(car1.getMakeAndModel())
    print(car1.getMaximumNumberOfPassengers)
    print(car1)