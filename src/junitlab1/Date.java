/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitlab1;

import static java.lang.Math.abs;

/**
 *
 * @author tuc54014
 */
public class Date {
    int year;
    int month;
    int day;
    
    public Date(){
        year = 2016;
        month = 9;
        day = 25;
    }
    //constructor
    public Date(int y, int m, int d){
        this.year = y;
        this.month = m;
        this.day = d;
        
    }

    public int daysTo(Date d){
        int ret = 0;
        int yearBetween = 0;
        int monthBetween = 0;
        int dayBetween = 0;
        
        yearBetween = abs(this.year - d.year);
        monthBetween = abs(this.month - d.month);
        dayBetween = abs(this.day - d.day);
        
        ret += dayBetween;
        ret += yearBetween * 360;
        ret += monthBetween * 30;
        
        return ret;
    }
    
}

