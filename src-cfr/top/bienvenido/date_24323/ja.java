/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.WindowManager$LayoutParams
 *  kotlin.Unit
 *  kotlin.jvm.functions.Function2
 *  kotlin.jvm.internal.FunctionReferenceImpl
 *  kotlin.reflect.KMutableProperty1
 */
package top.bienvenido.date_24323;

import android.view.WindowManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.KMutableProperty1;

public final class ja
extends FunctionReferenceImpl
implements Function2 {
    public ja(Object object) {
        super(2, object, KMutableProperty1.class, "set", "set(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
    }

    public final Object invoke(Object object, Object object2) {
        ja ja2 = ja3;
        ja ja3 = (WindowManager.LayoutParams)object;
        object = (String)object2;
        ((KMutableProperty1)ja2.receiver).set((Object)ja3, object);
        return Unit.INSTANCE;
    }
}

