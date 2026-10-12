/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.android.internal.net.VpnConfig
 *  kotlin.Unit
 *  kotlin.jvm.functions.Function2
 *  kotlin.jvm.internal.FunctionReferenceImpl
 *  kotlin.reflect.KMutableProperty1
 */
package top.bienvenido.date_24323;

import com.android.internal.net.VpnConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.KMutableProperty1;

public final class ga
extends FunctionReferenceImpl
implements Function2 {
    public ga(Object object) {
        super(2, object, KMutableProperty1.class, "set", "set(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
    }

    public final Object invoke(Object object, Object object2) {
        ga ga2 = ga3;
        ga ga3 = (VpnConfig)object;
        object = (String)object2;
        ((KMutableProperty1)ga2.receiver).set((Object)ga3, object);
        return Unit.INSTANCE;
    }
}

