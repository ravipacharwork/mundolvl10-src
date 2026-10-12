package top.bienvenido.date_24323;

import android.content.ComponentName;
import java.lang.reflect.Method;
import top.bienvenido.mundo.blockade.sm.C0082;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/b7.class */
public final class b7 extends C0082 {
    @Override // top.bienvenido.mundo.blockade.sm.C0082, top.bienvenido.date_24323.n1, top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        try {
            ComponentName componentName = (ComponentName) objArr[0];
            if (componentName != null) {
                Integer num = (Integer) e5.f77xaa30c2c7.m222((v1) -> {
                    return m65(r1, v1);
                });
                if (num != null) {
                    int iIntValue = num.intValue();
                    if (iIntValue >= 0) {
                        return Integer.valueOf(iIntValue);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return super.mo1(obj, method, objArr);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final int m65(ComponentName componentName, p0 p0Var) {
        return p0Var.mo295(componentName);
    }
}
