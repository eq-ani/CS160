class Node:
    def __init__(self, n = None):
        self.name = n
        self.next = None
        self.previous = None

    def setName(self, e):
        self.name = e

    def getName(self):
        return (self.name)
    
    def setNext(self, newNext):
        self.next = newNext

    def setPrevious(self, newPrevious):
        self.previous = newPrevious

    def getNext(self):
        return(self.next)
    
    def getPrevious(self):
        return(self.previous)
    
    def __str__(self):
        return(str(self.getName()))
    
    def __eq__(self, n):
        self.name == n.getName()

    def __ne__(self, n):
        return not self.__eq__(n)    
   
