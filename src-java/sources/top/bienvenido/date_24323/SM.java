package top.bienvenido.date_24323;

import android.content.pm.ProviderInfo;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.Field;
import kotlin.Triple;

/* JADX INFO: renamed from: top.bienvenido.date_24323.你野爹我冲进妓院看见你妈正在跟人玩SM你那废物爸蹲在角落自慰射旁边狗屎上你妈被狗屎塞逼才生下了你这个人狗杂交的崽种, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/你野爹我冲进妓院看见你妈正在跟人玩SM你那废物爸蹲在角落自慰射旁边狗屎上你妈被狗屎塞逼才生下了你这个人狗杂交的崽种.class */
public abstract class SM {
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final IBinder m633(String str, ProviderInfo[] providerInfoArr, String[] strArr, f0 f0Var) {
        return f0Var.mo75(str, f4.f94, providerInfoArr, strArr, f4.f97xb7bf1d91);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m634() {
        u2 s2Var;
        r2 r2Var;
        try {
            Field declaredField = Bundle.class.getDeclaredField("intentClass");
            declaredField.setAccessible(true);
            if ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) {
                s2Var = r2Var;
                r2Var = new r2(declaredField);
            } else {
                s2Var = new s2(ca.f51.objectFieldOffset(declaredField));
            }
        } catch (Exception unused) {
            s2Var = u2.f337;
        }
        s2Var.mo394((Object) null, (Object) null);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static Triple m635(String str) {
        ProviderInfo[] providerInfoArr = new ProviderInfo[1];
        String[] strArr = new String[1];
        return new Triple((IBinder) e4.f76xaa30c2c7.m222((v3) -> {
            return m633(r1, r2, r3, v3);
        }), strArr[0], providerInfoArr[0]);
    }
}
