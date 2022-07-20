package entities;

public class Individual extends TaxPayer{
    Double healthExpenditures;

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        if (anualIncome < 20000 && healthExpenditures == 0){
            return (anualIncome * 0.15);
        }
        if (anualIncome < 20000 && healthExpenditures != 0){
            return (anualIncome * 0.15) - (healthExpenditures * 0.5);
        }
        if (anualIncome >= 20000 && healthExpenditures == 0){
            return anualIncome * 0.25;
        }
        else {
            return (anualIncome * 0.25) - (healthExpenditures * 0.5);
        }
    }
}
