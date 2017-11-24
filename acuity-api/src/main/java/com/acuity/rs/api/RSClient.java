package com.acuity.rs.api;


//Generated by the injector on run.

//Extends com/acuity/rs/api/RSGameEngine
public interface RSClient extends RSGameEngine {

	com.acuity.rs.api.RSAudioEffect[] getAudioEffects();

	int getBaseScenceX();

	int getBaseSceneY();

	int[] getBoostedSkillLevels();

	int getBootState();

	com.acuity.rs.api.RSBoundingBoxDrawType getBoundingBoxDrawType();

	com.acuity.rs.api.RSNodeLinkedList getBoundingBoxes();

	com.acuity.rs.api.RSBoundingBoxDrawType getBOUNDINGDRAWALL();

	com.acuity.rs.api.RSBoundingBoxDrawType getBOUNDINGDRAWMOUSEOVER();

	com.acuity.rs.api.RSCameraCapture[] getCameraCaptures();

	int getCameraPitch();

	int getCameraX();

	int getCameraY();

	int getCameraYaw();

	int getCameraZ();

	int getCanvasHeight();

	int getCanvasWidth();

	java.lang.String getClanChatName();

	java.lang.String getClanChatOwner();

	byte getClanChatRank();

	int getClanMateCount();

	com.acuity.rs.api.RSClanMember[] getClanMates();

	com.acuity.rs.api.RSNodeLinkedList getClassStructures();

	int getClickX();

	int getClickY();

	com.acuity.rs.api.RSCollisionData[] getCollisionMaps();

	com.acuity.rs.api.RSConnection getConnection();

	java.lang.String getCurrentDomain();

	int getCurrentWorld();

	int getCurrentWorldMask();

	int getCursorState();

	int getDestinationX();

	int getDestinationY();

	int getDrawingAreaBottom();

	int getDrawingAreaHeight();

	int getDrawingAreaLeft();

	int[] getDrawingAreaPixels();

	int getDrawingAreaRight();

	int getDrawingAreaTop();

	int getDrawingAreaWidth();

	int getEngineCycle();

	com.acuity.rs.api.RSFont getFontp12full();

	int getFriendCount();

	int getGameState();

	com.acuity.rs.api.RSGrandExchangeOffer[] getGrandExchangeOffers();

	com.acuity.rs.api.RSNodeDeque[][][] getGroundItemDeque();

	int getHintArrowNpcIndex();

	int getHintArrowPlayerIndex();

	int getHintArrowType();

	int getHintArrowX();

	int getHintArrowY();

	int[] getHoveredUIDs();

	int getIgnoreCount();

	com.acuity.rs.api.RSHashTable getInterfaceFlags();

	int[] getInterfaceHeights();

	com.acuity.rs.api.RSHashTable getInterfaceNodes();

	int[] getInterfacePositionX();

	int[] getInterfacePositionY();

	com.acuity.rs.api.RSInterfaceComponent[][] getInterfaces();

	int[] getInterfaceWidths();

	int getItemSelectionState();

	com.acuity.rs.api.RSHashTable getItemTables();

	long getLastClickTime();

	int getLatestSelectedItemIndex();

	int getLatestSelectedItemIndexpacketIDlatestSelectedItemIndex();

	java.lang.String getLatestSelectedItemName();

	com.acuity.rs.api.RSPlayer getLocalPlayer();

	java.lang.String getLoginResponse1();

	java.lang.String getLoginResponse2();

	java.lang.String getLoginResponse3();

	int getLoginState();

	int[] getMapRegions();

	int getMapRotation();

	java.lang.String[] getMenuActions();

	int getMenuHeight();

	int[] getMenuOpcodes();

	int[] getMenuPrimaryArgs();

	int getMenuRowCount();

	int[] getMenuSecondaryArgs();

	java.lang.String[] getMenuTargets();

	int[] getMenuTertiaryArgs();

	int getMenuWidth();

	int getMenuX();

