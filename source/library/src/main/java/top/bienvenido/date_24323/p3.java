package top.bienvenido.date_24323;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.lang.reflect.Proxy;
import kotlin.Unit;
import top.bienvenido.mundo.common.initialize.MNative;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/p3.class */
public abstract class p3 {
    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static final ApplicationInfo m406(PackageManager packageManager) {
        Context context = b3.f17;
        return packageManager.getApplicationInfo(b3.f18, 128);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final int m407(PackageManager packageManager) {
        Context context = b3.f17;
        return packageManager.getComponentEnabledSetting(new ComponentName(b3.f18, "top.bienvenido.mundo.FBLoginAbility"));
    }

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final Unit m408(PackageManager packageManager) {
        Context context = b3.f17;
        packageManager.setComponentEnabledSetting(new ComponentName(b3.f18, "top.bienvenido.mundo.FBLoginAbility"), 1, 1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机, reason: contains not printable characters */
    public static void m414xaa30c2c7() {
        try {
            Context context = b3.f17;
            ApplicationInfo applicationInfo = (ApplicationInfo) b3.m57(p3::m406);
            if (applicationInfo == null) {
                return;
            }
            Bundle bundle = applicationInfo.metaData;
            String string = bundle != null ? bundle.getString("MUNDO_APP_KEY", "") : null;
            if (string == null || string.length() == 0) {
                return;
            }
            m417(string, 0);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public static void m415() {
        try {
            Context context = b3.f17;
            Integer num = (Integer) b3.m57(p3::m407);
            int iIntValue = num != null ? num.intValue() : 1;
            if (iIntValue == 0 || iIntValue == 2 || iIntValue == 3 || iIntValue == 4) {
                b3.m57(p3::m408);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static final void m409() {
        m414xaa30c2c7();
        m415();
    }

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static final void m410(String str) {
        m417(str, 0);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static boolean m416() {
        try {
            Object objM687 = MNative.m687(62427, null);
            if (objM687 == null) {
                return false;
            }
            return Boolean.parseBoolean(objM687.toString());
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static boolean m417(String str, int i) {
        String str2;
        if (i > 2) {
            return false;
        }
        try {
            if (str.length() == 0) {
                return false;
            }
            int i2 = MNative.f531;
            p2 p2Var = k9.f205;
            Object objM243 = k9.m243(b3.f17);
            if (objM243 instanceof Proxy) {
                str2 = "";
            } else {
                if (objM243 == null) {
                    return true;
                }
                str2 = str;
            }
            MNative.m687(62426, str2);
            if (m416()) {
                return true;
            }
            return m417(str, i + 1);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static void m411() {
        new Thread(p3::m409).start();
    }

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static void m412(String str) {
        new Thread(() -> {
            m410(r2);
        }).start();
    }

    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public static Object m418(String str) {
        try {
            return MNative.m687(62434, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static String m413(String str) {
        try {
            Object objM687 = MNative.m687(62429, str);
            if (objM687 != null) {
                return objM687.toString();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
