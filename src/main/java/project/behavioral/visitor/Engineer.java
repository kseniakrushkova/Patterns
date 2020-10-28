package project.behavioral.visitor;

public class Engineer  implements  Worker{
    @Override
    public String create(Audi audi) {
        return "I create new car for Audi " ;
    }

    @Override
    public String create(Volkswagen volkswagen) {
        return "I create new car for Volkswagen " ;
    }

    @Override
    public String create(Porsche porsche) {
        return "I create new car for Porsche ";
    }
}
