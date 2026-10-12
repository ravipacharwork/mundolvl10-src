/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  kotlin.jvm.functions.Function4
 *  kotlin.jvm.internal.FunctionReferenceImpl
 */
package top.bienvenido.date_24323;

import android.content.Intent;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import top.bienvenido.date_24323.p0;

public final class n7
extends FunctionReferenceImpl
implements Function4 {
    public static final n7 \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070 = new n7();

    public n7() {
        super(4, p0.class, "queryIntentActivities", "queryIntentActivities(Landroid/content/Intent;Ljava/lang/String;I)Ljava/util/List;", 0);
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        p0 p02 = (p0)object;
        n7 n72 = (Intent)object2;
        object = (String)object3;
        return p02.\u6211\u8981\u9001\u4f60\u5988\u4e00\u6735\u82b1\u54c8\u54c8\u54c8\u5f00\u73a9\u7b11\u7684\u6211\u54ea\u6765\u7684\u82b1\u4f60\u54ea\u6765\u7684\u5988((Intent)n72, (String)object, ((Number)object4).intValue());
    }
}

