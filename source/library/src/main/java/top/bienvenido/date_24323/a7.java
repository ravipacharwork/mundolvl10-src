package top.bienvenido.date_24323;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/a7.class */
public abstract class a7 extends d2 {
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public abstract Function3 mo19();

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public abstract Function1 mo20();

    @Override // top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public Object mo1(Object obj, Method method, Object[] objArr) {
        try {
            Object obj2 = objArr[0];
            if ((obj2 instanceof String) && !Intrinsics.areEqual(obj2, b3.f18)) {
                if (!f4.f96 && Intrinsics.areEqual(obj2, f4.f92)) {
                    d2.m120(objArr, 1);
                    Object objInvoke = method.invoke(obj, objArr);
                    if (objInvoke == null) {
                        return null;
                    }
                    mo20().invoke(objInvoke);
                    return objInvoke;
                }
                Object objM222 = e5.f77xaa30c2c7.m222((v3) -> {
                    return m18(r1, r2, r3, v3);
                });
                if (objM222 != null) {
                    mo20().invoke(objM222);
                    return objM222;
                }
            }
        } catch (Exception unused) {
        }
        return method.invoke(obj, objArr);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Object m18(a7 a7Var, Object obj, Object[] objArr, p0 p0Var) {
        Function3 function3Mo19 = a7Var.mo19();
        Object obj2 = objArr[1];
        return function3Mo19.invoke(p0Var, obj, Integer.valueOf(obj2 instanceof Number ? ((Number) obj2).intValue() : 0));
    }
}
