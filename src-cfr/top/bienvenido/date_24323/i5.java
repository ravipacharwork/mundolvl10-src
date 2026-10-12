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

public final class i5
extends FunctionReferenceImpl
implements Function2 {
    public i5(Object object) {
        super(2, object, KMutableProperty1.class, "set", "set(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
    }

    public final Object invoke(Object object, Object object2) {
        i5 i52 = i53;
        i5 i53 = (ResolveInfo)object;
        object = (ProviderInfo)object2;
        ((KMutableProperty1)i52.receiver).set((Object)i53, object);
        return Unit.INSTANCE;
    }
}

