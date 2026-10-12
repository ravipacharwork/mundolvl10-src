package top.bienvenido.date_24323;

import android.content.ContentResolver;
import java.lang.reflect.Field;
import top.bienvenido.mundo.blockade.sm.C0082;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/e.class */
public final class e extends AbstractC0057 {

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final e f67 = new e();

    @Override // top.bienvenido.date_24323.AbstractC0057
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo10() {
        u2 s2Var;
        r2 r2Var;
        C0082 c0082 = u4.f341;
        this.f485 = c0082;
        d1 d1VarM71 = b9.m71("content", c0082, null);
        if (d1VarM71 == null) {
            return;
        }
        Object obj = d1VarM71.f57;
        try {
            Field declaredField = ContentResolver.class.getDeclaredField("sContentService");
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
        s2Var.mo394((Object) null, obj);
        d1VarM71.f54.m386(1429369164, new b());
        d1VarM71.f54.m386(133236371, new c());
        d1VarM71.f54.m386(1000160345, new d());
    }
}
