package project.behavioral.visitor;

public class Audi  implements VolkswagenGroup{
    private String carModel;

    public Audi(String carModel) {
        this.carModel = carModel;
    }
    public Audi() {
        this.carModel = "Audi Q5";
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    @Override
    public String collect(Worker worker) {
        return worker.create(this);
    }

}
