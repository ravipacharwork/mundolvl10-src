package net_62v.external;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import top.bienvenido.date_24323.e5;
import top.bienvenido.date_24323.p0;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:net_62v/external/MetaPackageManager.class */
public final class MetaPackageManager {
    @Deprecated
    public static void deleteAppCache(String str) {
    }

    @Deprecated
    public static void deleteAllAppCache() {
    }

    public static List<String> getInstalledInnerApps() {
        return ((p0) e5.f77xaa30c2c7.m221()).mo299();
    }

    public static List<PackageInfo> getInstalledPackageInfos() {
        return ((p0) e5.f77xaa30c2c7.m221()).mo296(0);
    }

    public static List<ApplicationInfo> getInstalledApplicationInfos() {
        return ((p0) e5.f77xaa30c2c7.m221()).mo297xaa30c2c7(0);
    }

    public static boolean isAppInstalledAsInternal(String str) {
        return ((p0) e5.f77xaa30c2c7.m221()).mo264(str);
    }

    public static ActivityInfo resolveIntentActivity(Intent intent) {
        ResolveInfo resolveInfoMo274xaa30c2c7 = ((p0) e5.f77xaa30c2c7.m221()).mo274xaa30c2c7(intent, null, 0);
        if (resolveInfoMo274xaa30c2c7 != null) {
            return resolveInfoMo274xaa30c2c7.activityInfo;
        }
        return null;
    }

    public static boolean isInnerAppInstalled(String str) {
        return ((p0) e5.f77xaa30c2c7.m221()).mo263x541a43c1(str);
    }

    public static void waitForBackgroundScanner() {
        ((p0) e5.f77xaa30c2c7.m221()).mo289xb7bf1d91();
    }

    public static void uninstallAppFully(String str) {
        ((p0) e5.f77xaa30c2c7.m221()).mo287(str, (String) null);
    }

    public static PackageInfo getPackageInfo(String str) {
        return ((p0) e5.f77xaa30c2c7.m221()).mo265(str, 0);
    }

    public static ApplicationInfo getApplicationInfo(String str) {
        return ((p0) e5.f77xaa30c2c7.m221()).mo266(str, 0);
    }

    public static ActivityInfo getReceiverInfo(ComponentName componentName) {
        return ((p0) e5.f77xaa30c2c7.m221()).mo268(componentName);
    }

    public static void acquireObtainAppSplash() {
        ((p0) e5.f77xaa30c2c7.m221()).mo291(0);
    }

    public static void acquireReleaseAppSplash() {
        ((p0) e5.f77xaa30c2c7.m221()).mo291(1);
    }

    public static boolean isAppSplashExists(String str) {
        return ((p0) e5.f77xaa30c2c7.m221()).mo292xaa30c2c7(str);
    }

    public static PackageInfo getInnerAppPackageInfo(String str, int i) {
        return ((p0) e5.f77xaa30c2c7.m221()).mo265(str, i);
    }

