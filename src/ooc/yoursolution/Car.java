/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.util.HashMap;
import java.util.Map;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author rueilijhang
 */
public class Car implements CarInterface {
    
    private int id;
    private double rate;
    private Make make;
    private Map<Month, Boolean[]> map;
    
    public Car(int id, Make make, double rate){
      this.id=id;
      this.make = make;
      this.rate = rate;
      craeteAvailability();
    }
    
    @Override
    public Map createAvailability() {
      map = new HashMap<>();
      
      map.put(Month.JANUARY, new Boolean[31]);
      map.put(Month.FEBRUARY, new Boolean[28]);
      map.put(Month.MARCH, new Boolean[31]);
      map.put(Month.APRIL, new Boolean[30]);
      map.put(Month.MAY, new Boolean[31]);
      map.put(Month.JUNE, new Boolean[30]);
      map.put(Month.JULY, new Boolean[31]);
      map.put(Month.AUGUST, new Boolean[31]);
      map.put(Month.SEPTEMBER, new Boolean[30]);
      map.put(Month.OCTOBER, new Boolean[31]);
      map.put(Month.NOVEMBER, new Boolean[30]);
      map.put(Month.DECEMBER, new Boolean[31]);
      
      return map;
    }

    @Override
    public Make getMake() {
        return make;
    }

    @Override
    public void setMake(Make make) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getRate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRate(double rate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Map<Month, boolean[]> getAvailability() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAvailability(Map<Month, boolean[]> availability) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isAvailable(Month month, int day) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean book(Month month, int day) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void craeteAvailability() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
