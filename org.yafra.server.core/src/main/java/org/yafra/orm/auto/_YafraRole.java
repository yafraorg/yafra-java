package org.yafra.orm.auto;

import org.apache.cayenne.CayenneDataObject;
import org.yafra.orm.YafraBusinessRole;

/**
 * Class _YafraRole was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _YafraRole extends CayenneDataObject {

    public static final String DESCRIPTION_PROPERTY = "description";
    public static final String NAME_PROPERTY = "name";
    public static final String RIGHTS_PROPERTY = "rights";
    public static final String TO_YAFRA_BUSINESS_ROLE_PROPERTY = "toYafraBusinessRole";

    public static final String PK_YAFRA_ROLE_PK_COLUMN = "pkYafraRole";

    public void setDescription(String description) {
        writeProperty("description", description);
    }
    public String getDescription() {
        return (String)readProperty("description");
    }

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void setRights(String rights) {
        writeProperty("rights", rights);
    }
    public String getRights() {
        return (String)readProperty("rights");
    }

    public void setToYafraBusinessRole(YafraBusinessRole toYafraBusinessRole) {
        setToOneTarget("toYafraBusinessRole", toYafraBusinessRole, true);
    }

    public YafraBusinessRole getToYafraBusinessRole() {
        return (YafraBusinessRole)readProperty("toYafraBusinessRole");
    }


}
