package top.bienvenido.date_24323;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.ConfigurationInfo;
import android.content.pm.FeatureGroupInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageParser;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.SharedLibraryInfo;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/n2.class */
public final class n2 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final n2 f235 = new n2();

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m318(e2 e2Var, int i) {
        int iM321;
        boolean z;
        try {
            PackageInfo packageInfo = e2Var.f69;
            PackageParser.Package r0 = new PackageParser().parsePackage(new File(e2Var.f70.sourceDir), 0);
            ApplicationInfo applicationInfo = r0.applicationInfo;
            if (applicationInfo != null) {
                m320(applicationInfo, e2Var.f70);
                String str = packageInfo.packageName;
                if (ArraysKt.contains(n.f233, str.hashCode())) {
                    iM321 = m321("com.google");
                } else {
                    String str2 = packageInfo.sharedUserId;
                    iM321 = (str2 == null || str2.length() == 0) ? m321(str) : m321(str2);
                }
                applicationInfo.uid = (iM321 % 7000) + 13000;
                applicationInfo.enabled = true;
                applicationInfo.metaData = r0.mAppMetaData;
                applicationInfo.flags |= 8683588;
                packageInfo.applicationInfo = applicationInfo;
                e2Var.f70 = applicationInfo;
                o1 o1Var = new o1(r0.activities.size() + r0.receivers.size() + r0.services.size() + r0.providers.size());
                e2Var.f72 = o1Var;
                packageInfo.activities = (ActivityInfo[]) m323(r0.activities, o1Var, applicationInfo, new MutablePropertyReference1Impl() { // from class: top.bienvenido.date_24323.f2
                    public final Object get(Object obj) {
                        return ((PackageParser.Activity) obj).info;
                    }

                    public final void set(Object obj, Object obj2) {
                        ((PackageParser.Activity) obj).info = (ActivityInfo) obj2;
                    }
                }, g2.f115);
                packageInfo.receivers = (ActivityInfo[]) m323(r0.receivers, o1Var, applicationInfo, new MutablePropertyReference1Impl() { // from class: top.bienvenido.date_24323.h2
                    public final Object get(Object obj) {
                        return ((PackageParser.Activity) obj).info;
                    }

                    public final void set(Object obj, Object obj2) {
                        ((PackageParser.Activity) obj).info = (ActivityInfo) obj2;
                    }
                }, i2.f166);
                packageInfo.services = (ServiceInfo[]) m323(r0.services, o1Var, applicationInfo, new MutablePropertyReference1Impl() { // from class: top.bienvenido.date_24323.j2
                    public final Object get(Object obj) {
                        return ((PackageParser.Service) obj).info;
                    }

                    public final void set(Object obj, Object obj2) {
                        ((PackageParser.Service) obj).info = (ServiceInfo) obj2;
                    }
                }, k2.f196);
                ArrayList arrayList = r0.providers;
                int i2 = 0;
                int size = arrayList.size();
                int[] iArr = size == 0 ? i.f158 : new int[size];
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ProviderInfo providerInfo = ((PackageParser.Provider) it.next()).info;
                    String str3 = providerInfo.authority;
                    if (str3 != null) {
                        List<String> listSplit$default = StringsKt.split$default(str3, new char[]{';'}, false, 0, 6, (Object) null);
                        ArrayList arrayList2 = new ArrayList(listSplit$default.size());
                        for (String str4 : listSplit$default) {
                            int[] iArr2 = iArr;
                            int i3 = i2;
                            int iHashCode = str4.hashCode();
                            int iM2 = a.m2(iArr2, i3, iHashCode);
                            if (iM2 < 0) {
                                int i4 = iM2 ^ (-1);
                                int i5 = i2 + 1;
                                if (i5 <= iArr.length) {
                                    int[] iArr3 = iArr;
                                    System.arraycopy(iArr3, i4, iArr, i4 + 1, i2 - i4);
                                    iArr3[i4] = iHashCode;
                                } else {
                                    int[] iArr4 = iArr;
                                    int[] iArr5 = iArr;
                                    int[] iArr6 = new int[(i2 | 1) << 1];
                                    System.arraycopy(iArr, 0, iArr6, 0, i4);
                                    iArr6[i4] = iHashCode;
                                    System.arraycopy(iArr4, i4, iArr6, i4 + 1, iArr5.length - i4);
                                    iArr = iArr6;
                                }
                                z = true;
                                i2 = i5;
                            } else {
                                z = false;
                            }
                            if (z) {
                                arrayList2.add(str4);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            providerInfo.authority = null;
                        } else if (arrayList2.size() != listSplit$default.size()) {
                            providerInfo.authority = CollectionsKt.joinToString$default(arrayList2, ";", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
                packageInfo.providers = (ProviderInfo[]) m323(arrayList, o1Var, applicationInfo, new MutablePropertyReference1Impl() { // from class: top.bienvenido.date_24323.l2
                    public final Object get(Object obj) {
                        return ((PackageParser.Provider) obj).info;
                    }

                    public final void set(Object obj, Object obj2) {
                        ((PackageParser.Provider) obj).info = (ProviderInfo) obj2;
                    }
                }, m2.f223);
                String[] strArr = (String[]) r0.requestedPermissions.toArray(i.f161);
                packageInfo.requestedPermissions = strArr;
                int length = strArr.length;
                int[] iArr7 = new int[length];
                for (int i6 = 0; i6 < length; i6++) {
                    iArr7[i6] = 3;
                }
                packageInfo.requestedPermissionsFlags = iArr7;
                int[] iArr8 = i.f158;
                int[] iArr9 = iArr8;
                packageInfo.gids = iArr8;
                if (AbstractC0065x6082d607.f498) {
                    String[] strArr2 = packageInfo.splitNames;
                    if (strArr2 != null && strArr2.length != 0) {
                        iArr9 = new int[strArr2.length];
                    }
                    packageInfo.splitRevisionCodes = iArr9;
                }
                ArrayList arrayList3 = r0.reqFeatures;
                packageInfo.reqFeatures = arrayList3 != null ? (FeatureInfo[]) arrayList3.toArray(new FeatureInfo[0]) : null;
                ArrayList arrayList4 = r0.configPreferences;
                packageInfo.configPreferences = arrayList4 != null ? (ConfigurationInfo[]) arrayList4.toArray(new ConfigurationInfo[0]) : null;
                ArrayList<PackageParser.Instrumentation> arrayList5 = r0.instrumentation;
                ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
                for (PackageParser.Instrumentation instrumentation : arrayList5) {
                    InstrumentationInfo instrumentationInfo = instrumentation.info;
                    instrumentationInfo.metaData = instrumentation.metaData;
                    arrayList6.add(instrumentationInfo);
                }
                packageInfo.instrumentation = (InstrumentationInfo[]) arrayList6.toArray(new InstrumentationInfo[0]);
                ArrayList<PackageParser.Permission> arrayList7 = r0.permissions;
                ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
                for (PackageParser.Permission permission : arrayList7) {
                    PermissionInfo permissionInfo = permission.info;
                    permissionInfo.metaData = permission.metaData;
                    arrayList8.add(permissionInfo);
                }
                packageInfo.permissions = (PermissionInfo[]) arrayList8.toArray(new PermissionInfo[0]);
                ArrayList arrayList9 = r0.featureGroups;
                packageInfo.featureGroups = arrayList9 != null ? (FeatureGroupInfo[]) arrayList9.toArray(new FeatureGroupInfo[0]) : null;
                e2Var.f71xaa30c2c7 = new b2(r0);
                if (i != 0) {
                    Intent intent = new Intent(i == 1 ? "android.intent.action.PACKAGE_ADDED" : "android.intent.action.PACKAGE_REPLACED");
                    intent.setData(Uri.fromParts("package", packageInfo.packageName, null));
                    w3.f375.mo87(intent, (String) null);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m319(ApplicationInfo applicationInfo) {
        String[] strArr;
        if (AbstractC0065x6082d607.f504xb7bf1d91) {
            if (AbstractC0065x6082d607.f505) {
                strArr = new String[]{"/system/framework/org.apache.http.legacy.jar", "/system/framework/android.test.base.jar"};
            } else {
                strArr = new String[]{"/system/framework/org.apache.http.legacy.jar"};
            }
            p2 p2Var = f9.f100;
            List list = (List) p2Var.f270.mo393(applicationInfo);
            List list2 = list;
            if (list == null) {
                list2 = arrayList;
                ArrayList arrayList = new ArrayList(strArr.length);
                p2Var.f270.mo394(applicationInfo, list2);
            }
            for (String str : strArr) {
                SharedLibraryInfo sharedLibraryInfo = (SharedLibraryInfo) ca.f51.allocateInstance(SharedLibraryInfo.class);
                f9.f106xb7bf1d91.f270.mo394(sharedLibraryInfo, str);
                list2.add(sharedLibraryInfo);
            }
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m320(ApplicationInfo applicationInfo, ApplicationInfo applicationInfo2) {
        String str;
        try {
            String str2 = applicationInfo2.dataDir;
            applicationInfo.dataDir = str2;
            if (AbstractC0065x6082d607.f500) {
                applicationInfo.deviceProtectedDataDir = str2;
                f9.f107.mo394(applicationInfo, str2);
            }
            if (AbstractC0065x6082d607.f502xaa30c2c7) {
                applicationInfo.splitNames = applicationInfo2.splitNames;
            }
            if (AbstractC0065x6082d607.f503 && (applicationInfo.flags & 134217728) != 0) {
                f9.f105.f270.mo394((Object) applicationInfo, (Object) 0);
            }
            applicationInfo.sharedLibraryFiles = applicationInfo2.sharedLibraryFiles;
            m319(applicationInfo);
            String str3 = applicationInfo2.processName;
            if (str3 != null && str3.length() != 0) {
                str = applicationInfo2.processName;
            } else {
                str = applicationInfo.packageName;
            }
            applicationInfo.processName = str;
            applicationInfo.nativeLibraryDir = applicationInfo2.nativeLibraryDir;
            applicationInfo.sourceDir = applicationInfo2.sourceDir;
            applicationInfo.publicSourceDir = applicationInfo2.publicSourceDir;
            p2 p2Var = f9.f101;
            p2Var.f270.mo394(applicationInfo, p2Var.f270.mo393(applicationInfo2));
            p2 p2Var2 = f9.f102;
            p2Var2.f270.mo394(applicationInfo, p2Var2.f270.mo393(applicationInfo2));
            p2 p2Var3 = f9.f103;
            p2Var3.f270.mo394(applicationInfo, p2Var3.f270.mo393(applicationInfo2));
            applicationInfo.splitSourceDirs = applicationInfo2.splitSourceDirs;
            applicationInfo.splitPublicSourceDirs = applicationInfo2.splitPublicSourceDirs;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static int m321(String str) {
        int length = str.length();
        int iCharAt = 0;
        for (int i = 0; i < length; i++) {
            int i2 = i;
            iCharAt = (str.charAt(i2) * 31) + (i2 * 31) + (iCharAt * 31);
        }
        return Math.abs(iCharAt);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m322(ComponentInfo componentInfo, ApplicationInfo applicationInfo) {
        if (componentInfo.packageName == null) {
            componentInfo.packageName = applicationInfo.packageName;
        }
        String str = componentInfo.processName;
        if (str == null || str.length() == 0) {
            String str2 = applicationInfo.processName;
            String str3 = str2;
            if (str2 == null || str3.length() == 0) {
                str3 = applicationInfo.packageName;
            }
            componentInfo.processName = str3;
        }
        componentInfo.applicationInfo = applicationInfo;
        String str4 = componentInfo.name;
        if (str4 == null || !StringsKt.startsWith$default(str4, '.', false, 2, (Object) null)) {
            return;
        }
        componentInfo.name = applicationInfo.packageName + componentInfo.name;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static ComponentInfo[] m323(ArrayList arrayList, o1 o1Var, ApplicationInfo applicationInfo, Function1 function1, Function1 function2) {
        if (arrayList.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                PackageParser.Component component = (PackageParser.Component) it.next();
                ComponentInfo componentInfo = (ComponentInfo) function1.invoke(component);
                m322(componentInfo, applicationInfo);
                componentInfo.metaData = component.metaData;
                o1Var.f258.m386(componentInfo.name.hashCode(), componentInfo);
                arrayList2.add(componentInfo);
            }
        } catch (Exception unused) {
        }
        return (ComponentInfo[]) function2.invoke(arrayList2);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final PackageInfo m324(PackageInfo packageInfo, int i) {
        PackageInfo packageInfo2 = new PackageInfo();
        packageInfo2.lastUpdateTime = packageInfo.lastUpdateTime;
        packageInfo2.firstInstallTime = packageInfo.firstInstallTime;
        packageInfo2.reqFeatures = packageInfo.reqFeatures;
        packageInfo2.featureGroups = packageInfo.featureGroups;
        packageInfo2.packageName = packageInfo.packageName;
        packageInfo2.splitNames = packageInfo.splitNames;
        packageInfo2.versionName = packageInfo.versionName;
        packageInfo2.sharedUserId = packageInfo.sharedUserId;
        packageInfo2.applicationInfo = packageInfo.applicationInfo;
        packageInfo2.sharedUserLabel = packageInfo.sharedUserLabel;
        packageInfo2.installLocation = packageInfo.installLocation;
        boolean z = AbstractC0065x6082d607.f498;
        if (AbstractC0065x6082d607.f498) {
            packageInfo2.baseRevisionCode = packageInfo.baseRevisionCode;
            packageInfo2.splitRevisionCodes = packageInfo.splitRevisionCodes;
        }
        if (AbstractC0065x6082d607.f503) {
            packageInfo2.setLongVersionCode(packageInfo.getLongVersionCode());
            if ((i & 134217728) != 0) {
                packageInfo2.signingInfo = packageInfo.signingInfo;
            }
        } else {
            packageInfo2.versionCode = packageInfo.versionCode;
        }
        if (AbstractC0065x6082d607.f5065) {
            packageInfo2.attributions = packageInfo.attributions;
        }
        if ((i & 1) != 0) {
            packageInfo2.activities = packageInfo.activities;
        }
        if ((i & 2) != 0) {
            packageInfo2.receivers = packageInfo.receivers;
        }
        if ((i & 8) != 0) {
            packageInfo2.providers = packageInfo.providers;
        }
        if ((i & 4) != 0) {
            packageInfo2.services = packageInfo.services;
        }
        if ((i & 4096) != 0) {
            packageInfo2.permissions = packageInfo.permissions;
            packageInfo2.requestedPermissions = packageInfo.requestedPermissions;
            packageInfo2.requestedPermissionsFlags = packageInfo.requestedPermissionsFlags;
        }
        if ((i & 16384) != 0) {
            packageInfo2.configPreferences = packageInfo.configPreferences;
        }
        if ((i & 16) != 0) {
            packageInfo2.instrumentation = packageInfo.instrumentation;
        }
        if ((i & 256) != 0) {
            packageInfo2.gids = packageInfo.gids;
        }
        if ((i & 64) == 0) {
            return packageInfo2;
        }
        packageInfo2.signatures = packageInfo.signatures;
        return packageInfo2;
    }
}
