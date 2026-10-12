/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.ProviderInfo
 *  kotlin.comparisons.ComparisonsKt
 */
package top.bienvenido.date_24323;

import android.content.pm.ProviderInfo;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

public final class f6
implements Comparator {
    public final int compare(Object object, Object object2) {
        return ComparisonsKt.compareValues((Comparable)Integer.valueOf(((ProviderInfo)object2).initOrder), (Comparable)Integer.valueOf(((ProviderInfo)object).initOrder));
    }
}

