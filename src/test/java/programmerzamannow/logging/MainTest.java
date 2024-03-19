package programmerzamannow.logging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainTest {

    private static final Logger log = LoggerFactory.getLogger(MainTest.class);

    @Test
    void testInfo() {
        log.info("Hello Logger");
        log.info("Selamat Belajar Java Logging");

        //21:38:05.284 [main] INFO programmerzamannow.logging.MainTest -- Hello Logger
        //<time> <thread> <type> <class> -- <message>
    }
}
