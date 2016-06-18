package javacode;

import lombok.Data;


@Data
//@Log
public class TestLogger {
    //static Logger logger = LoggerFactory.getLogger(TestLogger.class);
    private int field;
    public String fieldStr;

    public static void main(String[] args) {
        //TODO аннотация лог не работает(
//todo как записывать разные уровни в разные файлы?
        /*logger.debug("Hello world.");
        logger.info("info logger");
        logger.trace("trace logger");*/

        /*LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        // print logback's internal status
        StatusPrinter.print(lc);*/
        TestLogger testLogger = new TestLogger();

    }

}
