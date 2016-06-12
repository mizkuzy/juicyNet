import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Log
public class TestLogger {
    public static void main(String[] args) {
        //TODO аннотация лог не работает(
        Logger logger = LoggerFactory.getLogger(TestLogger.class);
        logger.debug("Hello world.");
    }

}
