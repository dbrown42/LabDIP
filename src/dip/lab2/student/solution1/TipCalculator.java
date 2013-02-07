/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author Dallas
 */
public interface TipCalculator {
    public abstract double getTip();
    
    public static enum ServiceQuality{ GOOD, FAIR, POOR}
}
