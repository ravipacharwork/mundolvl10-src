package top.bienvenido.date_24323;

import android.app.IServiceConnection;
import java.lang.reflect.Method;
import top.bienvenido.mundo.blockade.sm.C0082;

/* JADX INFO: renamed from: top.bienvenido.date_24323.自己犯贱送的妈就别怪人让你去赎她, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/自己犯贱送的妈就别怪人让你去赎她.class */
public final class C0074 extends C0082 {
    @Override // top.bienvenido.mundo.blockade.sm.C0082, top.bienvenido.date_24323.n1, top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        try {
            if (f4.f91) {
                IServiceConnection iServiceConnection = (IServiceConnection) d2.m119(objArr, IServiceConnection.class);
                if (iServiceConnection != null) {
                    Boolean bool = (Boolean) e4.f76xaa30c2c7.m222((v1) -> {
                        return m680(r1, v1);
                    });
                    if (bool != null && bool.booleanValue()) {
                        return Boolean.TRUE;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return super.mo1(obj, method, objArr);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final boolean m680(IServiceConnection iServiceConnection, f0 f0Var) {
        return f0Var.mo80(iServiceConnection.asBinder());
    }
}
