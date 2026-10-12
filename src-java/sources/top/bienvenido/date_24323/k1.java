package top.bienvenido.date_24323;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/k1.class */
public final class k1 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final k1 f194 = new k1();

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static n9 f195 = new n9(0);

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m237() {
        PackageInfo packageInfo;
        try {
            String str = f4.f92;
            String str2 = f4.f93;
            if (f4.f96) {
                packageInfo = (PackageInfo) e5.f77xaa30c2c7.m222((v1) -> {
                    return m234(r1, v1);
                });
            } else {
                Context context = b3.f17;
                packageInfo = (PackageInfo) b3.m57((v1) -> {
                    return m235(r0, v1);
                });
            }
            PackageInfo packageInfo2 = packageInfo;
            if (packageInfo2 != null) {
                ActivityInfo[] activityInfoArr = packageInfo2.activities;
                if (activityInfoArr != null) {
                    n9 n9Var = new n9(activityInfoArr.length);
                    ApplicationInfo applicationInfo = activityInfoArr[0].applicationInfo;
                    C0051.m649(applicationInfo);
                    for (ActivityInfo activityInfo : activityInfoArr) {
                        if (Intrinsics.areEqual(activityInfo.processName, str2) || (activityInfo.flags & 1) != 0) {
                            int iHashCode = activityInfo.name.hashCode();
                            activityInfo.applicationInfo = applicationInfo;
                            activityInfo.enabled = true;
                            Unit unit = Unit.INSTANCE;
                            n9Var.m386(iHashCode, activityInfo);
                        }
                    }
                    f195 = n9Var;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final PackageInfo m234(String str, p0 p0Var) {
        return p0Var.mo265(str, 1);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final PackageInfo m235(String str, PackageManager packageManager) {
        return packageManager.getPackageInfo(str, 513);
    }
}
