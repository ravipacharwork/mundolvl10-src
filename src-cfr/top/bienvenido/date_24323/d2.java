/*
 * Decompiled with CFR 0.152.
 */
package top.bienvenido.date_24323;

import java.lang.reflect.Method;

public class d2 {
    public static Object \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(Object[] objectArray, Class clazz) {
        for (Object object : objectArray) {
            if (!clazz.isInstance(object)) continue;
            return object;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(Object[] objectArray, int n10) {
        long l10;
        try {
            Object object = objectArray[n10];
            if (object instanceof Integer) {
                objectArray[n10] = ((Number)object).intValue() | 0x200;
                return;
            }
            if (!(object instanceof Long)) return;
            Object[] objectArray2 = objectArray;
            int n11 = n10;
            l10 = ((Number)object).longValue();
        }
        catch (Exception exception) {
            return;
        }
        objectArray2[n11] = l10 | 0x200L;
    }

    public Object \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(Object object, Method method, Object[] objectArray) {
        return method.invoke(object, objectArray);
    }
}

