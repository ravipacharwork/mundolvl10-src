/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.ResolveInfo
 *  android.content.pm.ServiceInfo
 *  kotlin.Unit
 *  kotlin.jvm.functions.Function2
 *  kotlin.jvm.internal.FunctionReferenceImpl
 *  kotlin.reflect.KMutableProperty1
 */
package top.bienvenido.date_24323;

import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.KMutableProperty1;

public final class y1
extends FunctionReferenceImpl
implements Function2 {
    public y1(Object object) {
        super(2, object, KMutableProperty1.class, "set", "set(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
    }

    public final Object invoke(Object object, Object object2) {
        y1 y12 = y13;
        y1 y13 = (ResolveInfo)object;
        object = (ServiceInfo)object2;
        ((KMutableProperty1)y12.receiver).set((Object)y13, object);
        return Unit.INSTANCE;
    }
}

