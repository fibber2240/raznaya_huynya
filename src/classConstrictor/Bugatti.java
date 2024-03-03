package classConstrictor;

public class Bugatti {
    private int salary = 1000;

    public Bugatti(){

    }

    public int getSalary(){
        return salary;
    }

    public void setSalary (int salary){
        if (salary > this.salary){
            this.salary = salary;
        }
    }

}

