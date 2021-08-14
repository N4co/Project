package Entities;

public class Funcionario {

	public String name;
	public double grossSalary;
	public double taxa;
	
	public double netSalary(){
		return grossSalary - taxa;

	}
    public void increaseSalary(double percentagem) {
    	grossSalary += grossSalary * percentagem / 100.0;
     }
    public String toString (){
    	return name + ",$" + String.format("%.2F", netSalary());
    	
    }

}


