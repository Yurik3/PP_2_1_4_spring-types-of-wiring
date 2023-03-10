package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Wood3 {

    private final Chest chest;

    @Autowired
    public Wood3(Chest chest) {
        this.chest = chest;
    }

    @Override
    public String toString() {
        return "под дубом сундук зарыт, " + chest.toString();
    }
}
