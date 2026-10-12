package top.bienvenido.date_24323;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/q.class */
public abstract class q {
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static j6 m425(int i, d2 d2Var) {
        return new j6((v2) -> {
            return m424(r2, r3, v2);
        });
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Object m424(int i, d2 d2Var, Object obj) {
        d1 d1Var = new d1(obj, u4.f339);
        d1Var.f54.m386(i, d2Var);
        return d1Var.f57;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static boolean m426(Class cls, String str) {
        u2 s2Var;
        r2 r2Var;
        try {
            Field declaredField = cls.getDeclaredField(str);
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
        Object objMo393 = s2Var.mo393(null);
        if (objMo393 == null) {
            return false;
        }
        d1 d1Var = new d1(objMo393, u4.f339);
        d1Var.f54.m386(-89840621, m425(-1850562866, fa.f108));
        d1Var.f54.m386(-1315692475, m425(774213295, u4.f345xb7bf1d91));
        s2Var.mo394((Object) null, d1Var.f57);
        return true;
    }
}
