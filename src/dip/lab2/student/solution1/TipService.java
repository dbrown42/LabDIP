/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author Dallas
 */
public class TipService {
    private TipCalculator tipCalculator;

    public TipService(TipCalculator tipCalculator){
        this.tipCalculator = tipCalculator;
    }
    public double getTip(){
        return tipCalculator.getTip();     
    }
}
