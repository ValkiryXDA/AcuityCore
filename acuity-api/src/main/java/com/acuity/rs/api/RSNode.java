package com.acuity.rs.api;

import com.acuity.api.rs.wrappers.peers.structures.Node;

//Generated by the injector on run.

//Extends: java/lang/Object
public interface RSNode {

    long getKey();

    RSNode getNext();

    RSNode getPrevious();

    Node getWrapper();

    boolean invokeLinked();

    void invokeUnlink();
}
