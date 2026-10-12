package top.bienvenido.date_24323;

import android.os.IBinder;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;

/* JADX INFO: renamed from: top.bienvenido.date_24323.你话这么多怎么不去你妈坟头坐着说, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/你话这么多怎么不去你妈坟头坐着说.class */
public final class C0033 extends d2 {
    @Override // top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        IBinder iBinder = (IBinder) d2.m119(objArr, IBinder.class);
        if (iBinder != null) {
            ExecutorService executorService = AbstractC0030.f466;
            AbstractC0030.f466.execute(() -> {
                m631(r0);
            });
        }
        return method.invoke(obj, objArr);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m631(IBinder iBinder) {
        l6.f212xaa30c2c7.m222((v1) -> {
            return m630(r1, v1);
        });
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Unit m630(IBinder iBinder, s0 s0Var) {
        s0Var.mo335(iBinder);
        return Unit.INSTANCE;
    }
}
