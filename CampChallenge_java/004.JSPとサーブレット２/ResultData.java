/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackege.sample;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author guest1Day
 */
public class ResultData implements Serializable {
    private Date d;
    private String luck;
    
    public ResultData(){}
    
    /**\
     * @return the d
     */
    public Date getD(){
        return d;
     }
    
    /**
     * @paran d the d to set
     */
    public void setD(Date d){
        this.d = d;
}

/**
 * @return d the d set
 */
    public String getluck(){
    
        return luck; 
}

    public void setluck(String luck){

        this.luck = luck;
}
    
}
