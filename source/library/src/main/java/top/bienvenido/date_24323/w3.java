package top.bienvenido.date_24323;

import android.app.ActivityManager;
import android.app.IBinderSession;
import android.app.IServiceConnection;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/w3.class */
public final class w3 extends d0 {

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final w3 f375 = new w3();

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static final ConcurrentHashMap f376 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public static final boolean f377;

    /* JADX INFO: renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机, reason: contains not printable characters */
    public static final v3 f378xaa30c2c7;

    /* JADX INFO: renamed from: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟, reason: contains not printable characters */
    public static final ConcurrentHashMap f379;

    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 */
    public final ComponentName mo76xaa30c2c7(Intent intent, String str) {
        try {
            ServiceInfo serviceInfoM547 = m547(intent);
            if (serviceInfoM547 == null) {
                return null;
            }
            Triple triple = u5.f349;
            s5 s5VarM510 = u5.m510(serviceInfoM547.packageName, serviceInfoM547.processName, str);
            if (s5VarM510 == null) {
                return null;
            }
            ExecutorService executorService = AbstractC0030.f466;
            AbstractC0030.f467.execute(() -> {
                m534(r0, r1, r2);
            });
            return new ComponentName(((ComponentInfo) serviceInfoM547).packageName, ((ComponentInfo) serviceInfoM547).name);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */
    public final int mo77(Intent intent, String str) {
        try {
            ServiceInfo serviceInfoM547 = m547(intent);
            if (serviceInfoM547 == null) {
                return -1;
            }
            Triple triple = u5.f349;
            s5 s5VarM511 = u5.m511(serviceInfoM547.processName, str);
            if (s5VarM511 == null) {
                return 0;
            }
            z5 z5Var = (z5) s5VarM511.f319dj.m385(serviceInfoM547.name.hashCode());
            if (z5Var == null) {
                return 0;
            }
            z5Var.f439 = 0;
            if (!z5Var.f441.isEmpty()) {
                return 0;
            }
            ExecutorService executorService = AbstractC0030.f466;
            AbstractC0030.f467.execute(() -> {
                m535(r0, r1, r2);
            });
            return 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃 */
    public final String[] mo84(int i) {
        Object objM385;
        String[] strArr = new String[3];
        for (int i2 = 0; i2 < 3; i2++) {
            strArr[i2] = "";
        }
        try {
            u8 u8Var = u5.f351;
            synchronized (u8Var) {
                objM385 = u8Var.f358.m385(i);
            }
            s5 s5Var = (s5) objM385;
            if (s5Var != null) {
                strArr[0] = s5Var.f308;
                strArr[1] = s5Var.f309;
                strArr[2] = s5Var.f310;
                return strArr;
            }
        } catch (Exception unused) {
        }
        return strArr;
    }

    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public final int mo87(Intent intent, String str) {
        try {
            if (!q1.m427(intent.getFlags(), 1073741824)) {
                List listMo272 = r5.f290.mo272(intent, (String) null, 0);
                Context context = b3.f17;
                List list = (List) b3.m57((v1) -> {
                    return m543(r0, v1);
                });
                if (list != null) {
                    listMo272.addAll(list);
                }
                if (!listMo272.isEmpty()) {
                    Iterator it = listMo272.iterator();
                    while (it.hasNext()) {
                        ActivityInfo activityInfo = ((ResolveInfo) it.next()).activityInfo;
                        if (str == null || str.length() == 0) {
                            n9 n9Var = u5.f350.f358;
                            int i = 0;
                            while (i < n9Var.f255) {
                                int i2 = i;
                                i = i2 + 1;
                                s5 s5Var = (s5) n9Var.f254[i2];
                                if (Intrinsics.areEqual(s5Var.f308, activityInfo.packageName) && Intrinsics.areEqual(s5Var.f309, activityInfo.processName)) {
                                    String str2 = activityInfo.name;
                                    try {
                                        u uVar = s5Var.f315;
                                        if (uVar != null) {
                                            uVar.mo202(intent, null, str2);
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        } else {
                            Triple triple = u5.f349;
                            s5 s5VarM511 = u5.m511(activityInfo.processName, str);
                            if (s5VarM511 != null) {
                                String str3 = activityInfo.name;
                                try {
                                    u uVar2 = s5VarM511.f315;
                                    if (uVar2 != null) {
                                        uVar2.mo202(intent, null, str3);
                                    }
                                } catch (Exception unused2) {
                                }
                            }
                        }
                    }
                }
                if (intent.getComponent() != null) {
                    return 0;
                }
            }
            ArrayList<C0058> arrayListM571 = f378xaa30c2c7.m571(intent, null, false, 0);
            if (arrayListM571.isEmpty()) {
                return 0;
            }
            for (C0058 c0058 : arrayListM571) {
                if (str == null || str.length() == 0 || Intrinsics.areEqual(c0058.f486.f335.f310, str)) {
                    t8 t8Var = c0058.f486;
                    s5 s5Var2 = t8Var.f335;
                    IBinder iBinder = t8Var.f334;
                    try {
                        u uVar3 = s5Var2.f315;
                        if (uVar3 != null) {
                            uVar3.mo202(intent, iBinder, null);
                        }
                    } catch (Exception unused3) {
                    }
                }
            }
            return 0;
        } catch (Exception unused4) {
            return 0;
        }
    }

    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟 */
    public final ArrayList mo83(int i) {
        Object objM385;
        try {
            u8 u8Var = u5.f350;
            synchronized (u8Var) {
                objM385 = u8Var.f358.m385(i);
            }
            s5 s5Var = (s5) objM385;
            ArrayList arrayList = new ArrayList();
            n9 n9Var = u8Var.f358;
            int i2 = 0;
            while (i2 < n9Var.f255) {
                int i3 = i2;
                i2 = i3 + 1;
                s5 s5Var2 = (s5) n9Var.f254[i3];
                if (s5Var == null || (Intrinsics.areEqual(s5Var.f310, s5Var2.f310) && Intrinsics.areEqual(s5Var.f308, s5Var2.f308))) {
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                    runningAppProcessInfo.processName = s5Var2.f309;
                    runningAppProcessInfo.pid = s5Var2.f3165;
                    runningAppProcessInfo.pkgList = new String[]{s5Var2.f308};
                    runningAppProcessInfo.uid = b3.f19;
                    runningAppProcessInfo.importance = 100;
                    arrayList.add(runningAppProcessInfo);
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return new ArrayList(0);
        }
    }

    /* JADX INFO: renamed from: 老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼, reason: contains not printable characters */
    public static final void m5365(IBinder iBinder) {
        try {
            u uVar = ((z5) iBinder).f436.f315;
            if (uVar != null) {
                uVar.mo171xb7bf1d91(iBinder);
            }
            ((z5) iBinder).f436.f319dj.m388(((z5) iBinder).f437.name.hashCode());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m539(z5 z5Var, Intent intent, IBinder iBinder, s5 s5Var) {
        try {
            z5Var.f440xaa30c2c7.put(new Intent.FilterComparison(intent), iBinder);
            u uVar = s5Var.f315;
            if (uVar != null) {
                uVar.mo169(z5Var, intent);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 爷半夜挖开你妈的棺材拿出手机扫描二维码扫你妈身上的尸斑成功解锁一辆共享单车证明你妈在阴间也还是万人骑, reason: contains not printable characters */
    public static final void m544(String str) {
        Object obj;
        w3 w3Var = f375;
        try {
            Result.Companion companion = Result.Companion;
            if (Intrinsics.areEqual(u5.f353xaa30c2c7, str)) {
                return;
            }
            u5.f353xaa30c2c7 = str;
            w3Var.getClass();
            m548(str, (String) null, (String) null);
            obj = Unit.INSTANCE;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = ResultKt.createFailure(th);
        }
        Object unused = obj;
    }

    static {
        boolean zIsInterface = false;
        if (AbstractC0065x6082d607.f510x541a43c1) {
            try {
                SM.m634();
                zIsInterface = Class.forName("android.app.IBinderSession", false, IBinder.class.getClassLoader()).isInterface();
            } catch (Throwable unused) {
                zIsInterface = false;
            }
        }
        f377 = zIsInterface;
        f378xaa30c2c7 = new v3();
        f379 = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m537(z5 z5Var, s5 s5Var, IBinder iBinder) {
        try {
            for (IBinder iBinder2 : (IBinder[]) z5Var.f441.toArray(new IBinder[0])) {
                if (!iBinder2.isBinderAlive()) {
                    s5Var.f318.remove(iBinder);
                    z5Var.f441.remove(iBinder);
                    f376.remove(iBinder);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */
    public final boolean mo80(IBinder iBinder) {
        try {
            z5 z5Var = (z5) f376.remove(iBinder);
            if (z5Var == null) {
                return false;
            }
            ExecutorService executorService = AbstractC0030.f466;
            AbstractC0030.f467.execute(() -> {
                m540(r0, r1);
            });
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃 */
    public final void mo88(String str, String str2) {
        try {
            ArrayList<s5> arrayList = new ArrayList();
            n9 n9Var = u5.f350.f358;
            int i = 0;
            while (i < n9Var.f255) {
                int i2 = i;
                i = i2 + 1;
                s5 s5Var = (s5) n9Var.f254[i2];
                if (str == null || str.length() == 0 || Intrinsics.areEqual(s5Var.f308, str)) {
                    if (str2 == null || str2.length() == 0 || Intrinsics.areEqual(s5Var.f310, str2)) {
                        arrayList.add(s5Var);
                    }
                }
            }
            for (s5 s5Var2 : arrayList) {
                try {
                    int i3 = s5Var2.f3165;
                    if (i3 > 0) {
                        Process.killProcess(i3);
                    } else {
                        u uVar = s5Var2.f315;
                        if (uVar != null) {
                            uVar.mo172();
                        }
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
        }
    }

    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼 */
    public final void mo925(String str) {
        ExecutorService executorService = AbstractC0030.f466;
        AbstractC0030.f467.execute(() -> {
            m544(r0);
        });
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0055 A[Catch: Exception -> 0x0051, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0051, blocks: (B:2:0x0000, B:3:0x000b, B:4:0x0016, B:6:0x001f, B:9:0x002b, B:11:0x0039, B:14:0x0042, B:25:0x007a, B:27:0x0089, B:28:0x00a0, B:19:0x0055, B:20:0x0059, B:21:0x0062, B:23:0x0067, B:24:0x006d), top: B:31:0x0000 }] */
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m540(z5 z5Var, IBinder iBinder) {
        Intent component;
        try {
            z5Var.f441.remove(iBinder);
            z5Var.f436.f318.remove(iBinder);
            if (z5Var.f441.isEmpty()) {
                u uVar = z5Var.f436.f315;
                if (uVar == null || !uVar.asBinder().isBinderAlive()) {
                    return;
                }
                Pair pair = z5Var.f438;
                if (pair != null) {
                    Intent intent = (Intent) pair.getFirst();
                    component = intent;
                    if (intent == null) {
                        Intent intent2 = new Intent();
                        ServiceInfo serviceInfo = z5Var.f437;
                        component = intent2.setComponent(new ComponentName(((ComponentInfo) serviceInfo).packageName, ((ComponentInfo) serviceInfo).name));
                    }
                } else {
                    Intent intent3 = new Intent();
                    ServiceInfo serviceInfo2 = z5Var.f437;
                    component = intent3.setComponent(new ComponentName(((ComponentInfo) serviceInfo2).packageName, ((ComponentInfo) serviceInfo2).name));
                }
                uVar.mo170(z5Var, component);
                if (z5Var.f439 <= 0) {
                    z5Var.f436.f319dj.m388(z5Var.f437.name.hashCode());
                    uVar.mo171xb7bf1d91(z5Var);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static final void m545(String str, String str2, String str3) {
        Object obj;
        w3 w3Var = f375;
        try {
            Result.Companion companion = Result.Companion;
            if (str2 == null || str2.length() == 0) {
                str2 = null;
            }
            if (str3 == null || str3.length() == 0) {
                str3 = null;
            }
            String str4 = str2;
            w3Var.getClass();
            m548(str, str4, str3);
            obj = Unit.INSTANCE;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = ResultKt.createFailure(th);
        }
        Object unused = obj;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m535(s5 s5Var, z5 z5Var, ServiceInfo serviceInfo) {
        try {
            u uVar = s5Var.f315;
            if (uVar != null) {
                uVar.mo171xb7bf1d91(z5Var);
            }
            s5Var.f319dj.m388(serviceInfo.name.hashCode());
        } catch (Exception unused) {
        }
    }

    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟 */
    public final boolean mo89(String str, String str2) {
        return n6.f241.m333(str, str2);
    }

    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo85(int i, IBinder iBinder, IntentFilter intentFilter) {
        Object objM385;
        t8 t8Var;
        try {
            u8 u8Var = u5.f350;
            synchronized (u8Var) {
                objM385 = u8Var.f358.m385(i);
            }
            s5 s5Var = (s5) objM385;
            if (s5Var != null && s5Var.f320x541a43c1.size() < 100) {
                ConcurrentHashMap concurrentHashMap = f379;
                t8 t8Var2 = (t8) concurrentHashMap.get(iBinder);
                t8 t8Var3 = t8Var2;
                if (t8Var2 == null) {
                    t8Var3 = t8Var;
                    t8Var = new t8(iBinder, s5Var);
                    concurrentHashMap.put(iBinder, t8Var3);
                    s5Var.f320x541a43c1.add(iBinder);
                }
                if (t8Var3.m491(intentFilter)) {
                    return;
                }
                t8 t8Var4 = t8Var3;
                C0058 c0058 = new C0058(intentFilter, t8Var3, s5Var.f308);
                t8Var4.add(c0058);
                f378xaa30c2c7.mo520((IntentFilter) c0058);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static void m548(String str, String str2, String str3) {
        u uVar;
        for (Object obj : u5.f350.f358.m387()) {
            s5 s5Var = (s5) obj;
            if ((str2 == null || Intrinsics.areEqual(s5Var.f308, str2)) && ((str3 == null || Intrinsics.areEqual(s5Var.f310, str3)) && (uVar = s5Var.f315) != null)) {
                uVar.mo174(str);
            }
        }
        w5.m549(str, str2, str3);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m531(s5 s5Var) {
        try {
            Iterator<E> it = s5Var.f318.iterator();
            while (it.hasNext()) {
                f376.remove((IBinder) it.next());
            }
            IBinder[] iBinderArr = (IBinder[]) s5Var.f320x541a43c1.toArray(new IBinder[0]);
            s5Var.f320x541a43c1.clear();
            for (IBinder iBinder : iBinderArr) {
                mo86(iBinder);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final ResolveInfo m533(Intent intent, PackageManager packageManager) {
        return packageManager.resolveService(intent, 512);
    }

    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public final int mo79(Intent intent, IBinder iBinder, String str) {
        z5 z5Var;
        try {
            ServiceInfo serviceInfoM547 = m547(intent);
            if (serviceInfoM547 == null) {
                return -1;
            }
            Triple triple = u5.f349;
            s5 s5VarM510 = u5.m510(serviceInfoM547.packageName, serviceInfoM547.processName, str);
            if (s5VarM510 == null) {
                return 0;
            }
            z5 z5Var2 = (z5) s5VarM510.f319dj.m385(serviceInfoM547.name.hashCode());
            z5 z5Var3 = z5Var2;
            if (z5Var2 == null) {
                z5Var3 = z5Var;
                z5Var = new z5(s5VarM510, serviceInfoM547);
                s5VarM510.f319dj.m386(serviceInfoM547.name.hashCode(), z5Var3);
                u uVar = s5VarM510.f315;
                if (uVar != null) {
                    uVar.mo201(serviceInfoM547.name, null, z5Var3, 0);
                }
            }
            ConcurrentHashMap concurrentHashMap = f376;
            if (!concurrentHashMap.containsKey(iBinder)) {
                int size = z5Var3.f441.size();
                if (size > 3000) {
                    return 0;
                }
                z5 z5Var4 = z5Var3;
                s5VarM510.f318.add(iBinder);
                z5Var4.f441.add(iBinder);
                concurrentHashMap.put(iBinder, z5Var3);
                if (size > 500) {
                    z5 z5Var5 = z5Var3;
                    ExecutorService executorService = AbstractC0030.f466;
                    AbstractC0030.f467.execute(() -> {
                        m537(r0, r1, r2);
                    });
                }
            }
            Pair pair = z5Var3.f438;
            if (pair != null && ((Intent) pair.getFirst()).filterEquals(intent)) {
                z5 z5Var6 = z5Var3;
                ExecutorService executorService2 = AbstractC0030.f466;
                AbstractC0030.f467.execute(() -> {
                    m538(r0, r1, r2);
                });
                return 1;
            }
            z5 z5Var7 = z5Var3;
            ExecutorService executorService3 = AbstractC0030.f466;
            AbstractC0030.f467.execute(() -> {
                m539(r0, r1, r2, r3);
            });
            return 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m534(s5 s5Var, ServiceInfo serviceInfo, Intent intent) {
        z5 z5Var;
        try {
            z5 z5Var2 = (z5) s5Var.f319dj.m385(serviceInfo.name.hashCode());
            z5 z5Var3 = z5Var2;
            if (z5Var2 == null) {
                z5Var3 = z5Var;
                z5Var = new z5(s5Var, serviceInfo);
                s5Var.f319dj.m386(serviceInfo.name.hashCode(), z5Var3);
            }
            z5 z5Var4 = z5Var3;
            int i = z5Var4.f439 + 1;
            z5Var4.f439 = i;
            u uVar = s5Var.f315;
            if (uVar != null) {
                uVar.mo201(serviceInfo.name, intent, z5Var3, i);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final IBinder mo75(String str, String str2, ProviderInfo[] providerInfoArr, String[] strArr, int i) {
        Object objM385;
        try {
            ProviderInfo providerInfoMo277 = r5.f290.mo277(str);
            ProviderInfo providerInfo = providerInfoMo277;
            if (providerInfoMo277 == null) {
                Context context = b3.f17;
                ProviderInfo providerInfo2 = (ProviderInfo) b3.m57((v1) -> {
                    return m532(r0, v1);
                });
                providerInfo = providerInfo2;
                if (providerInfo2 != null) {
                    if (!r5.f292.containsKey(providerInfo.packageName)) {
                        providerInfo = null;
                    }
                } else {
                    providerInfo = null;
                }
                if (providerInfo == null) {
                    return null;
                }
            }
            u8 u8Var = u5.f350;
            synchronized (u8Var) {
                objM385 = u8Var.f358.m385(i);
            }
            s5 s5Var = (s5) objM385;
            if (s5Var != null && Intrinsics.areEqual(s5Var.f308, providerInfo.packageName) && (Intrinsics.areEqual(s5Var.f309, providerInfo.processName) || providerInfo.multiprocess)) {
                providerInfoArr[0] = providerInfo;
                return null;
            }
            s5 s5VarM510 = u5.m510(providerInfo.packageName, providerInfo.processName, str2);
            if (s5VarM510 == null) {
                return null;
            }
            u uVar = s5VarM510.f315;
            if (uVar == null) {
                return null;
            }
            IBinder iBinderMo173dj = uVar.mo173dj(str);
            if (iBinderMo173dj == null) {
                return null;
            }
            strArr[0] = b3.f18 + ".provider.stub" + s5VarM510.f312xaa30c2c7;
            return iBinderMo173dj;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public final void mo86(IBinder iBinder) {
        try {
            t8 t8Var = (t8) f379.remove(iBinder);
            if (t8Var == null) {
                return;
            }
            t8Var.f335.f320x541a43c1.remove(iBinder);
            Iterator<E> it = t8Var.iterator();
            while (it.hasNext()) {
                f378xaa30c2c7.mo521((C0058) it.next());
            }
        } catch (Exception unused) {
        }
    }

    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃 */
    public final void mo90() {
        u5.m513();
    }

    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃 */
    public final IBinder mo91(Intent intent, String str) {
        try {
            ServiceInfo serviceInfoM547 = m547(intent);
            if (serviceInfoM547 == null) {
                return null;
            }
            Triple triple = u5.f349;
            s5 s5VarM511 = u5.m511(serviceInfoM547.processName, str);
            if (s5VarM511 == null) {
                return null;
            }
            z5 z5Var = (z5) s5VarM511.f319dj.m385(serviceInfoM547.name.hashCode());
            if (z5Var == null) {
                return null;
            }
            return (IBinder) z5Var.f440xaa30c2c7.get(new Intent.FilterComparison(intent));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final ProviderInfo m532(String str, PackageManager packageManager) {
        return packageManager.resolveContentProvider(str, 512);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static ServiceInfo m547(Intent intent) {
        ResolveInfo resolveInfo = (ResolveInfo) CollectionsKt.firstOrNull(q1.m429(r5.f290.mo275(intent, null, 0)));
        if (resolveInfo != null) {
            return resolveInfo.serviceInfo;
        }
        Context context = b3.f17;
        ResolveInfo resolveInfo2 = (ResolveInfo) b3.m57((v1) -> {
            return m533(r0, v1);
        });
        if (resolveInfo2 == null) {
            return null;
        }
        ServiceInfo serviceInfo = resolveInfo2.serviceInfo;
        if (r5.f292.containsKey(serviceInfo.packageName)) {
            return serviceInfo;
        }
        return null;
    }

    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final boolean mo78(ComponentName componentName, IBinder iBinder, int i) {
        try {
            if (!(iBinder instanceof z5)) {
                return false;
            }
            if (componentName != null && !Intrinsics.areEqual(componentName.getClassName(), ((z5) iBinder).f437.name)) {
                return true;
            }
            if ((i >= 0 && ((z5) iBinder).f439 != i) || !((z5) iBinder).f441.isEmpty()) {
                return true;
            }
            ExecutorService executorService = AbstractC0030.f466;
            AbstractC0030.f467.execute(() -> {
                m5365(r0);
            });
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m538(IBinder iBinder, z5 z5Var, Pair pair) {
        try {
            IServiceConnection iServiceConnectionAsInterface = IServiceConnection.Stub.asInterface(iBinder);
            ServiceInfo serviceInfo = z5Var.f437;
            ComponentName componentName = new ComponentName(((ComponentInfo) serviceInfo).packageName, ((ComponentInfo) serviceInfo).name);
            if (f377) {
                iServiceConnectionAsInterface.connected(componentName, (IBinder) pair.getSecond(), (IBinderSession) null, false);
                return;
            }
            boolean z = AbstractC0065x6082d607.f498;
            if (AbstractC0065x6082d607.f502xaa30c2c7) {
                iServiceConnectionAsInterface.connected(componentName, (IBinder) pair.getSecond(), false);
            } else {
                iServiceConnectionAsInterface.connected(componentName, (IBinder) pair.getSecond());
            }
        } catch (Throwable unused) {
        }
    }

    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final boolean mo81(IBinder iBinder, Intent intent, IBinder iBinder2) {
        try {
            if (!(iBinder instanceof z5)) {
                return false;
            }
            IBinder iBinder3 = (IBinder) ((z5) iBinder).f440xaa30c2c7.remove(new Intent.FilterComparison(intent));
            if (iBinder3 == null) {
                return false;
            }
            ExecutorService executorService = AbstractC0030.f466;
            AbstractC0030.f467.execute(() -> {
                m541(r0, r1, r2, r3);
            });
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m541(IBinder iBinder, Intent intent, IBinder iBinder2, IBinder iBinder3) {
        try {
            ((z5) iBinder).f438 = new Pair(intent, iBinder2);
            IServiceConnection iServiceConnectionAsInterface = IServiceConnection.Stub.asInterface(iBinder3);
            if (f377) {
                ServiceInfo serviceInfo = ((z5) iBinder).f437;
                iServiceConnectionAsInterface.connected(new ComponentName(((ComponentInfo) serviceInfo).packageName, ((ComponentInfo) serviceInfo).name), iBinder2, (IBinderSession) null, false);
                return;
            }
            boolean z = AbstractC0065x6082d607.f498;
            if (AbstractC0065x6082d607.f502xaa30c2c7) {
                ServiceInfo serviceInfo2 = ((z5) iBinder).f437;
                iServiceConnectionAsInterface.connected(new ComponentName(((ComponentInfo) serviceInfo2).packageName, ((ComponentInfo) serviceInfo2).name), iBinder2, false);
            } else {
                ServiceInfo serviceInfo3 = ((z5) iBinder).f437;
                iServiceConnectionAsInterface.connected(new ComponentName(((ComponentInfo) serviceInfo3).packageName, ((ComponentInfo) serviceInfo3).name), iBinder2);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final IBinder mo82(ComponentName componentName, String str) {
        try {
            r5.f290.getClass();
            ServiceInfo serviceInfo = (ServiceInfo) r5.m463(componentName);
            ServiceInfo serviceInfo2 = serviceInfo;
            if (serviceInfo == null) {
                Context context = b3.f17;
                ServiceInfo serviceInfo3 = (ServiceInfo) b3.m57((v1) -> {
                    return m542(r0, v1);
                });
                serviceInfo2 = serviceInfo3;
                if (serviceInfo3 == null) {
                    return null;
                }
            }
            ServiceInfo serviceInfo4 = serviceInfo2;
            Triple triple = u5.f349;
            s5 s5VarM511 = u5.m511(serviceInfo4.processName, str);
            if (s5VarM511 == null) {
                return null;
            }
            return (IBinder) s5VarM511.f319dj.m385(serviceInfo2.name.hashCode());
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final ServiceInfo m542(ComponentName componentName, PackageManager packageManager) {
        return packageManager.getServiceInfo(componentName, 512);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final List m543(Intent intent, PackageManager packageManager) {
        return packageManager.queryBroadcastReceivers(intent, 0);
    }

    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo93(String str, String str2, String str3) {
        ExecutorService executorService = AbstractC0030.f466;
        AbstractC0030.f467.execute(() -> {
            m545(r0, r1, r2);
        });
    }
}
