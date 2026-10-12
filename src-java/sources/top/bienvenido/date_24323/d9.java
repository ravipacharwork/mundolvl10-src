package top.bienvenido.date_24323;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/d9.class */
public final class d9 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final p2 f64 = new p2("mAllFields");

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final p2 f65 = new p2("mReadableFieldsWithMaxTargetSdk");

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m125(Class cls) {
        u2 s2Var;
        r2 r2Var;
        try {
            try {
                Field declaredField = cls.getDeclaredField("sNameValueCache");
                declaredField.setAccessible(true);
                if ((declaredField.getModifiers() & 8) == 0 && !declaredField.getType().isPrimitive()) {
                    s2Var = new s2(ca.f51.objectFieldOffset(declaredField));
                } else {
                    s2Var = r2Var;
                    r2Var = new r2(declaredField);
                }
            } catch (Exception unused) {
                s2Var = u2.f337;
            }
            Object objMo393 = s2Var.mo393(null);
            if (objMo393 == null) {
                return;
            }
            Set set = (Set) this.f64.f270.mo393(objMo393);
            if (set != null) {
                set.clear();
            }
            Map map = (Map) this.f65.f270.mo393(objMo393);
            if (map != null) {
                map.clear();
            }
        } catch (Exception unused2) {
        }
    }
}
