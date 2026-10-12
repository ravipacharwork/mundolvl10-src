package top.bienvenido.date_24323;

import android.telephony.TelephonyManager;
import java.lang.reflect.Field;
import java.util.ArrayList;
import top.bienvenido.mundo.blockade.sm.C0082;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/p8.class */
public final class p8 extends AbstractC0057 {

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final p8 f275 = new p8();

    @Override // top.bienvenido.date_24323.AbstractC0057
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo10() {
        u2 s2Var;
        r2 r2Var;
        ArrayList arrayList;
        u2 s2Var2;
        r2 r2Var2;
        C0082 c0082 = u4.f341;
        this.f485 = c0082;
        d1 d1VarM71 = b9.m71("phone", c0082, null);
        if (d1VarM71 != null) {
            if (AbstractC0065x6082d607.f5065 || AbstractC0065x6082d607.f514) {
                try {
                    Field declaredField = TelephonyManager.class.getDeclaredField("sITelephony");
                    declaredField.setAccessible(true);
                    if ((declaredField.getModifiers() & 8) == 0 && !declaredField.getType().isPrimitive()) {
                        s2Var2 = new s2(ca.f51.objectFieldOffset(declaredField));
                    } else {
                        s2Var2 = r2Var2;
                        r2Var2 = new r2(declaredField);
                    }
                } catch (Exception unused) {
                    s2Var2 = u2.f337;
                }
                s2Var2.mo394((Object) null, (Object) null);
            }
            d1VarM71.m118(new int[]{-1107875961, 1141893961, 666398025, 1057163518}, new t4(g.f111));
        }
        if (AbstractC0065x6082d607.f504xb7bf1d91) {
            n9 n9Var = b9.f29;
            b9.m71("ions", this.f485, null);
        }
        n9 n9Var2 = b9.f29;
        d1 d1VarM72 = b9.m71("isub", this.f485, null);
        if (d1VarM72 != null && AbstractC0065x6082d607.f499 && (arrayList = g.f112) != null) {
            d1VarM72.f54.m386(-652029243, new t4(arrayList));
        }
        if (b9.m71("telephony.registry", this.f485, null) != null && AbstractC0065x6082d607.f505) {
            t2.m482("android.telephony.TelephonyRegistryManager", "sRegistry").mo394((Object) null, (Object) null);
        }
        if (b9.m71("iphonesubinfo", this.f485, null) != null) {
            if (AbstractC0065x6082d607.f505 || AbstractC0065x6082d607.f514) {
                try {
                    Field declaredField2 = TelephonyManager.class.getDeclaredField("sIPhoneSubInfo");
                    declaredField2.setAccessible(true);
                    if ((declaredField2.getModifiers() & 8) == 0 && !declaredField2.getType().isPrimitive()) {
                        s2Var = new s2(ca.f51.objectFieldOffset(declaredField2));
                    } else {
                        s2Var = r2Var;
                        r2Var = new r2(declaredField2);
                    }
                } catch (Exception unused2) {
                    s2Var = u2.f337;
                }
                s2Var.mo394((Object) null, (Object) null);
            }
        }
    }
}
