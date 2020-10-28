package project.behavioral.visitor;

public class Porsche  implements VolkswagenGroup{
    private String carModel;

    public Porsche(String carModel) {
        this.carModel = carModel;
    }

    public Porsche() {
        this.carModel = "Porsche Macan";
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
