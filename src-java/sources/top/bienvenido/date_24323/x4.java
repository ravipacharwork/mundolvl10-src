package top.bienvenido.date_24323;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Debug;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/x4.class */
public abstract class x4 {
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static ActivityInfo m558(Intent intent, String str) {
        ResolveInfo resolveInfo;
        r5 r5Var = r5.f290;
        r5Var.getClass();
        if (r5.f291.containsKey(str)) {
            resolveInfo = (ResolveInfo) CollectionsKt.firstOrNull(q1.m429(r5Var.mo271(intent, null, 0)));
        } else {
            Context context = b3.f17;
            resolveInfo = (ResolveInfo) b3.m57((v1) -> {
                return m556(r0, v1);
            });
        }
        if (resolveInfo != null) {
            return resolveInfo.activityInfo;
        }
        return null;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final ResolveInfo m556(Intent intent, PackageManager packageManager) {
        return packageManager.resolveActivity(intent, 0);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static ActivityInfo m559(String str) {
        Intent intent = new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER").setPackage(str);
        if (Debug.isDebuggerConnected()) {
            intent.setPackage("com.android.vending");
        }
        ActivityInfo activityInfoM558 = m558(intent, str);
        if (activityInfoM558 != null) {
            return activityInfoM558;
        }
        intent.removeCategory("android.intent.category.LAUNCHER");
        Unit unit = Unit.INSTANCE;
        return m558(intent.addCategory("android.intent.category.INFO"), str);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static int m560(String str, boolean z) {
        ApplicationInfo applicationInfoMo266;
        if (z) {
            applicationInfoMo266 = r5.f290.mo266(str, 0);
        } else {
            Context context = b3.f17;
            applicationInfoMo266 = (ApplicationInfo) b3.m57((v1) -> {
                return m557(r0, v1);
            });
        }
        if (applicationInfoMo266 != null) {
            return applicationInfoMo266.uid;
        }
        return -1;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final ApplicationInfo m557(String str, PackageManager packageManager) {
        return packageManager.getApplicationInfo(str, 512);
    }
}
