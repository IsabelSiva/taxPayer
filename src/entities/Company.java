package entities;

public class Company extends TaxPayer{
    Integer numberEmployees;

    public Company(String name, Double anualIncome, Integer numberEmployees) {
        super(name, anualIncome);
        this.numberEmployees = numberEmployees;
    }

    @Override
    public Double tax() {
        if (numberEmployees <= 10){
            return anualIncome * 0.16;
        }
        else {
            return anualIncome * 0.14;
        }
      }
}
