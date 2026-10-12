package top.bienvenido.date_24323;

import android.content.pm.ComponentInfo;
import android.content.pm.ParceledListSlice;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/a8.class */
public final class a8 extends d2 {
    @Override // top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        try {
            List list = (List) e5.f77xaa30c2c7.m222((v1) -> {
                return m21(r1, v1);
            });
            List list2 = list;
            if (list == null) {
                list2 = Collections.EMPTY_LIST;
            }
            List listM157 = g1.m157(method.invoke(obj, objArr));
            List list3 = listM157;
            if (listM157 == null) {
                list3 = Collections.EMPTY_LIST;
            }
            List listPlus = CollectionsKt.plus(list2, list3);
            Iterator it = listPlus.iterator();
            while (it.hasNext()) {
                C0051.m649(((ComponentInfo) it.next()).applicationInfo);
            }
            return ParceledListSlice.class.isAssignableFrom(method.getReturnType()) ? g1.m158(listPlus) : listPlus;
        } catch (Exception unused) {
            Function1 function1 = g1.f114;
            return ParceledListSlice.class.isAssignableFrom(method.getReturnType()) ? j.f178 : Collections.EMPTY_LIST;
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final List m21(Object[] objArr, p0 p0Var) {
        Object obj = objArr[0];
        String string = obj != null ? obj.toString() : null;
        Object obj2 = objArr[3];
        return p0Var.mo2985(string, obj2 != null ? obj2.toString() : null);
    }
}
