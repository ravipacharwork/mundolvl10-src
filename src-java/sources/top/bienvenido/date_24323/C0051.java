package top.bienvenido.date_24323;

import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: top.bienvenido.date_24323.我他妈把你塞进你婊子妈的子宫里再找几根机吧给你搅合搅合让你这个杂种涅槃重生, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/我他妈把你塞进你婊子妈的子宫里再找几根机吧给你搅合搅合让你这个杂种涅槃重生.class */
public final class C0051 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final C0051 f482 = new C0051();

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m650(ComponentInfo[] componentInfoArr, ApplicationInfo applicationInfo) {
        if (componentInfoArr != null) {
            for (ComponentInfo componentInfo : componentInfoArr) {
                componentInfo.applicationInfo = applicationInfo;
            }
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static boolean m649(ApplicationInfo applicationInfo) {
        try {
            if (!Intrinsics.areEqual(applicationInfo.packageName, f4.f92)) {
                return false;
            }
            applicationInfo.packageName = f4.f92;
            applicationInfo.uid = b3.f19;
            applicationInfo.enabled = true;
            String str = f4.f95xaa30c2c7;
            applicationInfo.dataDir = str;
            if (!AbstractC0065x6082d607.f500) {
                return true;
            }
            applicationInfo.deviceProtectedDataDir = str;
            f9.f107.mo394(applicationInfo, str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
