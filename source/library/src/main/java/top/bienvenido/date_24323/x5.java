package top.bienvenido.date_24323;

import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/x5.class */
public abstract class x5 {
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m561() {
        Object objInvoke;
        if (Build.VERSION.SDK_INT >= 28) {
            String[] strArr = {"L"};
            try {
                w4 w4Var = new w4(Class.forName("dalvik.system.VMRuntime"));
                Object[] objArr = i.f160;
                int i = 0;
                int i2 = w4Var.f382;
                while (true) {
                    if (i >= i2) {
                        objInvoke = null;
                        break;
                    }
                    ca.f51.putLong(w4Var.f383, w4Var.f380, (((long) i) * w4Var.f381) + w4Var.f384xaa30c2c7);
                    if (Intrinsics.areEqual("getRuntime", w4Var.f383.getName())) {
                        objInvoke = w4Var.f383.invoke(null, objArr);
                        break;
                    }
                    i++;
                }
                String[][] strArr2 = new String[1][];
                strArr2[0] = strArr;
                int i3 = w4Var.f382;
                for (int i4 = 0; i4 < i3; i4++) {
                    ca.f51.putLong(w4Var.f383, w4Var.f380, (((long) i4) * w4Var.f381) + w4Var.f384xaa30c2c7);
                    if (Intrinsics.areEqual("setHiddenApiExemptions", w4Var.f383.getName())) {
                        w4Var.f383.invoke(objInvoke, strArr2);
                        return;
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
