package org.vamdc.basecolTest.dao.auto;

import org.apache.cayenne.CayenneDataObject;
import org.vamdc.BasecolTest.dao.Fits;
import org.vamdc.BasecolTest.dao.LevelGroups;

/**
 * Class _FitValues was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _FitValues extends CayenneDataObject {

    public static final String COEFFICIENT_PROPERTY = "coefficient";
    public static final String ID_FIT_PROPERTY = "idFit";
    public static final String ID_LEVEL_GROUP_PROPERTY = "idLevelGroup";
    public static final String POSITION_PROPERTY = "position";
    public static final String VALUE_PROPERTY = "value";
    public static final String TO_FITS_PROPERTY = "toFits";
    public static final String TO_LEVEL_GROUPS_PROPERTY = "toLevelGroups";

    public static final String COEFFICIENT_PK_COLUMN = "coefficient";
    public static final String ID_FIT_PK_COLUMN = "idFit";
    public static final String ID_LEVEL_GROUP_PK_COLUMN = "idLevelGroup";
    public static final String VALUE_PK_COLUMN = "value";

    public void setCoefficient(String coefficient) {
        writeProperty(COEFFICIENT_PROPERTY, coefficient);
    }
    public String getCoefficient() {
        return (String)readProperty(COEFFICIENT_PROPERTY);
    }

    public void setIdFit(Long idFit) {
        writeProperty(ID_FIT_PROPERTY, idFit);
    }
    public Long getIdFit() {
        return (Long)readProperty(ID_FIT_PROPERTY);
    }

    public void setIdLevelGroup(Long idLevelGroup) {
        writeProperty(ID_LEVEL_GROUP_PROPERTY, idLevelGroup);
    }
    public Long getIdLevelGroup() {
        return (Long)readProperty(ID_LEVEL_GROUP_PROPERTY);
    }

    public void setPosition(Integer position) {
        writeProperty(POSITION_PROPERTY, position);
    }
    public Integer getPosition() {
        return (Integer)readProperty(POSITION_PROPERTY);
    }

    public void setValue(Double value) {
        writeProperty(VALUE_PROPERTY, value);
    }
    public Double getValue() {
        return (Double)readProperty(VALUE_PROPERTY);
    }

    public void setToFits(Fits toFits) {
        setToOneTarget(TO_FITS_PROPERTY, toFits, true);
    }

    public Fits getToFits() {
        return (Fits)readProperty(TO_FITS_PROPERTY);
    }


    public void setToLevelGroups(LevelGroups toLevelGroups) {
        setToOneTarget(TO_LEVEL_GROUPS_PROPERTY, toLevelGroups, true);
    }

    public LevelGroups getToLevelGroups() {
        return (LevelGroups)readProperty(TO_LEVEL_GROUPS_PROPERTY);
    }


}
