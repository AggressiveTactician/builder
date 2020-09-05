package Builder;

import java.util.ArrayList;
import java.util.List;

public class Builder {
    private String name;
    private String type;
    private List<String> items;

    public Builder() {
        this.items = new ArrayList<>();
    }

    public static Builder builder() {
        return new Builder();
    }

    public Builder withName(String name) {
        this.name = name;
        return this;
    }

    public Builder withType(String type) {
        this.type = type;
        return this;
    }

    public Builder addItem(String item) {
        this.items.add(item);
        return this;
    }

    public Soldier build() {
        return new Soldier(name, type, items);
    }

}
