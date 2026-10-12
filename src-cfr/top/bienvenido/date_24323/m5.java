/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.ActivityInfo
 *  android.content.pm.ResolveInfo
 *  kotlin.jvm.internal.MutablePropertyReference1Impl
 */
package top.bienvenido.date_24323;

import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

public final class m5
extends MutablePropertyReference1Impl {
    public static final m5 \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070 = new m5();

    public m5() {
        super(ResolveInfo.class, "activityInfo", "getActivityInfo()Landroid/content/pm/ActivityInfo;", 0);
    }

    public final Object get(Object object) {
        return ((ResolveInfo)object).activityInfo;
    }

    public final void set(Object object, Object object2) {
        ((ResolveInfo)object).activityInfo = (ActivityInfo)object2;
    }
}

