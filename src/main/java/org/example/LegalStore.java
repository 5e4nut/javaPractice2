package org.example;

public class LegalStore extends Store {
    private int taxRate;
    private int workersAmount;
    private int salary;
    private int totalIncome;
    public LegalStore(String name, String location, int goodsAmount, String goodsType, int taxRate) {
        super(name, location, goodsAmount, goodsType);
        this.taxRate = taxRate;
    }


    public int getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(int taxRate) {
        if(taxRate > 0 && taxRate < 40) {
            this.taxRate = taxRate;
        }else{
            System.out.println("It can't be like this!!");
        }
    }

    public int getWorkersAmount() {
        return workersAmount;
    }

    public void setWorkersAmount(int workersAmount) {
        if(workersAmount > 0) {
            this.workersAmount = workersAmount;
        }else{
            System.out.println("You can't do it all by yourself, get more workers!!");
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if(salary > 160) {
            this.salary = salary;
        }else{
            System.out.println("You can't pay them like this, it's too low!!");
        }
    }

    public int getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(int totalIncome) {
        this.totalIncome = totalIncome;
    }

    public int howMuchTaxes() {
        return totalIncome / 100 * taxRate;
    }

    public int howMuchSalary(){
        return workersAmount * salary;
    }

    public int howMuchGain(){
        return totalIncome - this.howMuchSalary() - this.howMuchTaxes();
    }

    public void getAll(){
        System.out.println("Store name: " + getName());
        System.out.println("Store location: " + getLocation());
        System.out.println("Store goods amount: " + getGoodsAmount());
        System.out.println("Store goods type: " + getGoodsType());
        System.out.println("Store tax rate: " + getTaxRate() + "%");
        System.out.println("Store workers amount: " + getWorkersAmount());
        System.out.println("Store workers salary: " + getSalary());
        System.out.println("Store total income: " + getTotalIncome());
    }
}
