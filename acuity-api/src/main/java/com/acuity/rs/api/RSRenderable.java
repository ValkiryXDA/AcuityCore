package com.acuity.rs.api;

import com.acuity.api.rs.wrappers.peers.rendering.Renderable;
import com.acuity.api.rs.wrappers.peers.rendering.Model;

//Generated by the injector on run.

//Extends: RSCacheableNode
public interface RSRenderable extends RSCacheableNode {

    Model getCachedModel();

    int getHeight();

    Renderable getWrapper();

    com.acuity.rs.api.RSModel invokeGetModel();
}
