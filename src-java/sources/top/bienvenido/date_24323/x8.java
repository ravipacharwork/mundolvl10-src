package top.bienvenido.date_24323;

import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.content.pm.ResolveInfo;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/x8.class */
public abstract class x8 extends d2 {
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public abstract Function4 mo257();

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public abstract Function1 mo258();

    @Override // top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        try {
            Object obj2 = objArr[0];
            ResolveInfo resolveInfo = obj2 instanceof Intent ? (ResolveInfo) e5.f77xaa30c2c7.m222((v3) -> {
                return m567(r1, r2, r3, v3);
            }) : null;
            if (resolveInfo == null) {
                d2.m120(objArr, 2);
                Unit unit = Unit.INSTANCE;
                resolveInfo = (ResolveInfo) method.invoke(obj, objArr);
            }
            if (resolveInfo == null) {
                return null;
            }
            ResolveInfo resolveInfo2 = resolveInfo;
            C0051.m649(((ComponentInfo) mo258().invoke(resolveInfo)).applicationInfo);
            return resolveInfo2;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final ResolveInfo m567(x8 x8Var, Object obj, Object[] objArr, p0 p0Var) {
        Function4 function4Mo257 = x8Var.mo257();
        Object obj2 = objArr[1];
        String string = obj2 != null ? obj2.toString() : null;
        Object obj3 = objArr[2];
        return (ResolveInfo) function4Mo257.invoke(p0Var, obj, string, Integer.valueOf(obj3 instanceof Number ? ((Number) obj3).intValue() : 0));
    }
}
