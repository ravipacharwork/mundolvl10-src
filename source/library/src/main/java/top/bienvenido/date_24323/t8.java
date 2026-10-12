package top.bienvenido.date_24323;

import android.content.IntentFilter;
import android.os.IBinder;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/t8.class */
public final class t8 extends ArrayList {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final IBinder f334;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final s5 f335;

    public t8(IBinder iBinder, s5 s5Var) {
        this.f334 = iBinder;
        this.f335 = s5Var;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final boolean m491(IntentFilter intentFilter) {
        int iCountDataSchemes;
        int size = super.size();
        for (int i = 0; i < size; i++) {
            IntentFilter intentFilter2 = (IntentFilter) get(i);
            int iCountActions = intentFilter2.countActions();
            if (iCountActions == intentFilter.countActions()) {
                int i2 = 0;
                while (true) {
                    if (i2 >= iCountActions) {
                        int iCountCategories = intentFilter2.countCategories();
                        if (iCountCategories != intentFilter.countCategories()) {
                            break;
                        }
                        int i3 = 0;
                        while (true) {
                            if (i3 >= iCountCategories) {
                                if (intentFilter2.countDataTypes() != intentFilter.countDataTypes() || (iCountDataSchemes = intentFilter2.countDataSchemes()) != intentFilter.countDataSchemes()) {
                                    break;
                                }
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= iCountDataSchemes) {
                                        if (intentFilter2.countDataAuthorities() != intentFilter.countDataAuthorities() || intentFilter2.countDataPaths() != intentFilter.countDataPaths() || intentFilter2.countDataSchemeSpecificParts() != intentFilter.countDataSchemeSpecificParts()) {
                                            break;
                                        }
                                        return true;
                                    }
                                    if (!intentFilter.hasDataScheme(intentFilter2.getDataScheme(i4))) {
                                        break;
                                    }
                                    i4++;
                                }
                            } else {
                                if (!intentFilter.hasCategory(intentFilter2.getCategory(i3))) {
                                    break;
                                }
                                i3++;
                            }
                        }
                    } else {
                        if (!intentFilter.hasAction(intentFilter2.getAction(i2))) {
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C0058) {
            return super.contains((C0058) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C0058) {
            return super.indexOf((C0058) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C0058) {
            return super.lastIndexOf((C0058) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof C0058) {
            return super.remove((C0058) obj);
        }
        return false;
    }
}
