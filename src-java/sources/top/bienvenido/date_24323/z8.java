package top.bienvenido.date_24323;

import android.os.IBinder;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/z8.class */
public final class z8 extends d2 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final /* synthetic */ n4 f443;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final /* synthetic */ d2 f444;

    public z8(n4 n4Var, d2 d2Var) {
        this.f443 = n4Var;
        this.f444 = d2Var;
    }

    @Override // top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        try {
            if (Intrinsics.areEqual(method.getReturnType(), IBinder.class) && objArr.length == 0) {
                return this.f443;
            }
        } catch (Exception unused) {
        }
        return this.f444.mo1(obj, method, objArr);
    }
}
