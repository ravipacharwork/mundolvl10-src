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
import top.bienvenido.date_24323.l0;

public final class q5
extends FunctionReferenceImpl
implements Function4 {
    public static final q5 \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070 = new q5();

    public q5() {
        super(4, l0.class, "queryIntentServices", "queryIntentServices(Landroid/content/Intent;Ljava/lang/String;I)Ljava/util/List;", 0);
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        l0 l02 = (l0)object;
        q5 q52 = (Intent)object2;
        object = (String)object3;
        return l02.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403((Intent)q52, (String)object, ((Number)object4).intValue());
    }
}

