/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.inputmethod.EditorInfo
 *  kotlin.Unit
 *  kotlin.jvm.functions.Function2
 *  kotlin.jvm.internal.FunctionReferenceImpl
 *  kotlin.reflect.KMutableProperty1
 */
package top.bienvenido.date_24323;

import android.view.inputmethod.EditorInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.KMutableProperty1;

public final class u0
extends FunctionReferenceImpl
implements Function2 {
    public u0(Object object) {
        super(2, object, KMutableProperty1.class, "set", "set(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
    }

    public final Object invoke(Object object, Object object2) {
        u0 u02 = u03;
        u0 u03 = (EditorInfo)object;
        object = (String)object2;
        ((KMutableProperty1)u02.receiver).set((Object)u03, object);
        return Unit.INSTANCE;
    }
}

