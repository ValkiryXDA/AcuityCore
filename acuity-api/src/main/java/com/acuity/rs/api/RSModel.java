package com.acuity.rs.api;

import com.acuity.api.rs.wrappers.rendering.Model;

//Generated

public interface RSModel extends RSRenderable {

    int[] getVerticesX();

    int[] getVerticesY();

    int[] getVerticesZ();

    Model getWrapper();

    int[] getXTriangles();

    int[] getYTriangles();

    int[] getZTriangles();
}
