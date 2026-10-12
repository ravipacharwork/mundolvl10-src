package top.bienvenido.date_24323;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/t3.class */
public abstract class t3 {
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static ActivityInfo m487(Intent intent) {
        ResolveInfo resolveInfo;
        try {
            if (!f4.f91) {
                return null;
            }
            if (f4.f96) {
                resolveInfo = (ResolveInfo) e5.f77xaa30c2c7.m222((v1) -> {
                    return m485(r1, v1);
                });
            } else {
                Context context = b3.f17;
                resolveInfo = (ResolveInfo) b3.m57((v1) -> {
                    return m486(r0, v1);
                });
            }
            ResolveInfo resolveInfo2 = resolveInfo;
            if (resolveInfo2 == null) {
                return null;
            }
            ActivityInfo activityInfo = resolveInfo2.activityInfo;
            if (activityInfo == null) {
                return null;
            }
            C0051.m649(((ComponentInfo) activityInfo).applicationInfo);
            return activityInfo;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final ResolveInfo m485(Intent intent, p0 p0Var) {
        return p0Var.mo274xaa30c2c7(intent, null, 0);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final ResolveInfo m486(Intent intent, PackageManager packageManager) {
        return packageManager.resolveActivity(intent, 512);
    }
}
