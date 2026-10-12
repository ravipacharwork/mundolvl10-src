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
import top.bienvenido.date_24323.m0;
import top.bienvenido.date_24323.n0;
import top.bienvenido.date_24323.p0;

public final class d5
extends FunctionReferenceImpl
implements Function1 {
    public static final d5 \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070 = new d5();

    public d5() {
        super(1, n0.class, "asInterface", "asInterface(Landroid/os/IBinder;)Ltop/bienvenido/mundo/IMundoPackageManagerService;", 0);
    }

    public final Object invoke(Object object) {
        d5 d52 = (IBinder)object;
        if (d52 == null) {
            return null;
        }
        object = d52.queryLocalInterface("MundoPackageManagerService");
        if (object != null && object instanceof p0) {
            return (p0)object;
        }
        return new m0((IBinder)d52);
    }
}