    public static Intent getLaunchIntentForPackage(Intent intent) {
        ActivityInfo activityInfoResolveIntentActivity = resolveIntentActivity(intent);
        if (activityInfoResolveIntentActivity == null) {
            return null;
        }
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(activityInfoResolveIntentActivity.packageName, activityInfoResolveIntentActivity.name));
        intent2.setAction("android.intent.action.MAIN");
        return intent2;
    }

    public static String[] getInstalledUserName(String str) {
        return ((p0) e5.f77xaa30c2c7.m221()).mo288xb7bf1d91(str);
    }

    public static void createEmptyUser(String str, String str2) {
        ((p0) e5.f77xaa30c2c7.m221()).mo286(str, str2);
    }

    public static int[] getInstalledUserId(String str) {
        boolean z;
        try {
            ArrayList arrayList = new ArrayList();
            String[] installedUserName = getInstalledUserName(str);
            if (installedUserName != null) {
                for (String str2 : installedUserName) {
                    int length = str2.length();
                    while (true) {
                        int i = length - 1;
                        length = i;
                        if (i < 0) {
                            z = true;
                            break;
                        }
                        char cCharAt = str2.charAt(length);
                        if (cCharAt < '0' || cCharAt > '9') {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        arrayList.add(Integer.valueOf(str2));
                    }
                }
            }
            Collections.sort(arrayList);
            int size = arrayList.size();
            int[] iArr = new int[size];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
            }
            return size == 0 ? new int[]{0} : iArr;
        } catch (Exception unused) {
            return new int[0];
        }
    }

    public static void createEmptyUserById(String str) {
        try {
            int i = 0;
            while (Arrays.binarySearch(getInstalledUserId(str), i) >= 0) {
                i++;
            }
            createEmptyUser(str, String.valueOf(i));
        } catch (Exception unused) {
        }
    }

    public static void cleanPackageDataAsUser(String str, String str2) {
        ((p0) e5.f77xaa30c2c7.m221()).mo287(str, str2);
    }

    public static List<ResolveInfo> queryIntentActivities(Intent intent, String str, int i) {
        return ((p0) e5.f77xaa30c2c7.m221()).mo271(intent, str, i);
    }

    public static List<ResolveInfo> queryIntentReceivers(Intent intent, String str, int i) {
        return ((p0) e5.f77xaa30c2c7.m221()).mo272(intent, str, i);
    }

    public static List<ResolveInfo> queryIntentProviders(Intent intent, String str, int i) {
        return ((p0) e5.f77xaa30c2c7.m221()).mo276(intent, str, i);
    }

    public static List<ResolveInfo> queryIntentServices(Intent intent, String str, int i) {
        return ((p0) e5.f77xaa30c2c7.m221()).mo275(intent, str, i);
    }

    public static ActivityInfo resolveActivityInfo(Intent intent) {
        ResolveInfo resolveInfoMo274xaa30c2c7 = ((p0) e5.f77xaa30c2c7.m221()).mo274xaa30c2c7(intent, null, 131072);
        if (resolveInfoMo274xaa30c2c7 != null) {
            return resolveInfoMo274xaa30c2c7.activityInfo;
        }
        return null;
    }

    public static Intent getLaunchIntent(String str) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.INFO");
        intent.setPackage(str);
        e5 e5Var = e5.f77xaa30c2c7;
        ResolveInfo resolveInfoMo274xaa30c2c7 = ((p0) e5Var.m221()).mo274xaa30c2c7(intent, null, 131072);
        ResolveInfo resolveInfoMo274xaa30c2c8 = resolveInfoMo274xaa30c2c7;
        if (resolveInfoMo274xaa30c2c7 == null) {
            intent.removeCategory("android.intent.category.INFO");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setPackage(str);
            resolveInfoMo274xaa30c2c8 = ((p0) e5Var.m221()).mo274xaa30c2c7(intent, null, 131072);
        }
        if (resolveInfoMo274xaa30c2c8 == null) {
            return null;
        }
        intent.setFlags(268435456);
        ActivityInfo activityInfo = resolveInfoMo274xaa30c2c8.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        return intent;
    }

    public static boolean fixInternalAppAndReinstall(String str) {
        return ((p0) e5.f77xaa30c2c7.m221()).mo290(str);
    }

    public static void reloadAllApps() {
        ((p0) e5.f77xaa30c2c7.m221()).mo290((String) null);
    }

    public static void createEmptyUser(String str, int i) {
        try {
            if (Arrays.binarySearch(getInstalledUserId(str), i) < 0) {
                createEmptyUser(str, String.valueOf(i));
            }
        } catch (Exception unused) {
        }
    }

    public static void cleanPackageDataAsUser(String str, int i) {
        ((p0) e5.f77xaa30c2c7.m221()).mo287(str, String.valueOf(i));
    }

    public static ActivityInfo resolveActivityInfo(ComponentName componentName) {
        return ((p0) e5.f77xaa30c2c7.m221()).mo267(componentName);
    }
}
