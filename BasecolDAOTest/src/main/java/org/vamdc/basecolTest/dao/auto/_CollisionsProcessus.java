package org.vamdc.basecolTest.dao.auto;

import org.apache.cayenne.CayenneDataObject;
import org.vamdc.BasecolTest.dao.Collisions;
import org.vamdc.BasecolTest.dao.Processus;

/**
 * Class _CollisionsProcessus was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CollisionsProcessus extends CayenneDataObject {

    public static final String ID_COLLISION_PROPERTY = "idCollision";
    public static final String ID_PROCESSUS_PROPERTY = "idProcessus";
    public static final String TO_COLLISIONS_PROPERTY = "toCollisions";
    public static final String TO_PROCESSUS_PROPERTY = "toProcessus";

    public static final String ID_COLLISION_PK_COLUMN = "idCollision";
    public static final String ID_PROCESSUS_PK_COLUMN = "idProcessus";

    public void setIdCollision(Long idCollision) {
        writeProperty(ID_COLLISION_PROPERTY, idCollision);
    }
    public Long getIdCollision() {
        return (Long)readProperty(ID_COLLISION_PROPERTY);
    }

    public void setIdProcessus(Short idProcessus) {
        writeProperty(ID_PROCESSUS_PROPERTY, idProcessus);
    }
    public Short getIdProcessus() {
        return (Short)readProperty(ID_PROCESSUS_PROPERTY);
    }

    public void setToCollisions(Collisions toCollisions) {
        setToOneTarget(TO_COLLISIONS_PROPERTY, toCollisions, true);
    }

    public Collisions getToCollisions() {
        return (Collisions)readProperty(TO_COLLISIONS_PROPERTY);
    }


    public void setToProcessus(Processus toProcessus) {
        setToOneTarget(TO_PROCESSUS_PROPERTY, toProcessus, true);
    }

    public Processus getToProcessus() {
        return (Processus)readProperty(TO_PROCESSUS_PROPERTY);
    }


}
