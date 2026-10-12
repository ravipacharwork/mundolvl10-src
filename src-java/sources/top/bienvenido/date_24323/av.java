package top.bienvenido.date_24323;

import android.content.ComponentName;
import android.os.IBinder;
import java.lang.reflect.Method;
import top.bienvenido.mundo.blockade.sm.C0082;

/* JADX INFO: renamed from: top.bienvenido.date_24323.你妈av公众于世啦快去看看, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/你妈av公众于世啦快去看看.class */
public final class av extends C0082 {
    @Override // top.bienvenido.mundo.blockade.sm.C0082, top.bienvenido.date_24323.n1, top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        try {
            if (f4.f91) {
                ComponentName componentName = (ComponentName) d2.m119(objArr, ComponentName.class);
                IBinder iBinder = (IBinder) d2.m119(objArr, IBinder.class);
                Integer num = (Integer) d2.m119(objArr, Integer.class);
                Boolean bool = (Boolean) e4.f76xaa30c2c7.m222((v3) -> {
                    return m597(r1, r2, r3, v3);
                });
                if (bool != null && bool.booleanValue()) {
                    return Boolean.TRUE;
                }
            }
        } catch (Exception unused) {
        }
        return super.mo1(obj, method, objArr);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final boolean m597(ComponentName componentName, IBinder iBinder, Integer num, f0 f0Var) {
        return f0Var.mo78(componentName, iBinder, num != null ? num.intValue() : -1);
    }
}
