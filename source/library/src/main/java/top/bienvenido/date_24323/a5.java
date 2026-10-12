package top.bienvenido.date_24323;

import android.app.ActivityThread;
import android.app.Application;
import android.app.Instrumentation;
import android.app.LoadedApk;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.IIntentReceiver;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/a5.class */
public abstract class a5 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final u2 f4;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final Object f5;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final void m14(Intent intent, String str) {
        try {
            if (f4.f91) {
                if (intent.getComponent() == null) {
                    intent.setComponent(new ComponentName(f4.f92, str));
                }
                h6.f130.getClass();
                LoadedApk loadedApk = (LoadedApk) h6.f145.invoke();
                h6.f132.post(() -> {
                    m13(r1, r2, r3);
                });
            }
        } catch (Exception unused) {
        }
    }

    static {
        u2 s2Var;
        Object objAllocateInstance;
        r2 r2Var;
        try {
            Field declaredField = BroadcastReceiver.class.getDeclaredField("mPendingResult");
            declaredField.setAccessible(true);
            if ((declaredField.getModifiers() & 8) == 0 && !declaredField.getType().isPrimitive()) {
                s2Var = new s2(ca.f51.objectFieldOffset(declaredField));
            } else {
                s2Var = r2Var;
                r2Var = new r2(declaredField);
            }
        } catch (Exception unused) {
            s2Var = u2.f337;
        }
        f4 = s2Var;
        try {
            objAllocateInstance = ca.f51.allocateInstance(BroadcastReceiver.PendingResult.class);
            new p2("mInitialStickyHint").f270.mo394(objAllocateInstance, Boolean.TRUE);
        } catch (Exception unused2) {
            objAllocateInstance = null;
        }
        f5 = objAllocateInstance;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m16(IBinder iBinder, Intent intent) {
        ExecutorService executorService = AbstractC0030.f466;
        AbstractC0030.f467.execute(() -> {
            m12(r0, r1);
        });
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m17(Intent intent, String str) {
        ExecutorService executorService = AbstractC0030.f466;
        AbstractC0030.f467.execute(() -> {
            m14(r0, r1);
        });
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m13(LoadedApk loadedApk, Intent intent, String str) {
        BroadcastReceiver broadcastReceiverInstantiateReceiver;
        try {
            h6.f130.getClass();
            u2 u2Var = h6.f140dj;
            Instrumentation instrumentation = h6.f131.getInstrumentation();
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.FALSE;
            objArr[1] = instrumentation;
            Application application = (Application) u2Var.mo432((Object) loadedApk, objArr);
            ClassLoader classLoader = loadedApk.getClassLoader();
            intent.setExtrasClassLoader(classLoader);
            Context baseContext = application.getBaseContext();
            if (AbstractC0065x6082d607.f503) {
                broadcastReceiverInstantiateReceiver = loadedApk.getAppFactory().instantiateReceiver(classLoader, str, intent);
            } else {
                Constructor<?> declaredConstructor = classLoader.loadClass(str).getDeclaredConstructor(i.f159);
                declaredConstructor.setAccessible(true);
                broadcastReceiverInstantiateReceiver = (BroadcastReceiver) declaredConstructor.newInstance(i.f160);
            }
            BroadcastReceiver broadcastReceiver = broadcastReceiverInstantiateReceiver;
            f4.mo394(broadcastReceiver, f5);
            broadcastReceiver.onReceive(baseContext, intent);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final void m12(IBinder iBinder, Intent intent) {
        try {
            boolean z = AbstractC0065x6082d607.f498;
            if (AbstractC0065x6082d607.f508) {
                h6.f130.getClass();
                ActivityThread.ApplicationThread applicationThread = h6.f131.getApplicationThread();
                IIntentReceiver iIntentReceiverAsInterface = IIntentReceiver.Stub.asInterface(iBinder);
                Bundle bundle = Bundle.EMPTY;
                Context context = b3.f17;
                applicationThread.scheduleRegisteredReceiver(iIntentReceiverAsInterface, intent, -1, (String) null, bundle, false, false, true, b3.f20, 20, -1, (String) null);
                return;
            }
            IIntentReceiver iIntentReceiverAsInterface2 = IIntentReceiver.Stub.asInterface(iBinder);
            Bundle bundle2 = Bundle.EMPTY;
            Context context2 = b3.f17;
            iIntentReceiverAsInterface2.performReceive(intent, -1, (String) null, bundle2, false, false, b3.f19);
        } catch (Throwable unused) {
        }
    }
}
