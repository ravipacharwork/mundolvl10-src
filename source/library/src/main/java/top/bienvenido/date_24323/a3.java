package top.bienvenido.date_24323;

import android.media.session.MediaSession;
import android.os.Parcel;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import top.bienvenido.mundo.blockade.sm.C0082;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/a3.class */
public final class a3 extends AbstractC0057 {

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final a3 f3 = new a3();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v19 */
    @Override // top.bienvenido.date_24323.AbstractC0057
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void mo10() {
        u2 s2Var;
        u2 s2Var2;
        r2 r2Var;
        u2 s2Var3;
        r2 r2Var2;
        r2 r2Var3;
        C0082 c0082 = u4.f341;
        this.f485 = c0082;
        d1 d1VarM71 = b9.m71("media_session", c0082, null);
        if (d1VarM71 == null) {
            return;
        }
        d1VarM71.f54.m386(-63461894, new z2());
        try {
            Field declaredField = MediaSession.Token.class.getDeclaredField("mBinder");
            declaredField.setAccessible(true);
            if ((declaredField.getModifiers() & 8) == 0 && !declaredField.getType().isPrimitive()) {
                s2Var = new s2(ca.f51.objectFieldOffset(declaredField));
            } else {
                s2Var = r2Var3;
                r2Var3 = new r2(declaredField);
            }
        } catch (Exception unused) {
            s2Var = u2.f337;
        }
        u2 u2Var = s2Var;
        l4.m255(MediaSession.Token.class, (v1) -> {
            return m8(r1, v1);
        });
        Object objMo393 = null;
        if (AbstractC0065x6082d607.f507) {
            try {
                Field declaredField2 = Parcel.class.getDeclaredField("sPairedCreators");
                declaredField2.setAccessible(true);
                if ((declaredField2.getModifiers() & 8) == 0 && !declaredField2.getType().isPrimitive()) {
                    s2Var3 = new s2(ca.f51.objectFieldOffset(declaredField2));
                } else {
                    s2Var3 = r2Var2;
                    r2Var2 = new r2(declaredField2);
                }
            } catch (Exception unused2) {
                s2Var3 = u2.f337;
            }
            objMo393 = s2Var3.mo393(null);
            if (AbstractC0065x6082d607.f508 && objMo393 == null) {
                return;
            }
        }
        if (objMo393 == null) {
            try {
                Field declaredField3 = Parcel.class.getDeclaredField("mCreators");
                declaredField3.setAccessible(true);
                if ((declaredField3.getModifiers() & 8) == 0 && !declaredField3.getType().isPrimitive()) {
                    s2Var2 = new s2(ca.f51.objectFieldOffset(declaredField3));
                } else {
                    s2Var2 = r2Var;
                    r2Var = new r2(declaredField3);
                }
            } catch (Exception unused3) {
                s2Var2 = u2.f337;
            }
            objMo393 = s2Var2.mo393(null);
        }
        if (objMo393 != null) {
            Object r0 = objMo393;
            synchronized (r0) {
                try {
                    Iterator it = ((Map) r0).values().iterator();
                    while (it.hasNext()) {
                        ((Map) it.next()).clear();
                    }
                    r0 = objMo393;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable unused4) {
                    throw r0;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Unit m8(u2 u2Var, MediaSession.Token token) {
        try {
            Object objMo393 = u2Var.mo393(token);
            if (objMo393 == null) {
                return Unit.INSTANCE;
            }
            u2Var.mo394(token, c1.m95(objMo393, u4.f341));
            return Unit.INSTANCE;
        } catch (Exception unused) {
        }
    }
}
