import Builder.Builder;
import Builder.Soldier;

public class Main {

    public static void main(String[] args) {
        Soldier soldier2 = Builder.builder()
                .withName("Janek")
                .withType("piechota")
                .addItem("karabin")
                .addItem("bagnet")
                .build();
    }
}
