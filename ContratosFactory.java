package abstractfactory;

public class ContratosFactory extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new CorollaCar(100, "", "azul");
        } else {
            return new VolksCar(100, "gas", "preto");
        }
    }
    
}
