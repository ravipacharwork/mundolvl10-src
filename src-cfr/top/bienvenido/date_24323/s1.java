/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.ActivityInfo
 *  android.content.pm.ResolveInfo
 *  kotlin.Unit
 *  kotlin.jvm.functions.Function2
 *  kotlin.jvm.internal.FunctionReferenceImpl
 *  kotlin.reflect.KMutableProperty1
 */
package top.bienvenido.date_24323;

import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.KMutableProperty1;

public final class s1
extends FunctionReferenceImpl
implements Function2 {
    public s1(Object object) {
        super(2, object, KMutableProperty1.class, "set", "set(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
    }

    public final Object invoke(Object object, Object object2) {
        s1 s12 = s13;
        s1 s13 = (ResolveInfo)object;
        object = (ActivityInfo)object2;
        ((KMutableProperty1)s12.receiver).set((Object)s13, object);
        return Unit.INSTANCE;
    }
}

