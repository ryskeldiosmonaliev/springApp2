package osmonaliev;

import org.springframework.stereotype.Component;

/**
 * @author Neil Alishev
 */
@Component
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
