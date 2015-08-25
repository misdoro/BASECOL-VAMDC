package org.vamdc.basecolTest.dao.auto;

import org.apache.cayenne.CayenneDataObject;
import org.vamdc.BasecolTest.dao.Collisions;
import org.vamdc.BasecolTest.dao.Scientists;

/**
 * Class _CollisionsScientists was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CollisionsScientists extends CayenneDataObject {

    public static final String ID_COLLISION_PROPERTY = "idCollision";
    public static final String ID_SCIENTIST_PROPERTY = "idScientist";
    public static final String RANK_PROPERTY = "rank";
    public static final String TO_COLLISIONS_PROPERTY = "toCollisions";
    public static final String TO_SCIENTISTS_PROPERTY = "toScientists";

    public static final String ID_COLLISION_PK_COLUMN = "idCollision";
    public static final String ID_SCIENTIST_PK_COLUMN = "idScientist";

    public void setIdCollision(Long idCollision) {
        writeProperty(ID_COLLISION_PROPERTY, idCollision);
    }
    public Long getIdCollision() {
        return (Long)readProperty(ID_COLLISION_PROPERTY);
    }

    public void setIdScientist(Long idScientist) {
        writeProperty(ID_SCIENTIST_PROPERTY, idScientist);
    }
    public Long getIdScientist() {
        return (Long)readProperty(ID_SCIENTIST_PROPERTY);
    }

    public void setRank(Integer rank) {
        writeProperty(RANK_PROPERTY, rank);
    }
    public Integer getRank() {
        return (Integer)readProperty(RANK_PROPERTY);
    }

    public void setToCollisions(Collisions toCollisions) {
        setToOneTarget(TO_COLLISIONS_PROPERTY, toCollisions, true);
    }

    public Collisions getToCollisions() {
        return (Collisions)readProperty(TO_COLLISIONS_PROPERTY);
    }


    public void setToScientists(Scientists toScientists) {
        setToOneTarget(TO_SCIENTISTS_PROPERTY, toScientists, true);
    }

    public Scientists getToScientists() {
        return (Scientists)readProperty(TO_SCIENTISTS_PROPERTY);
    }


}