	int getMenuY();

	int getModLevel();

	int getMouseIdleTime();

	com.acuity.rs.api.RSMouseRecorder getMouseRecorder();

	int getMouseX();

	int getMouseY();

	com.acuity.rs.api.RSActionPrioritySetting getNpcActionPriority();

	int[] getNpcIndices();

	com.acuity.rs.api.RSNpc[] getNpcs();

	int getOnCursorCount();

	java.lang.String getPassword();

	int getPendingClickX();

	int getPendingClickY();

	int getPendingMouseX();

	int getPendingMouseY();

	com.acuity.rs.api.RSNodeDeque getPendingSpawns();

	int getPlane();

	com.acuity.rs.api.RSActionPrioritySetting getPlayerActionPriority();

	java.lang.String[] getPlayerActions();

	int getPlayerIndex();

	com.acuity.rs.api.RSPlayer[] getPlayers();

	com.acuity.rs.api.RSPreferences getPreferences();

	com.acuity.rs.api.RSNodeDeque getProjectilesDeque();

	int getPublicChatMode();

	int[] getRealSkillLevels();

	int getRedrawMode();

	int getRunEnergy();

	com.acuity.rs.api.RSScene getSceneGraph();

	byte[][][] getSceneRenderRules();

	int getSelectedRegionTileX();

	int getSelectedRegionTileY();

	int[] getSkillExperiences();

	int getSpellTargetFlags();

	com.acuity.rs.api.RSNodeDeque getSpotAnimationDeque();

	int[] getTempVarps();

	int[][][] getTileHeights();

	java.lang.String getUsername();

	int[] getVarps();

	int getViewportHeight();

	int getViewportScale();

	int getViewportWidth();

	int getWeight();

	com.acuity.rs.api.RSWorld[] getWorlds();

	com.acuity.api.rs.wrappers.peers.engine.Client getWrapper();

	int[][] getXteaKeys();

	void invokeAbsoluteToViewport(int var0, int var1, int var2);

	void invokeAddAxisAlignedBoundingBox(com.acuity.rs.api.RSModel var0, int var1, int var2, int var3, int var4);

	int[] invokeBoundingBoxToViewport(int var0, int var1, int var2);

	com.acuity.rs.api.RSAnimationSequence invokeGetAnimationSequence(int var0);

