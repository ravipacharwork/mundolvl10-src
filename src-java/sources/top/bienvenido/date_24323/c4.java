package top.bienvenido.date_24323;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.Method;
import kotlin.collections.ArraysKt;
import top.bienvenido.mundo.blockade.sm.C0082;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/c4.class */
public final class c4 extends C0082 {

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final c4 f38 = new c4();

    @Override // top.bienvenido.mundo.blockade.sm.C0082, top.bienvenido.date_24323.n1, top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        if (f4.f91) {
            try {
                Class<?>[] parameterTypes = method.getParameterTypes();
                int i = 0;
                int length = objArr.length;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    }
                    if (Intent.class.isInstance(objArr[i])) {
                        break;
                    }
                    i++;
                }
                if (i >= 0) {
                    int iIndexOf = ArraysKt.indexOf(parameterTypes, IBinder.class);
                    IBinder iBinder = iIndexOf >= 0 ? (IBinder) objArr[iIndexOf] : null;
                    Intent intent = (Intent) objArr[i];
                    IBinder iBinder2 = iBinder;
                    Intent intent2 = (Intent) l6.f212xaa30c2c7.m222((v3) -> {
                        return m102(r1, r2, r3, v3);
                    });
                    if (intent2 != null) {
                        objArr[i] = intent2;
                        if (AbstractC0065x6082d607.f5065) {
                            Bundle bundle = (Bundle) d2.m119(objArr, Bundle.class);
                            if (bundle != null) {
                                bundle.remove("android.activity.activityType");
                                bundle.remove("android.activity.launchTypeBubble");
                                bundle.remove("android.activity.alwaysOnTop");
                                bundle.remove("android:activity.remoteTransition");
                                bundle.remove("android:activity.remoteAnimationAdapter");
                                bundle.remove("android.activity.dismissKeyguardIfInsecure");
                                bundle.remove("android:activity.overrideTaskTransition");
                                bundle.remove("android:activity.lockTaskMode");
                                bundle.remove("android.activity.launchDisplayId");
                                bundle.remove("android.activity.launchTaskDisplayAreaToken");
                                bundle.remove("android.activity.transientLaunch");
                                bundle.remove("android.activity.launchTaskId");
                                bundle.remove("android.activity.disableStarting");
                            }
                        }
                    } else {
                        objArr[i] = r8.m469(intent);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return super.mo1(obj, method, objArr);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Intent m102(IBinder iBinder, Intent intent, Object[] objArr, s0 s0Var) {
        int i = f4.f97xb7bf1d91;
        Number number = (Number) d2.m119(objArr, Number.class);
        return s0Var.mo328(iBinder, intent, i, (number != null ? number.intValue() : -1) >= 0);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m104(d1 d1Var) {
        d1Var.m118(new int[]{-1528850031, 1188583438, -1938750181, 1002006553, -764358898, -932892417, 1441231458}, this);
        if (AbstractC0065x6082d607.f510x541a43c1) {
            SM.m634();
        }
        d1Var.f54.m386(1076229154, new y3());
        d1Var.f54.m386(-346076689, new z3());
        d1Var.f54.m386(1965957592, new a4());
        d1Var.f54.m386(1621249213, new b4());
    }
}
