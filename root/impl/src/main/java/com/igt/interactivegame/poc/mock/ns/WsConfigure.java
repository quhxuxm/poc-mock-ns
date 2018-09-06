package com.igt.interactivegame.poc.mock.ns;

import com.igt.interactivegame.poc.mock.ns.impl.*;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class WsConfigure {
    private final Bus bus;

    @Autowired
    public WsConfigure(Bus bus) {
        this.bus = bus;
    }

    @Bean
    public Endpoint voidEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new RgsXTv13VoidImpl());
        endpoint.publish("/RgsXTv13Void");
        return endpoint;
    }

    @Bean
    public Endpoint playEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new RgsXTv13PlayImpl());
        endpoint.publish("/RgsXTv13Play");
        return endpoint;
    }

    @Bean
    public Endpoint initEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new RgsXTv13InitImpl());
        endpoint.publish("/RgsXTv13Init");
        return endpoint;
    }

    @Bean
    public Endpoint reconEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new RgsXTv13ReconImpl());
        endpoint.publish("/RgsXTv13Recon");
        return endpoint;
    }

    @Bean
    public Endpoint heartbeatEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new RgsXTv13HeartBeatImpl());
        endpoint.publish("/RgsXTv13HeartBeat");
        return endpoint;
    }

    @Bean
    public Endpoint notifyEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new RgsXTv13NotifyImpl());
        endpoint.publish("/RgsXTv13Notify");
        return endpoint;
    }

    @Bean
    public Endpoint notifyGameInProgressEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new RgsXTv13NotifyGameInProgressImpl());
        endpoint.publish("/RgsXTv13NotifyGameInProgress");
        return endpoint;
    }
}
