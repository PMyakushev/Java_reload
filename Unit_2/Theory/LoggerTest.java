
import java.io.IOException;
import java.util.logging.*;

public class LoggerTest {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(LoggerTest.class.getName());

        FileHandler fh = new FileHandler("LogPavel.txt");
        // ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(fh);
        // logger.addHandler(ch);

        // SimpleFormatter sFormat = new SimpleFormatter();
        XMLFormatter xml = new XMLFormatter();
        // ch.setFormatter(sFormat);
        // ch.setFormatter(xml);
        fh.setFormatter(xml);

        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");
    }
}
