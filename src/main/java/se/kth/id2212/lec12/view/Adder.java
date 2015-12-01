package se.kth.id2212.lec12.view;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import se.kth.id2212.lec12.model.AdderBean;

@Named(value = "adder")
@SessionScoped
public class Adder implements Serializable {

    private static final long serialVersionUID = -3552965833778221283L;
    @EJB
    private AdderBean adderBean;

    public int getTotal() {
        return adderBean.getTotal();
    }

    public void setOperand(Integer operand) {
        adderBean.add(operand);
    }

    public Integer getOperand() {
        return null;
    }
}
