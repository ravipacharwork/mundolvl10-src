package net_62v.external;

import android.content.Context;
import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.util.Objects;
import kotlin.Pair;
import top.bienvenido.date_24323.b3;
import top.bienvenido.date_24323.b9;
import top.bienvenido.date_24323.d1;
import top.bienvenido.date_24323.d2;
import top.bienvenido.date_24323.q1;
import top.bienvenido.date_24323.r4;
import top.bienvenido.date_24323.t0;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:net_62v/external/MetaCore.class */
public final class MetaCore {
    public static Context getHostContext() {
        Context context = b3.f17;
        return b3.f17;
    }

    public static void attachMetaBase(Context context) {
        MetaActivityManager.initialize(context);
    }

    public static void registerCoreCallback(Runnable runnable) {
        new Thread(() -> {
            try {
                MetaPackageManager.waitForBackgroundScanner();
                runnable.run();
            } catch (Exception unused) {
            }
        }).start();
    }

    public static void setProcessLifecycleCallback(IMundoProcessCallback iMundoProcessCallback) {
        t0.f327 = iMundoProcessCallback == null ? null : new C0000(iMundoProcessCallback);
    }

    public static InvocationHandler addServiceInterpreter(String str, String str2, InvocationHandler invocationHandler) {
        Pair pair = (Pair) b9.f29.m385(str.hashCode());
        d1 d1Var = pair != null ? (d1) pair.getSecond() : null;
        if (d1Var == null) {
            return null;
        }
        d2 d2Var = (d2) d1Var.f54.m385(str2.hashCode());
        d2 d2Var2 = d2Var;
        if (d2Var == null) {
            d2Var2 = d1Var.f56;
        }
        d2 d2Var3 = d2Var2;
        d1Var.f54.m386(str2.hashCode(), new C0001(invocationHandler));
        Objects.requireNonNull(d2Var3);
        return d2Var3::mo1;
    }

    public static void enableCrashReport() {
        r4.m440();
    }

    public static File[] obtainAllCrashLogs() {
        Context context = b3.f17;
        File fileM428 = q1.m428(b3.f17.getCacheDir(), "mundo_crash");
        fileM428.mkdirs();
        File[] fileArrListFiles = fileM428.listFiles();
        return fileArrListFiles == null ? new File[0] : fileArrListFiles;
    }

    public static void clearAllCrashLogFiles() {
        Context context = b3.f17;
        File fileM428 = q1.m428(b3.f17.getCacheDir(), "mundo_crash");
        fileM428.mkdirs();
        File[] fileArrListFiles = fileM428.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                file.delete();
            }
        }
    }
}