	com.acuity.rs.api.RSSpritePixels invokeGetItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5);

	com.acuity.rs.api.RSCacheReferenceTable invokeGetReferenceTable(int var0, boolean var1, boolean var2, boolean var3);

	com.acuity.rs.api.RSTypeProperty invokeGetTypeProperty(int var0);

	com.acuity.rs.api.RSVarpbit invokeGetVarpbit(int var0);

	void invokeInsertMenuItem(java.lang.String var0, java.lang.String var1, int var2, int var3, int var4, int var5);

	com.acuity.rs.api.RSAudioTrack invokeLoadAudioTrack(com.acuity.rs.api.RSReferenceTable var0, int var1, int var2);

	com.acuity.rs.api.RSHitsplatType invokeLoadHitsplatType(int var0);

	com.acuity.rs.api.RSItemType invokeLoadItemType(int var0);

	com.acuity.rs.api.RSNPCType invokeLoadNpcType(int var0);

	com.acuity.rs.api.RSSceneElementType invokeLoadSceneElementType(int var0);

	com.acuity.rs.api.RSSpotAnimationType invokeLoadSpotAnimationType(int var0);

	com.acuity.rs.api.RSVarpbit invokeLoadVarpbit(int var0);

	boolean invokeLoadWorlds();

	void invokeOnSceneXTEAKeyChange(boolean var0, com.acuity.rs.api.RSPacketBuffer var1);

	void invokeProcessAction(int var0, int var1, int var2, int var3, java.lang.String var4, java.lang.String var5, int var6, int var7);

	void invokeResetDrawingArea();

	void invokeSetWorld(com.acuity.rs.api.RSWorld var0);

	boolean isCameraLocked();

	boolean isDrawingAABB();

	boolean isDynamicRegion();

	boolean isLoginWorldSelectorOpen();

	boolean isLowMemory();

	boolean isMembersWorld();

	boolean isMenuOpen();

	boolean[] isPlayerOptionsPriorities();

	boolean isResizableMode();

	boolean isSpellSelected();

	boolean isUseAABBBoundingBoxes();

	boolean isViewportWalking();

	void setAudioEffects(com.acuity.rs.api.RSAudioEffect[] var0);

	void setBaseScenceX(int var0);

	void setBaseSceneY(int var0);

	void setBoostedSkillLevels(int[] var0);

	void setBootState(int var0);

	void setBoundingBoxDrawType(com.acuity.rs.api.RSBoundingBoxDrawType var0);

	void setBoundingBoxes(com.acuity.rs.api.RSNodeLinkedList var0);

	void setBOUNDINGDRAWALL(com.acuity.rs.api.RSBoundingBoxDrawType var0);

	void setBOUNDINGDRAWMOUSEOVER(com.acuity.rs.api.RSBoundingBoxDrawType var0);

	void setCameraCaptures(com.acuity.rs.api.RSCameraCapture[] var0);

	void setCameraLocked(boolean var0);

	void setCameraPitch(int var0);

	void setCameraX(int var0);

	void setCameraY(int var0);

	void setCameraYaw(int var0);

	void setCameraZ(int var0);

	void setCanvasHeight(int var0);

	void setCanvasWidth(int var0);

	void setClanChatName(java.lang.String var0);

	void setClanChatOwner(java.lang.String var0);

	void setClanChatRank(byte var0);

	void setClanMateCount(int var0);

	void setClanMates(com.acuity.rs.api.RSClanMember[] var0);

	void setClassStructures(com.acuity.rs.api.RSNodeLinkedList var0);

	void setClickX(int var0);

	void setClickY(int var0);

	void setCollisionMaps(com.acuity.rs.api.RSCollisionData[] var0);

	void setConnection(com.acuity.rs.api.RSConnection var0);

	void setCurrentDomain(java.lang.String var0);

	void setCurrentWorld(int var0);

	void setCurrentWorldMask(int var0);

	void setCursorState(int var0);

	void setDestinationX(int var0);

	void setDestinationY(int var0);

	void setDrawingAABB(boolean var0);

	void setDrawingAreaBottom(int var0);

	void setDrawingAreaHeight(int var0);

	void setDrawingAreaLeft(int var0);

	void setDrawingAreaPixels(int[] var0);

	void setDrawingAreaRight(int var0);

	void setDrawingAreaTop(int var0);

	void setDrawingAreaWidth(int var0);

	void setDynamicRegion(boolean var0);

	void setEngineCycle(int var0);

	void setFontp12full(com.acuity.rs.api.RSFont var0);

	void setFriendCount(int var0);

	void setGameState(int var0);

	void setGrandExchangeOffers(com.acuity.rs.api.RSGrandExchangeOffer[] var0);

	void setGroundItemDeque(com.acuity.rs.api.RSNodeDeque[][][] var0);

	void setHintArrowNpcIndex(int var0);

	void setHintArrowPlayerIndex(int var0);

	void setHintArrowType(int var0);

	void setHintArrowX(int var0);

	void setHintArrowY(int var0);

	void setHoveredUIDs(int[] var0);

	void setIgnoreCount(int var0);

	void setInterfaceFlags(com.acuity.rs.api.RSHashTable var0);

	void setInterfaceHeights(int[] var0);

	void setInterfaceNodes(com.acuity.rs.api.RSHashTable var0);

	void setInterfacePositionX(int[] var0);

	void setInterfacePositionY(int[] var0);

	void setInterfaces(com.acuity.rs.api.RSInterfaceComponent[][] var0);

	void setInterfaceWidths(int[] var0);

	void setItemSelectionState(int var0);

	void setItemTables(com.acuity.rs.api.RSHashTable var0);

	void setLastClickTime(long var0);

	void setLatestSelectedItemIndex(int var0);

	void setLatestSelectedItemIndexpacketIDlatestSelectedItemIndex(int var0);

	void setLatestSelectedItemName(java.lang.String var0);

	void setLocalPlayer(com.acuity.rs.api.RSPlayer var0);

	void setLoginResponse1(java.lang.String var0);

	void setLoginResponse2(java.lang.String var0);

	void setLoginResponse3(java.lang.String var0);

	void setLoginState(int var0);

	void setLoginWorldSelectorOpen(boolean var0);

	void setLowMemory(boolean var0);

	void setMapRegions(int[] var0);

	void setMapRotation(int var0);

	void setMembersWorld(boolean var0);

	void setMenuActions(java.lang.String[] var0);

	void setMenuHeight(int var0);

	void setMenuOpcodes(int[] var0);

	void setMenuOpen(boolean var0);

	void setMenuPrimaryArgs(int[] var0);

	void setMenuRowCount(int var0);

	void setMenuSecondaryArgs(int[] var0);

	void setMenuTargets(java.lang.String[] var0);

	void setMenuTertiaryArgs(int[] var0);

	void setMenuWidth(int var0);

	void setMenuX(int var0);

	void setMenuY(int var0);

	void setModLevel(int var0);

	void setMouseIdleTime(int var0);

	void setMouseRecorder(com.acuity.rs.api.RSMouseRecorder var0);

	void setMouseX(int var0);

	void setMouseY(int var0);

	void setNpcActionPriority(com.acuity.rs.api.RSActionPrioritySetting var0);

	void setNpcIndices(int[] var0);

	void setNpcs(com.acuity.rs.api.RSNpc[] var0);

	void setOnCursorCount(int var0);

	void setPassword(java.lang.String var0);

	void setPendingClickX(int var0);

	void setPendingClickY(int var0);

	void setPendingMouseX(int var0);

	void setPendingMouseY(int var0);

	void setPendingSpawns(com.acuity.rs.api.RSNodeDeque var0);

	void setPlane(int var0);

	void setPlayerActionPriority(com.acuity.rs.api.RSActionPrioritySetting var0);

	void setPlayerActions(java.lang.String[] var0);

	void setPlayerIndex(int var0);

	void setPlayerOptionsPriorities(boolean[] var0);

	void setPlayers(com.acuity.rs.api.RSPlayer[] var0);

	void setPreferences(com.acuity.rs.api.RSPreferences var0);

	void setProjectilesDeque(com.acuity.rs.api.RSNodeDeque var0);

	void setPublicChatMode(int var0);

	void setRealSkillLevels(int[] var0);

	void setRedrawMode(int var0);

	void setResizableMode(boolean var0);

	void setRunEnergy(int var0);

	void setSceneGraph(com.acuity.rs.api.RSScene var0);

	void setSceneRenderRules(byte[][][] var0);

	void setSelectedRegionTileX(int var0);

	void setSelectedRegionTileY(int var0);

	void setSkillExperiences(int[] var0);

	void setSpellSelected(boolean var0);

	void setSpellTargetFlags(int var0);

	void setSpotAnimationDeque(com.acuity.rs.api.RSNodeDeque var0);

	void setTempVarps(int[] var0);

	void setTileHeights(int[][][] var0);

	void setUseAABBBoundingBoxes(boolean var0);

	void setUsername(java.lang.String var0);

	void setVarps(int[] var0);

	void setViewportHeight(int var0);

	void setViewportScale(int var0);

	void setViewportWalking(boolean var0);

	void setViewportWidth(int var0);

	void setWeight(int var0);

	void setWorlds(com.acuity.rs.api.RSWorld[] var0);

	void setWrapper(com.acuity.api.rs.wrappers.peers.engine.Client var0);

	void setXteaKeys(int[][] var0);
}
