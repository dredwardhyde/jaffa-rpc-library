package com.transport.lib.common;

import lombok.Getter;

/*
    Class-container for passing list of required client implemenations to TransportService bean
 */
@Getter
public class ClientEndpoints {

    // User-provided list of generated by transport-maven-plugin *Transport interfaces
    private Class[] clientEndpoints = null;

    // Vararg constructor (lombok can't generate it)
    public ClientEndpoints(Class... endpoints) { this.clientEndpoints = endpoints; }
}
