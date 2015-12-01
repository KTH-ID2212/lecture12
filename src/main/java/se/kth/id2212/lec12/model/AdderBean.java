package se.kth.id2212.lec12.model;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;

@Stateful
public class AdderBean {
    private int total;

    public void add(int operand) {
        total = total + operand;
    }
    
    public int getTotal() {
        return total;
    }

}
