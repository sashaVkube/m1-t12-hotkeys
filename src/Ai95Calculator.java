public class Ai95Calculator {
    double cena = 46.35;
    double tax = 0.14;
    double ai95FullPrice = cena * (1 + tax);

    public double calculate(double razmer) {
        return razmer * ai95FullPrice;
    }
}
