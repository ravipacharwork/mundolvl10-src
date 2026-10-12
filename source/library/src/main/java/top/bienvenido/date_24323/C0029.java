package top.bienvenido.date_24323;

import android.content.IIntentReceiver;
import android.content.IntentFilter;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import top.bienvenido.mundo.blockade.sm.C0082;

/* JADX INFO: renamed from: top.bienvenido.date_24323.你的菊花开在你的坟头, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/你的菊花开在你的坟头.class */
public final class C0029 extends C0082 {
    @Override // top.bienvenido.mundo.blockade.sm.C0082, top.bienvenido.date_24323.n1, top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        try {
            if (f4.f91) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                int length = objArr.length - 1;
                if (AbstractC0065x6082d607.f507) {
                    Object obj2 = objArr[length];
                    if ((obj2 instanceof Integer) && (((Number) obj2).intValue() & 2) == 0 && (((Number) obj2).intValue() & 4) == 0) {
                        objArr[length] = Integer.valueOf(((Number) obj2).intValue() | 2);
                    }
                }
                while (length > 0) {
                    int i = length;
                    int i2 = i - 1;
                    if (Intrinsics.areEqual(parameterTypes[i], String.class)) {
                        objArr[length] = null;
                        break;
                    }
                    length = i2;
                }
                IntentFilter intentFilter = (IntentFilter) d2.m119(objArr, IntentFilter.class);
                IIntentReceiver iIntentReceiver = (IIntentReceiver) d2.m119(objArr, IIntentReceiver.class);
                if (intentFilter != null && iIntentReceiver != null) {
                    ExecutorService executorService = AbstractC0030.f466;
                    AbstractC0030.f466.execute(() -> {
                        m624(r0, r1);
                    });
                }
            }
        } catch (Exception unused) {
        }
        return super.mo1(obj, method, objArr);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Unit m623(IIntentReceiver iIntentReceiver, IntentFilter intentFilter, f0 f0Var) {
        f0Var.mo85(f4.f97xb7bf1d91, iIntentReceiver.asBinder(), intentFilter);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m624(IIntentReceiver iIntentReceiver, IntentFilter intentFilter) {
        e4.f76xaa30c2c7.m222((v2) -> {
            return m623(r1, r2, v2);
        });
    }
}
