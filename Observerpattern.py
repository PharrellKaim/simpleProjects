from __future__ import annotations
from abc import ABC, abstractmethod
from random import randrange
from typing import List

class Subject(ABC):

    @abstractmethod
    def detach(self, observer: Observer) -> None:
        pass

    @abstractmethod
    def attach(self, observer: Observer) -> None:
        pass

    def notify(self) -> None:
        pass



class ConcreteSubjects(Subject):

    _state: int = None

    _observers: List[Observer] = []


    def detach(self, observer: Observer) -> None:
        self._observers.remove(observer)
        print("Observer removed")

    def attach(self, observer: Observer) -> None:
        self._observers.append(observer)
        print("Observer added")


    def notify(self) -> None:
        for observer in self._observers:
            observer.update(self)

    def testing(self) -> None:

        self._state = randrange(0,10)

        self.notify()

class Observer(ABC):

    def update(self, subject: Subject) -> None:
        pass


class Observer1(Observer):
    def update(self, subject: Subject) -> None:
        if subject._state < 3:
            print("Observer1 reacted")

class Observer2(Observer):
    def update(self, subject: Subject):
        if subject._state == 0:
            print("Observer2 reacted")
class Observer3(Observer):
    def update(self, subject: Subject):
        if subject._state > 3:
            print("Observer3 reacted")


if __name__ == "__main__":
    subject = ConcreteSubjects()

    observer1 = Observer1()
    subject.attach(observer1)

    observer2 = Observer2()
    subject.attach(observer2)

    observer3 = Observer3()
    subject.attach(observer3)

    for i in range(10):
        subject.testing()

    subject.detach(observer3)
