package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Chest {
    private final Rabbit4 rabbit;

    @Autowired
    public Chest(Rabbit4 rabbit) {
        this.rabbit = rabbit;
    }

    @Override
    public String toString() {
        return "в сундуке — заяц, " + rabbit.toString();
    }
}
