package org.example;

//alt + insert
public class App {

    public static void main(String[] args) {

        Worker[] workersArray = new Worker[5];
        workersArray[0] = new Worker("Ivanov Ivan", "Engineer", "Ivanov@mail.ru", "82347556745", 50000, 25);
        workersArray[1] = new Worker("Petrov Ivan", "Manager", "Petrov@mail.ru", "82347726745", 70000, 40);
        workersArray[2] = new Worker("Petrenko Ivan", "Driver", "Petrenko@mail.ru", "82347916745", 40000, 43);
        workersArray[3] = new Worker("Nikolaev Ivan", "Logistics", "Nikolaev@mail.ru", "82342556745", 80000, 20);
        workersArray[4] = new Worker("Savchenko Ivan", "Seller", "Savchenko@mail.ru", "82347796745", 35000, 70);
        for (int i = 0; i < workersArray.length; i++)
          if (workersArray[i].getAge() > 40){
              workersArray[i].info();
          }
        }
    }
