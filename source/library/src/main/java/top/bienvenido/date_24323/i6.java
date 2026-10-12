package top.bienvenido.date_24323;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/i6.class */
public final class i6 extends d2 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final /* synthetic */ Function1 f172;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final /* synthetic */ j6 f173;

    public i6(Function1 function1, j6 j6Var) {
        this.f172 = function1;
        this.f173 = j6Var;
    }

    @Override // top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        try {
            Object objInvoke = method.invoke(obj, objArr);
            if (objInvoke == null) {
                return null;
            }
            Function1 function1 = this.f172;
            j6 j6Var = this.f173;
            Object objInvoke2 = function1.invoke(objInvoke);
            d2 d2Var = u4.f339;
            j6Var.f187 = new t4(objInvoke2);
            return objInvoke2;
        } catch (Exception unused) {
            return null;
        }
    }
}
