package project.behavioral.visitor;

public class Volkswagen implements VolkswagenGroup {
    private String carModel;

    public Volkswagen(String carModel) {
        this.carModel = carModel;
    }

    public Volkswagen() {
        this.carModel = "Volkswagen Polo";
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
