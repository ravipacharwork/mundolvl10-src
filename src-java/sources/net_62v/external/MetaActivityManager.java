package net_62v.external;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import java.util.List;
import top.bienvenido.date_24323.e4;
import top.bienvenido.date_24323.e5;
import top.bienvenido.date_24323.f0;
import top.bienvenido.date_24323.l6;
import top.bienvenido.date_24323.p0;
import top.bienvenido.date_24323.r1;
import top.bienvenido.date_24323.s0;
import top.bienvenido.date_24323.x5;
import top.bienvenido.mundo.manifest.MundoSplashLauncher;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:net_62v/external/MetaActivityManager.class */
public final class MetaActivityManager {
    public static void launchAppWithSplash(Context context, String str) {
        launchAppWithSplash(context, str, "0");
    }

    public static Intent obtainSplashLaunchIntent(String str, Context context) {
        return obtainSplashLaunchIntent("0", str, context);
    }

    public static void launchApp(String str) {
        launchApp("0", str);
    }

    public static void launchActivityExistingAppProcess(String str) {
        launchActivityExistingAppProcess(str, "0");
    }

    public static void initialize(Context context) {
        r1.f287 = context;
        x5.m561();
    }

    public static boolean isAppRunning(String str) {
        return isAppRunning(str, "0");
    }

    public static void launchExistingApp(String str, String str2) {
        ((s0) l6.f212xaa30c2c7.m221()).mo334xb7bf1d91(str, str2);
    }

    public static void killAllApps() {
        ((f0) e4.f76xaa30c2c7.m221()).mo88((String) null, (String) null);
    }

    public static void launchIntent(Intent intent) {
        launchIntent(intent, "0");
    }

    public static void startService(Intent intent, String str) {
        ((f0) e4.f76xaa30c2c7.m221()).mo76xaa30c2c7(intent, str);
    }

    public static void killAppByPkg(String str) {
        ((f0) e4.f76xaa30c2c7.m221()).mo88(str, (String) null);
    }

    public static int broadcastIntentAsUser(Intent intent, String str) {
        return ((f0) e4.f76xaa30c2c7.m221()).mo87(intent, str);
    }

    public static void acquirePreloadNextProcess() {
        ((f0) e4.f76xaa30c2c7.m221()).mo90();
    }

    public static List<ActivityManager.RunningAppProcessInfo> getRunningProcessInfo(String str) {
        return ((f0) e4.f76xaa30c2c7.m221()).mo83(0);
    }

    public static void finishApplicationActivity(String str, String str2) {
        ((s0) l6.f212xaa30c2c7.m221()).mo342xaa30c2c7(str, str2);
    }

    public static String[] getRunningAppInfoByPid(int i) {
        return ((f0) e4.f76xaa30c2c7.m221()).mo84(i);
    }

    public static void setAppProxyUri(String str) {
        ((f0) e4.f76xaa30c2c7.m221()).mo925(str);
    }

    public static void launchAppWithSplash(Context context, String str, String str2) {
        Intent intentObtainSplashLaunchIntent = obtainSplashLaunchIntent(str2, str, context);
        if (intentObtainSplashLaunchIntent != null) {
            intentObtainSplashLaunchIntent.addFlags(268435456);
            context.startActivity(intentObtainSplashLaunchIntent);
        }
    }

    public static void launchActivityExistingAppProcess(String str, String str2) {
        ((s0) l6.f212xaa30c2c7.m221()).mo334xb7bf1d91(str, str2);
    }

    public static boolean isAppRunning(String str, String str2) {
        return ((f0) e4.f76xaa30c2c7.m221()).mo89(str, str2);
    }

    public static void launchApp(int i, String str) {
        launchApp(String.valueOf(i), str);
    }

    public static Intent obtainSplashLaunchIntent(int i, String str, Context context) {
        return obtainSplashLaunchIntent(String.valueOf(i), str, context);
    }

    public static void launchIntent(Intent intent, int i) {
        launchIntent(intent, String.valueOf(i));
    }

    public static void startService(Intent intent, int i) {
        startService(intent, String.valueOf(i));
    }

    public static int broadcastIntentAsUser(Intent intent, int i) {
        return broadcastIntentAsUser(intent, String.valueOf(i));
    }

    public static void killAppByPkg(String str, String str2) {
        ((f0) e4.f76xaa30c2c7.m221()).mo88(str2, str);
    }

    public static void setAppProxyUri(String str, String str2, String str3) {
        ((f0) e4.f76xaa30c2c7.m221()).mo93(str, str2, str3);
    }

    public static boolean isAppRunning(String str, int i) {
        return isAppRunning(str, String.valueOf(i));
    }

    public static void killAppByPkg(int i, String str) {
        killAppByPkg(String.valueOf(i), str);
    }

    public static void launchApp(String str, String str2) {
        ((s0) l6.f212xaa30c2c7.m221()).mo334xb7bf1d91(str2, str);
    }

    public static Intent obtainSplashLaunchIntent(String str, String str2, Context context) {
        if (!((p0) e5.f77xaa30c2c7.m221()).mo292xaa30c2c7(str2)) {
            launchApp(str, str2);
            return null;
        }
        if (((s0) l6.f212xaa30c2c7.m221()).mo341(str2, str)) {
            return null;
        }
        Intent intent = new Intent(context, (Class<?>) MundoSplashLauncher.class);
        intent.putExtra("mundo_base_string", str2);
        intent.putExtra("mundo_base_bundle", str);
        return intent;
    }

    public static void launchIntent(Intent intent, String str) {
        ((s0) l6.f212xaa30c2c7.m221()).mo330(intent, str);
    }
}
