package top.bienvenido.date_24323;

import android.content.pm.ParceledListSlice;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/b4.class */
public final class b4 extends d2 {
    @Override // top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        try {
            if (f4.f91) {
                List list = (List) l6.f212xaa30c2c7.m222((v1) -> {
                    return m58(r1, v1);
                });
                if (list != null) {
                    Function1 function1 = g1.f114;
                    return ParceledListSlice.class.isAssignableFrom(method.getReturnType()) ? g1.m158(list) : list;
                }
            }
        } catch (Exception unused) {
        }
        return method.invoke(obj, objArr);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final List m58(Object[] objArr, s0 s0Var) {
        Object obj = objArr[0];
        int iIntValue = obj instanceof Number ? ((Number) obj).intValue() : 0;
        Object obj2 = objArr[1];
        return s0Var.mo337((((long) (obj2 instanceof Number ? ((Number) obj2).intValue() : 0)) & 4294967295L) | ((((long) iIntValue) << 32) & (-4294967296L)), f4.f97xb7bf1d91);
    }
}
