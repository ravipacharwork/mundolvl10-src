package top.bienvenido.date_24323;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/o9.class */
public final class o9 extends ArrayList {
    public o9() {
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return m401(obj) >= 0;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int iM401 = m401(obj);
        if (iM401 >= 0) {
            return false;
        }
        add(iM401 ^ (-1), obj);
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        return m401(obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        return m401(obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        boolean z = false;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z = add(it.next()) || z;
        }
        return z;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iM401 = m401(obj);
        if (iM401 < 0) {
            return false;
        }
        remove(iM401);
        return true;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final int m401(Object obj) {
        int i = 0;
        int size = size() - 1;
        int iHashCode = obj.hashCode();
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            int iHashCode2 = get(i2).hashCode();
            if (iHashCode2 < iHashCode) {
                i = i2 + 1;
            } else {
                if (iHashCode2 <= iHashCode) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return i ^ (-1);
    }

    public o9(int i) {
        super(i);
    }

    public o9(String str) {
        super(1);
        super.add(str);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        return addAll(collection);
    }
}
