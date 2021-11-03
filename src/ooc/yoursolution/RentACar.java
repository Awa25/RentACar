/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.util.List;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author awa
 */
public class RentACar implements RentACarInterface {
    
    private List<Car> cars;
    private String name;
    
    // Constructor
    public RentACar(List<Car>cars, String name){
        
        this.cars = cars;
        this.name = name;
    } 
    
    // Get List of cars
    @Override
    public List getCars() {
        
        return cars;
    }
    
    // Set all the cars with a list
    @Override
    public void setCars(List cars) {
        
        this.cars = cars;
    }
    
    // Get the name of the Rent-a-car
    @Override
    public String getName() {

        return name;
    }

    // Set the name of the rent-a-car
    @Override
    public void setName(String name) {

        this.name = name;
    }

    // Check through all cars and see if it is continuous availability of any specific car
    @Override
    public boolean checkAvailability(Month month, int day, Make make, int lengthOfRent) {

        int currentDay, flag;
        
        for(Car car: cars){
            
            if(car.getMake().equals(make)){            
                flag = 0;
                currentDay = day;
                
                for(int i = 0; i < lengthOfRent; i++){
                    if(!car.isAvailable(month, currentDay++)){
                        flag = 1;
                        break;
                    }
                }
                
                if(flag == 0){
                    return true;
                }
            }
        }
        return false;
    }

    // Get the id of a car that fits that availability
    @Override
    public int getCarAvailable(Month month, int day, Make make, int lengthOfRent) {

        int currentDay, flag;
        
        for(Car car:cars){
            if(car.getMake().equals(make)){
                flag = 0;
                currentDay = day;
                
                for(int i = 0; i <lengthOfRent; i++){
                    if(!car.isAvailable(month, currentDay)){
                        flag = 1;
                        break;
                    }
                }
                
                if(flag == 0){
                    return car.getId();
                }
            }
        }
        return -1;
    }

    // Book a car
    @Override
    public boolean bookCar(Month month, int day, Make make, int lengthOfRent) {
        
        if(!checkAvailability(month,day,make,lengthOfRent)){
            return false;
        }

        int carId = getCarAvailable(month, day, make, lengthOfRent);
        
        for(Car car : cars){
          if(car.getId() == carId && car.getMake() == make){
            int currentDay = day;
            for(int i=0; i<lengthOfRent; i++){
              car.book(month, currentDay++);
            }
          }
            
        }
        
        return true;
    }

    
    @Override
    public int getNumberOfCars() {

        return cars.size();
    }
    
}
