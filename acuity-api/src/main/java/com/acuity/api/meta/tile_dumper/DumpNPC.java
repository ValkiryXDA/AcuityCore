package com.acuity.api.meta.tile_dumper;

import com.acuity.api.rs.wrappers.peers.scene.actors.impl.Npc;
import org.bson.Document;

import java.util.List;

/**
 * Created by Zachary Herridge on 7/18/2017.
 */
public class DumpNPC {

    private final List<String> actions;
    private String _id;

    private int x;
    private int y;
    private int z;
    private String name;
    private int npcID;


    public DumpNPC(Npc npc, int x, int y, int plane) {
        this.x = x;
        this.y = y;
        this.z = plane;
        this.name = npc.getName();
        this.npcID = npc.getID();
        this.actions = npc.getActions();
        this._id = x + ":" + y + ":" + z + ":" + name + ":" + npcID;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public List<String> getActions() {
        return actions;
    }

    public String getName() {
        return name;
    }

    public int getNpcID() {
        return npcID;
    }

    public Document toUpdate(){
        Document update =  new Document("$set",
                new Document()
                        .append("x", x)
                        .append("y", y)
                        .append("z", z)
                        .append("n", name)
                        .append("ni", npcID));
        return update;
    }

    public String getID() {
        return _id;
    }
}
