from Node import Node
from Car import Car
from ElectricCar import ElectricCar
from GasolineCar import GasolineCar
class LinkedList:
    def __init__(self):
        self.head = None
        self.tail = None
        self.size = 0
    def add(self, e):
        n = Node(e)
        if self.size == 0:
            self.head = n
            self.tail = n
        else:
            c = self.tail
            c.setNext(n)
            n.setPrevious(c)
            self.tail = n
        self.size += 1

    def delete(self, i):
        if (self.size != 0):    
            if i >= self.size or i < 0:
                return "Not possible with current parameters"
            if self.size == 1:
                self.head = None
                self.tail = None
                self.size -= 1
            elif i == 0:
                self.head = self.head.getNext()
                self.head.setPrevious(None)
                self.size -= 1
            elif i == self.size - 1:
                c = self.tail.getPrevious()
                self.tail = c
                c.setNext(None)
                self.size -= 1
            elif (i + 1 < self.size):
                c = self.head
                for a in range(i): # go to node before deletion
                    c = c.getNext()
                temp = c 
                temp.getNext().setPrevious(c.getPrevious())
                temp.getPrevious().setNext(c.getNext())
                c.setNext(None)
                c.setPrevious(None)
                self.size -= 1
        
    def insert(self, i, node):
        n = Node(node)
        c = self.head      
        if i > self.size:
            return
        if i == 0:
            c.setPrevious(n)
            n.setNext(c)
            self.head = n
        elif i == self.size:
            c = self.tail
            c.setNext(n)
            n.setPrevious(c)
            n.setNext(None)
            self.tail = n     
        else:
            c = self.head
            for a in range(i - 1):
                c = c.getNext()
            n.setPrevious(c)
            n.setNext(c.getNext())
            c.getNext().setPrevious(n)
            c.setNext(n)
        self.size += 1
    def length(self):
        return self.size
    def __getitem__(self, i):
        curr = self.head
        for a in range(i):
            curr = curr.getNext()
        return curr.getName()     
    def __str__(self):
        retstring = ""
        c = self.head
        while c is not None:
            retstring += str(c) + "\n"
            c = c.getNext()
        return retstring

if __name__ == "__main__":
    linklis = LinkedList()
    linklis.add(4)
    linklis.add(7)
    linklis.add(14)
    linklis.add(3)
    linklis.add(143)
    linklis.add(53)
    print(linklis)
    linklis.insert(0, 73) #insert at the beggining
    print(linklis)
    linklis.insert(linklis.length(), 1042) #insert at the end
    print(linklis)
    linklis.insert(4, 23) #insert in the middle
    print(linklis)
    linklis.delete(0) #delete at the beggining
    print(linklis)
    linklis.delete(linklis.length() - 1) #delete at the end
    print(linklis)
    linklis.delete(1) #delete in the middle
    print(linklis)
    