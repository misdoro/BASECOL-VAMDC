package org.vamdc.basecolTest.dao.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.vamdc.BasecolTest.dao.Collisions;
import org.vamdc.BasecolTest.dao.EnergyTables;

/**
 * Class _Units was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Units extends CayenneDataObject {

    public static final String DESIGNATION_PROPERTY = "designation";
    public static final String ID_UNIT_PROPERTY = "idUnit";
    public static final String LATEX_PROPERTY = "latex";
    public static final String XSAMS_UNIT_PROPERTY = "xsamsUnit";
    public static final String COLLISIONSS_PROPERTY = "collisionss";
    public static final String ENERGYTABLESES_PROPERTY = "energytableses";

    public static final String ID_UNIT_PK_COLUMN = "idUnit";

    public void setDesignation(String designation) {
        writeProperty(DESIGNATION_PROPERTY, designation);
    }
    public String getDesignation() {
        return (String)readProperty(DESIGNATION_PROPERTY);
    }

    public void setIdUnit(Long idUnit) {
        writeProperty(ID_UNIT_PROPERTY, idUnit);
    }
    public Long getIdUnit() {
        return (Long)readProperty(ID_UNIT_PROPERTY);
    }

    public void setLatex(String latex) {
        writeProperty(LATEX_PROPERTY, latex);
    }
    public String getLatex() {
        return (String)readProperty(LATEX_PROPERTY);
    }

    public void setXsamsUnit(String xsamsUnit) {
        writeProperty(XSAMS_UNIT_PROPERTY, xsamsUnit);
    }
    public String getXsamsUnit() {
        return (String)readProperty(XSAMS_UNIT_PROPERTY);
    }

    public void addToCollisionss(Collisions obj) {
        addToManyTarget(COLLISIONSS_PROPERTY, obj, true);
    }
    public void removeFromCollisionss(Collisions obj) {
        removeToManyTarget(COLLISIONSS_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Collisions> getCollisionss() {
        return (List<Collisions>)readProperty(COLLISIONSS_PROPERTY);
    }


    public void addToEnergytableses(EnergyTables obj) {
        addToManyTarget(ENERGYTABLESES_PROPERTY, obj, true);
    }
    public void removeFromEnergytableses(EnergyTables obj) {
        removeToManyTarget(ENERGYTABLESES_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<EnergyTables> getEnergytableses() {
        return (List<EnergyTables>)readProperty(ENERGYTABLESES_PROPERTY);
    }


}