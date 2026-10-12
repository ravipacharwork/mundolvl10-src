package top.bienvenido.date_24323;

import android.content.Intent;
import android.os.IBinder;
import java.lang.reflect.Method;
import kotlin.collections.ArraysKt;
import top.bienvenido.mundo.blockade.sm.C0082;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/y3.class */
public final class y3 extends C0082 {
    @Override // top.bienvenido.mundo.blockade.sm.C0082, top.bienvenido.date_24323.n1, top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        try {
            Class<?>[] parameterTypes = method.getParameterTypes();
            int iLastIndexOf = ArraysKt.lastIndexOf(parameterTypes, IBinder.class);
            if (iLastIndexOf >= 0) {
                int iIndexOf = ArraysKt.indexOf(parameterTypes, Intent.class);
                if (iIndexOf >= 0) {
                    objArr[iIndexOf] = a1.m4((IBinder) objArr[iLastIndexOf], (Intent) objArr[iIndexOf]);
                }
            }
        } catch (Exception unused) {
        }
        return super.mo1(obj, method, objArr);
    }
}
