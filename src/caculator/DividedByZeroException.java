/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caculator;

/**
 *
 * @author Đỗ Trung Đức
 */
public class DividedByZeroException  extends Exception {
    
    public DividedByZeroException() {
        super();
    }

    public DividedByZeroException(String s) {
        super(s);
    }
}
