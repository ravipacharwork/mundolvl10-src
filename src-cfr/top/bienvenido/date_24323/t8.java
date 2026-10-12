/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.IntentFilter
 *  android.os.IBinder
 */
package top.bienvenido.date_24323;

import android.content.IntentFilter;
import android.os.IBinder;
import java.util.AbstractList;
import java.util.ArrayList;
import top.bienvenido.date_24323.s5;

public final class t8
extends ArrayList {
    public final IBinder \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;
    public final s5 \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403;

    public t8(IBinder iBinder, s5 s52) {
        this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070 = iBinder;
        this.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403 = s52;
    }

    @Override
    public final boolean equals(Object object) {
        return this == object;
    }

    @Override
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final boolean \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(IntentFilter intentFilter) {
        int n10 = super.size();
        block0: for (int i10 = 0; i10 < n10; ++i10) {
            int n11;
            IntentFilter intentFilter2 = (IntentFilter)((AbstractList)this).get(i10);
            int n12 = intentFilter2.countActions();
            if (n12 != intentFilter.countActions()) continue;
            for (n11 = 0; n11 < n12; ++n11) {
                if (!intentFilter.hasAction(intentFilter2.getAction(n11))) continue block0;
            }
            n12 = intentFilter2.countCategories();
            if (n12 != intentFilter.countCategories()) continue;
            for (n11 = 0; n11 < n12; ++n11) {
                if (!intentFilter.hasCategory(intentFilter2.getCategory(n11))) continue block0;
            }
            if (intentFilter2.countDataTypes() != intentFilter.countDataTypes() || (n12 = intentFilter2.countDataSchemes()) != intentFilter.countDataSchemes()) continue;
            for (n11 = 0; n11 < n12; ++n11) {
                if (!intentFilter.hasDataScheme(intentFilter2.getDataScheme(n11))) continue block0;
            }
            if (intentFilter2.countDataAuthorities() != intentFilter.countDataAuthorities() || intentFilter2.countDataPaths() != intentFilter.countDataPaths() || intentFilter2.countDataSchemeSpecificParts() != intentFilter.countDataSchemeSpecificParts()) continue;
            return true;
        }
        return false;
    }
}

