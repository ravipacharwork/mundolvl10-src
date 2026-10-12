package top.bienvenido.date_24323;

import android.app.TaskInfo;
import android.window.WindowContainerToken;
import java.lang.reflect.Field;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/v9.class */
public abstract class v9 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static Function0 f367 = v9::m527;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final u2 f368;

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static final u2 f369;

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final WindowContainerToken m527() {
        try {
            WindowContainerToken windowContainerToken = new WindowContainerToken(new u9());
            f367 = () -> {
                return m526(r1);
            };
            return windowContainerToken;
        } catch (Throwable unused) {
            return null;
        }
    }

    static {
        u2 s2Var;
        u2 s2Var2;
        r2 r2Var;
        r2 r2Var2;
        if (AbstractC0065x6082d607.f505) {
            try {
                Field declaredField = TaskInfo.class.getDeclaredField("token");
                declaredField.setAccessible(true);
                if ((declaredField.getModifiers() & 8) == 0 && !declaredField.getType().isPrimitive()) {
                    s2Var = new s2(ca.f51.objectFieldOffset(declaredField));
                } else {
                    s2Var = r2Var2;
                    r2Var2 = new r2(declaredField);
                }
            } catch (Exception unused) {
                s2Var = u2.f337;
            }
        } else {
            s2Var = u2.f337;
        }
        f368 = s2Var;
        if (AbstractC0065x6082d607.f5065) {
            try {
                Field declaredField2 = TaskInfo.class.getDeclaredField("isVisible");
                declaredField2.setAccessible(true);
                if ((declaredField2.getModifiers() & 8) == 0 && !declaredField2.getType().isPrimitive()) {
                    s2Var2 = new s2(ca.f51.objectFieldOffset(declaredField2));
                } else {
                    s2Var2 = r2Var;
                    r2Var = new r2(declaredField2);
                }
            } catch (Exception unused2) {
                s2Var2 = u2.f337;
            }
        } else {
            s2Var2 = u2.f337;
        }
        f369 = s2Var2;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final WindowContainerToken m526(WindowContainerToken windowContainerToken) {
        return windowContainerToken;
    }
}
