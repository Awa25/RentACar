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
    
    
    public RentACar(List<Car>cars, String name){
        
        this.cars = cars;
        this.name = name;
    } 
    
    
    @Override
    public List getCars() {
        
        return cars;
    }
    
    
    @Override
    public void setCars(List cars) {
        
        this.cars = cars;
    }
    
    
    @Override
    public String getName() {

        return name;
    }

    
    @Override
    public void setName(String name) {

        this.name = name;
    }

    
    @Override
    public boolean checkAvailability(Month month, int day, Make make, int lengthOfRent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getCarAvailable(Month month, int day, Make make, int lengthOfRent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean bookCar(Month month, int day, Make make, int lengthOfRent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNumberOfCars() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
