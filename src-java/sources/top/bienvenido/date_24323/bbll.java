package top.bienvenido.date_24323;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: top.bienvenido.date_24323.有空搁爷这bbll不如赶紧买张高铁票赶回家趁你妈弥留之际问清楚你到底几个爹, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/有空搁爷这bbll不如赶紧买张高铁票赶回家趁你妈弥留之际问清楚你到底几个爹.class */
public final class bbll extends d2 {
    @Override // top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        try {
            Object obj2 = objArr[0];
            if (f4.f91 && (obj2 instanceof Integer)) {
                if (Intrinsics.areEqual(obj2, Integer.valueOf(b3.f19))) {
                    return f4.f92;
                }
                String str = (String) e5.f77xaa30c2c7.m222((v1) -> {
                    return m662(r1, v1);
                });
                if (str != null && str.length() != 0) {
                    return str;
                }
            }
        } catch (Exception unused) {
        }
        return method.invoke(obj, objArr);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final String m662(Object obj, p0 p0Var) {
        return p0Var.mo282(((Number) obj).intValue());
    }
}
