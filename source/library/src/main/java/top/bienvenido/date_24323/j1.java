package top.bienvenido.date_24323;

import android.content.pm.ParceledListSlice;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/j1.class */
public final class j1 extends d2 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final Function2 f179;

    public j1(Function2 function2) {
        this.f179 = function2;
    }

    @Override // top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        try {
            Function1 function1 = g1.f114;
            List listM157 = g1.m157(method.invoke(obj, objArr));
            List list = listM157;
            if (listM157 == null) {
                list = Collections.EMPTY_LIST;
            }
            List list2 = (List) e5.f77xaa30c2c7.m222((v2) -> {
                return m217(r1, r2, v2);
            });
            List list3 = list2;
            if (list2 == null) {
                list3 = Collections.EMPTY_LIST;
            }
            List listPlus = CollectionsKt.plus(list, list3);
            return ParceledListSlice.class.isAssignableFrom(method.getReturnType()) ? g1.m158(listPlus) : listPlus;
        } catch (Exception unused) {
            Function1 function2 = g1.f114;
            return ParceledListSlice.class.isAssignableFrom(method.getReturnType()) ? j.f178 : Collections.EMPTY_LIST;
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final List m217(j1 j1Var, Object[] objArr, p0 p0Var) {
        Function2 function2 = j1Var.f179;
        Object obj = objArr[0];
        return (List) function2.invoke(p0Var, Integer.valueOf(obj instanceof Number ? ((Number) obj).intValue() : 0));
    }
}
