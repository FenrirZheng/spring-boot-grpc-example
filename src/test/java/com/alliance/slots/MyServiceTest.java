package com.alliance.slots;

import com.alliance.slots.adaptor.proto.HelloReply;
import com.alliance.slots.adaptor.proto.HelloRequest;
import com.alliance.slots.adaptor.proto.SimpleGrpc;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.annotation.DirtiesContext;

@SpringBootTest
@Import(SimpleBlockingStubTestConfig.class) // 將 MyTestConfig 引入到這個測試的應用程式上下文
public class MyServiceTest {

    @Autowired
    SimpleGrpc.SimpleBlockingStub myService;

    private static final Logger log = LoggerFactory.getLogger(MyServiceTest.class);

    //
    @Test
    @DirtiesContext
    public void testSayHello() {
        HelloRequest request = HelloRequest.newBuilder()
                .setName("test!?? 太神了")
                .build();

        HelloReply response = myService.sayHello(request);
        log.info("response: {}", response.getMessage());
    }
}
