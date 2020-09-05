package Builder;

import java.util.List;

public class Soldier {
    private String name;
    private String type;
    private List<String> items;

    protected Soldier(String name, String type, List<String> items) {
        this.name = name;
        this.type = type;
        this.items = items;

    }
}
