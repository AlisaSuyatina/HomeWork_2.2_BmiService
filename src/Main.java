public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float mass = 75F; //масса тела в килограммах
        float height = 1.80F;  //рост в метрах
        float index = service.calculate(mass, height);

        System.out.println("Индекс массы тела:");
        System.out.println(index);
    }
}
