package com.acuity.rs.api;


//Generated by the injector on run.

//Abstract
//Extends com/acuity/rs/api/RSCacheableNode
public interface RSRenderable extends RSCacheableNode {

	com.acuity.rs.api.RSAxisAlignedBoundingBox getBoundingBox();

	com.acuity.api.rs.wrappers.peers.rendering.Model getCachedModel();

	int getHeight();

	void setBoundingBox(com.acuity.rs.api.RSAxisAlignedBoundingBox var0);

	void setCachedModel(com.acuity.api.rs.wrappers.peers.rendering.Model var0);

	void setHeight(int var0);
}
