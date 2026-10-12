/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.android.internal.net.VpnConfig
 *  kotlin.jvm.internal.MutablePropertyReference1Impl
 */
package top.bienvenido.date_24323;

import com.android.internal.net.VpnConfig;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

public final class ha
extends MutablePropertyReference1Impl {
    public static final ha \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070 = new ha();

    public ha() {
        super(VpnConfig.class, "user", "getUser()Ljava/lang/String;", 0);
    }

    public final Object get(Object object) {
        return ((VpnConfig)object).user;
    }

    public final void set(Object object, Object object2) {
        ((VpnConfig)object).user = (String)object2;
    }
}

