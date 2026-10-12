package top.bienvenido.date_24323;

import android.content.pm.IOnChecksumsReadyListener;
import java.lang.reflect.Method;
import java.util.Collections;
import top.bienvenido.mundo.blockade.sm.C0082;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/e7.class */
public final class e7 extends C0082 {
    @Override // top.bienvenido.mundo.blockade.sm.C0082, top.bienvenido.date_24323.n1, top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        try {
            Object obj2 = objArr[0];
            String string = obj2 != null ? obj2.toString() : null;
            if (string != null) {
                String str = string;
                Boolean bool = (Boolean) e5.f77xaa30c2c7.m222((v1) -> {
                    return m134(r1, v1);
                });
                if (bool != null ? bool.booleanValue() : false) {
                    IOnChecksumsReadyListener iOnChecksumsReadyListener = (IOnChecksumsReadyListener) d2.m119(objArr, IOnChecksumsReadyListener.class);
                    if (iOnChecksumsReadyListener == null) {
                        return null;
                    }
                    iOnChecksumsReadyListener.onChecksumsReady(Collections.EMPTY_LIST);
                    return null;
                }
            }
        } catch (Throwable unused) {
        }
        return super.mo1(obj, method, objArr);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final boolean m134(String str, p0 p0Var) {
        return p0Var.mo264(str);
    }
}
