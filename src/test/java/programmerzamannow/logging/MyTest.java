package programmerzamannow.logging;

import org.junit.jupiter.api.Test;

import java.util.UUID;

public class MyTest {


    @Test
    void testRequestId() {

        String requestId = UUID.randomUUID().toString();
        MyController controller = new MyController(new MyService(new MyRepository()));

        controller.save(requestId);
    }
}
