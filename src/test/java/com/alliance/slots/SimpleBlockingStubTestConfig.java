package com.alliance.slots;

import com.alliance.slots.adaptor.proto.SimpleGrpc;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.grpc.client.GrpcChannelFactory;

@TestConfiguration
public class SimpleBlockingStubTestConfig {


    @Bean
    public SimpleGrpc.SimpleBlockingStub stub(GrpcChannelFactory channels) {
        return SimpleGrpc.newBlockingStub(channels.createChannel("127.0.0.1:9090"));
    }
}
