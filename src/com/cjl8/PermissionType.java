
package com.cjl8;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PermissionType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PermissionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="READ_ONYL"/&gt;
 *     &lt;enumeration value="READ_WRITE"/&gt;
 *     &lt;enumeration value="FULL_CONTROL"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PermissionType")
@XmlEnum
public enum PermissionType {

    READ_ONYL,
    READ_WRITE,
    FULL_CONTROL,
    NONE;

    public String value() {
        return name();
    }

    public static PermissionType fromValue(String v) {
        return valueOf(v);
    }

}
