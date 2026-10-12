package top.bienvenido.date_24323;

import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/y8.class */
public final class y8 extends d2 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final Function1 f427;

    public y8(Function1 function1) {
        this.f427 = function1;
    }

    @Override // top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        try {
            n9 n9Var = b9.f29;
            Object obj2 = objArr[0];
            Pair pair = (Pair) n9Var.m385(obj2 != null ? obj2.hashCode() : 0);
            if (pair != null) {
                return this.f427.invoke(pair.getFirst());
            }
        } catch (Throwable unused) {
        }
        return method.invoke(obj, objArr);
    }
}
