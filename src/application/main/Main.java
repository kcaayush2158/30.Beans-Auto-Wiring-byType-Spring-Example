package application.main;

import application.model.Employee;
import application.model.Pancard;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Employee employee =  context.getBean("employee",Employee.class);
        Pancard pancard = employee.getPancard();
       System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName()+"\t"+employee.getEmployeeAddress());
       System.out.println(pancard.getPancardHolderName()+"\t"+pancard.getPanNo());
       context.close();

    }
}
