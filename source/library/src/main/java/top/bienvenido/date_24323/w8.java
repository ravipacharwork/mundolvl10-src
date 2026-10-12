package top.bienvenido.date_24323;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.ParceledListSlice;
import android.content.pm.ResolveInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/w8.class */
public abstract class w8 extends d2 {
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public abstract Function4 mo212();

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public abstract Function1 mo213();

    @Override // top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        try {
            Object obj2 = objArr[0];
            List list = (List) e5.f77xaa30c2c7.m222((v3) -> {
                return m551(r1, r2, r3, v3);
            });
            List list2 = list;
            if (list == null) {
                list2 = Collections.EMPTY_LIST;
            }
            Function1 function1 = g1.f114;
            List listM157 = g1.m157(method.invoke(obj, objArr));
            List<ResolveInfo> list3 = listM157;
            if (listM157 == null) {
                list3 = Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list2);
            if ((obj2 instanceof Intent) && Intrinsics.areEqual(((Intent) obj2).getScheme(), "fbconnect")) {
                if (list3 != null) {
                    for (ResolveInfo resolveInfo : list3) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        if (Intrinsics.areEqual(activityInfo != null ? activityInfo.packageName : null, f4.f92) && arrayList.size() <= 1) {
                            arrayList.add(resolveInfo);
                        }
                    }
                }
            } else if (list3 != null) {
                arrayList.addAll(list3);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0051.m649(((ComponentInfo) mo213().invoke((ResolveInfo) it.next())).applicationInfo);
            }
            Function1 function2 = g1.f114;
            return ParceledListSlice.class.isAssignableFrom(method.getReturnType()) ? g1.m158((List) arrayList) : arrayList;
        } catch (Exception unused) {
            Function1 function3 = g1.f114;
            return ParceledListSlice.class.isAssignableFrom(method.getReturnType()) ? j.f178 : Collections.EMPTY_LIST;
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final List m551(w8 w8Var, Object obj, Object[] objArr, p0 p0Var) {
        Function4 function4Mo212 = w8Var.mo212();
        Intent intent = obj instanceof Intent ? (Intent) obj : null;
        if (intent == null) {
            return null;
        }
        Object obj2 = objArr[1];
        String string = obj2 != null ? obj2.toString() : null;
        Object obj3 = objArr[2];
        return (List) function4Mo212.invoke(p0Var, intent, string, Integer.valueOf(obj3 instanceof Number ? ((Number) obj3).intValue() : 0));
    }
}
