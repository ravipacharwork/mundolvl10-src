/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.ProviderInfo
 *  android.content.pm.ResolveInfo
 *  kotlin.Unit
 *  kotlin.jvm.functions.Function2
 *  kotlin.jvm.internal.FunctionReferenceImpl
 *  kotlin.reflect.KMutableProperty1
 */
package top.bienvenido.date_24323;

import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.KMutableProperty1;

public final class v1
extends FunctionReferenceImpl
implements Function2 {
    public v1(Object object) {
        super(2, object, KMutableProperty1.class, "set", "set(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
    }

    public final Object invoke(Object object, Object object2) {
        v1 v12 = v13;
        v1 v13 = (ResolveInfo)object;
        object = (ProviderInfo)object2;
        ((KMutableProperty1)v12.receiver).set((Object)v13, object);
        return Unit.INSTANCE;
    }
}

