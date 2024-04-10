package abstractfactory;

public class SemContratosFactory extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Brasilia(100, "alcool", "magico");
        } else {
            return new VolksCar(100, "gas", "preto");
        }
    }
    
}
