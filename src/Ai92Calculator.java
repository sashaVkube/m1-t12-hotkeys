public class Ai92Calculator {
    double cena = 42.74;
    double tax = 0.13;
    double ai92FullPrice = cena * (1 + tax);

    public double calculate(double razmer) {
        return razmer * ai92FullPrice;
    }
}
