package top.bienvenido.date_24323;

import android.content.res.ObbInfo;
import android.os.storage.StorageManager;
import java.lang.reflect.Field;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import top.bienvenido.mundo.blockade.sm.C0082;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/s9.class */
public final class s9 extends AbstractC0057 {

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final s9 f325 = new s9();

    @Override // top.bienvenido.date_24323.AbstractC0057
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo10() throws ClassNotFoundException {
        u2 s2Var;
        r2 r2Var;
        u2 s2Var2;
        r2 r2Var2;
        C0082 c0082 = u4.f341;
        this.f485 = c0082;
        boolean z = AbstractC0065x6082d607.f502xaa30c2c7;
        String str = z ? null : "android.os.storage.IMountService$Stub";
        n9 n9Var = b9.f29;
        d1 d1VarM71 = b9.m71("mount", c0082, str);
        if (d1VarM71 == null) {
            return;
        }
        if (z) {
            try {
                Field declaredField = StorageManager.class.getDeclaredField("sStorageManager");
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
        } else {
            if (AbstractC0065x6082d607.f500) {
                try {
                    Field declaredField2 = StorageManager.class.getDeclaredField("sMountService");
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
            d1VarM71.f54.m386(-1526098847, new t4("mounted"));
        }
        d1VarM71.f54.m386(-123808234, new z4(ObbInfo.class, new q9(new MutablePropertyReference1Impl() { // from class: top.bienvenido.date_24323.r9
            public final Object get(Object obj) {
                return ((ObbInfo) obj).packageName;
            }

            public final void set(Object obj, Object obj2) {
                ((ObbInfo) obj).packageName = (String) obj2;
            }
        })));
        d1VarM71.f54.m386(-1850562866, fa.f108);
        if (AbstractC0065x6082d607.f513) {
            Class<?> cls = Class.forName("android.common.HwFrameworkFactory");
            if (q.m426(cls, "sFactory")) {
                return;
            }
            q.m426(cls, "obj");
        }
    }
}
