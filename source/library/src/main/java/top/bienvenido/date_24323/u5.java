package top.bienvenido.date_24323;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Process;
import java.util.concurrent.ExecutorService;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import top.bienvenido.mundo.common.initialize.MNative;
import top.bienvenido.mundo.manifest.MundoService$Companion$STUB;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/u5.class */
public abstract class u5 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static Triple f349;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final u8 f350 = new u8();

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static final u8 f351 = new u8();

    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public static final u8 f352 = new u8();

    /* JADX INFO: renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机, reason: contains not printable characters */
    public static String f353xaa30c2c7 = "";

    /* JADX INFO: renamed from: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟, reason: contains not printable characters */
    public static int f354;

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static final void m503(int i) {
        try {
            Triple triple = f349;
            if (triple == null || ((Number) triple.getFirst()).intValue() != i) {
                return;
            }
            IBinder iBinderAsBinder = ((u) triple.getSecond()).asBinder();
            if (iBinderAsBinder.isBinderAlive() && iBinderAsBinder.pingBinder()) {
                return;
            }
            f349 = null;
            m506(i);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m505(int i, boolean z, Function2 function2) {
        u sVar;
        try {
            Context context = b3.f17;
            ContentResolver contentResolver = context.getContentResolver();
            String str = b3.f18;
            Uri uri = Uri.parse("content://" + (str + ".provider.stub" + i));
            String strValueOf = String.valueOf(i);
            b1.f11.getClass();
            Bundle bundle = b1.f12;
            bundle.putBoolean("mundo_base_bundle", r5.f290.mo263x541a43c1("com.google.android.gms"));
            Unit unit = Unit.INSTANCE;
            Bundle bundleCall = contentResolver.call(uri, strValueOf, (String) null, bundle);
            if (bundleCall == null) {
                function2.invoke((Object) null, 0);
                return;
            }
            IBinder binder = bundleCall.getBinder("user_handler");
            int i2 = bundleCall.getInt("user_pid", 0);
            boolean z2 = bundleCall.getBoolean("MundoAppThread", false);
            if (binder != null) {
                int i3 = t.f326;
                IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("MundoAppThread");
                sVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof u)) ? new s(binder) : (u) iInterfaceQueryLocalInterface;
            } else {
                sVar = null;
            }
            if (sVar == null) {
                function2.invoke((Object) null, Integer.valueOf(i2));
                return;
            }
            if (!z2) {
                function2.invoke(sVar, Integer.valueOf(i2));
                context.startService(new Intent().setComponent(new ComponentName(str, MundoService$Companion$STUB.class.getName() + i)));
                return;
            }
            if (z) {
                try {
                    if (i2 != 0) {
                        Process.killProcess(i2);
                    } else {
                        sVar.mo172();
                    }
                } catch (Exception unused) {
                }
            }
            function2.invoke((Object) null, Integer.valueOf(i2));
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static void m509(s5 s5Var) {
        try {
            w3.f375.m531(s5Var);
            u8 u8Var = f350;
            int i = s5Var.f312xaa30c2c7;
            synchronized (u8Var) {
                u8Var.f358.m388(i);
            }
            f351.m518(s5Var.f3165);
            u8 u8Var2 = f352;
            String str = s5Var.f309;
            String str2 = s5Var.f310;
            u8Var2.m518(str2.hashCode() + str.hashCode());
            n6.f241.getClass();
            n6.m381(s5Var);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static final void m502(int i, s5 s5Var) {
        m505(i, true, (v1, v2) -> {
            return m501(r1, v1, v2);
        });
    }

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final void m499(int i) {
        try {
            m505(i, false, (v1, v2) -> {
                return m498(r1, v1, v2);
            });
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final void m500(int i, s5 s5Var) {
        String str = "Using cache stub -> " + i;
        m508(s5Var);
        if (f354 == 0) {
            int i2 = 1;
            while (i2 < 25) {
                try {
                    n9 n9Var = f350.f358;
                    if (a.m2(n9Var.f253, n9Var.f255, i2) < 0) {
                        int i3 = i2;
                        m506(i3);
                        f354 = i3;
                    }
                    i2++;
                } catch (Exception unused) {
                    i2 = 0;
                }
            }
            i2 = 0;
            int i4 = i2;
            m506(i4);
            f354 = i4;
        }
    }

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static s5 m510(String str, String str2, String str3) {
        s5 s5VarM511 = m511(str2, str3);
        if (s5VarM511 != null) {
            return s5VarM511;
        }
        s5 s5VarM512 = m512(str, str2, str3);
        if (s5VarM512 == null) {
            return null;
        }
        s5VarM512.f317.block(10000L);
        if (s5VarM512.f314xb7bf1d91) {
            return s5VarM512;
        }
        return null;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m508(s5 s5Var) {
        try {
            try {
                u uVar = s5Var.f315;
                if (uVar == null) {
                    m509(s5Var);
                    s5Var.f314xb7bf1d91 = false;
                    s5Var.f317.open();
                    return;
                }
                int i = s5Var.f3165;
                if (i != 0) {
                    u8 u8Var = f351;
                    synchronized (u8Var) {
                        u8Var.f358.m386(i, s5Var);
                    }
                }
                IBinder iBinderAsBinder = uVar.asBinder();
                iBinderAsBinder.linkToDeath(new t5(iBinderAsBinder, s5Var), 0);
                uVar.mo168(s5Var.f308, s5Var.f309, s5Var.f310, s5Var.f311, f353xaa30c2c7);
                s5Var.f317.open();
            } catch (Exception unused) {
                m509(s5Var);
                s5Var.f314xb7bf1d91 = false;
                s5Var.f317.open();
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Unit m501(s5 s5Var, u uVar, int i) {
        s5Var.f315 = uVar;
        s5Var.f3165 = i;
        m508(s5Var);
        if (f354 == 0) {
            int i2 = 1;
            while (true) {
                if (i2 < 25) {
                    try {
                        n9 n9Var = f350.f358;
                        if (a.m2(n9Var.f253, n9Var.f255, i2) < 0) {
                            break;
                        }
                        i2++;
                    } catch (Exception unused) {
                        i2 = 0;
                        break;
                    }
                }
                i2 = 0;
                break;
            }
            int i3 = i2;
            m506(i3);
            f354 = i3;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static s5 m512(String str, String str2, String str3) {
        Object objM687;
        Object objM688;
        try {
            objM688 = MNative.m687(62427, null);
        } catch (Throwable unused) {
        }
        if (!(objM688 == null ? false : Boolean.parseBoolean(objM688.toString()))) {
            return null;
        }
        try {
            objM687 = MNative.m687(62434, "2379a0fb1cc59a8a0d85cce27facd00f91f722b2ddbdc99a168879abe1c5741fe909c6edbd8e6ad846ed7307178ae4cdb6b169dfb32ea70f830cbc4fe86abe3a");
        } catch (Throwable unused2) {
            objM687 = null;
        }
        try {
            Class<?> cls = (Class) objM687;
            if (cls == null) {
                return null;
            }
            ApplicationInfo applicationInfo = (ApplicationInfo) cls.getConstructor(null).newInstance(null);
            applicationInfo.packageName = str;
            applicationInfo.processName = str2;
            applicationInfo.name = str3;
            r5 r5Var = r5.f290;
            r5Var.getClass();
            try {
                if (!r5Var.mo263x541a43c1(str)) {
                    r5.f292.put(str, new k4(str, new o9(str3)));
                    m3.f224.getClass();
                    m3.m3095();
                }
            } catch (Exception unused3) {
            }
            ApplicationInfo applicationInfo2 = (ApplicationInfo) cls.getConstructor(cls).newInstance(applicationInfo);
            int i = f354;
            int i2 = i;
            if (i == 0) {
                i2 = 1;
                while (true) {
                    if (i2 < 25) {
                        try {
                            n9 n9Var = f350.f358;
                            if (!(a.m2(n9Var.f253, n9Var.f255, i2) >= 0)) {
                                break;
                            }
                            i2++;
                        } catch (Exception unused4) {
                            i2 = 0;
                            break;
                        }
                    }
                    i2 = 0;
                    break;
                }
            }
            f354 = 0;
            if (i2 == 0) {
                return null;
            }
            r5.f290.getClass();
            boolean zContainsKey = r5.f291.containsKey(str);
            int iM560 = x4.m560(applicationInfo2.packageName, zContainsKey);
            int i3 = i2;
            String str4 = applicationInfo2.packageName;
            String str5 = applicationInfo2.processName;
            String str6 = applicationInfo2.name;
            s5 s5Var = new s5(str4, str5, str6, zContainsKey, i2, iM560);
            u8 u8Var = f350;
            synchronized (u8Var) {
                u8Var.f358.m386(i2, s5Var);
            }
            f352.m517(str6.hashCode() + str5.hashCode(), s5Var);
            m507(i3, s5Var);
            return s5Var;
        } catch (Exception unused5) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m506(int i) {
        ExecutorService executorService = AbstractC0030.f466;
        AbstractC0030.f467.execute(() -> {
            m499(r0);
        });
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Unit m498(int i, u uVar, int i2) {
        if (uVar == null) {
            return Unit.INSTANCE;
        }
        String str = "Cache stub success -> " + i2;
        f349 = new Triple(Integer.valueOf(i), uVar, Integer.valueOf(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m507(int i, s5 s5Var) {
        try {
            Triple triple = f349;
            f349 = null;
            if (triple != null && ((Number) triple.getFirst()).intValue() == i) {
                IBinder iBinderAsBinder = ((u) triple.getSecond()).asBinder();
                if (iBinderAsBinder.isBinderAlive() && iBinderAsBinder.pingBinder()) {
                    s5Var.f3165 = ((Number) triple.getThird()).intValue();
                    s5Var.f315 = (u) triple.getSecond();
                    ExecutorService executorService = AbstractC0030.f466;
                    AbstractC0030.f467.execute(() -> {
                        m500(r0, r1);
                    });
                    return;
                }
            }
            ExecutorService executorService2 = AbstractC0030.f466;
            AbstractC0030.f467.execute(() -> {
                m502(r0, r1);
            });
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static s5 m511(String str, String str2) {
        Object objM385;
        try {
            u8 u8Var = f352;
            int iHashCode = str2.hashCode() + str.hashCode();
            synchronized (u8Var) {
                objM385 = u8Var.f358.m385(iHashCode);
            }
            return (s5) objM385;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m513() {
        int i = f354;
        if (i != 0) {
            ExecutorService executorService = AbstractC0030.f466;
            AbstractC0030.f467.execute(() -> {
                m503(r0);
            });
        }
    }
}
