/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.internal.FunctionReferenceImpl
 */
package top.bienvenido.date_24323;

import android.os.IBinder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import top.bienvenido.date_24323.b0;
import top.bienvenido.date_24323.y;
import top.bienvenido.date_24323.z;

public final class n3
extends FunctionReferenceImpl
implements Function1 {
    public static final n3 \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070 = new n3();

    public n3() {
        super(1, z.class, "asInterface", "asInterface(Landroid/os/IBinder;)Ltop/bienvenido/mundo/IMundoAccountManagerService;", 0);
    }

    public final Object invoke(Object object) {
        n3 n32 = (IBinder)object;
        if (n32 == null) {
            return null;
        }
        object = n32.queryLocalInterface("MundoAccountManagerService");
        if (object != null && object instanceof b0) {
            return (b0)object;
        }
        return new y((IBinder)n32);
    }
}

