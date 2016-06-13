import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Log
public class TestLogger {
    static Logger logger = LoggerFactory.getLogger(TestLogger.class);
    public static void main(String[] args) {
        //TODO аннотация лог не работает(
//todo как записывать разные уровни в разные файлы?
        logger.debug("Hello world.");
        logger.info("info logger");
        logger.trace("trace logger");

        /*LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        // print logback's internal status
        StatusPrinter.print(lc);*/
    }

}
