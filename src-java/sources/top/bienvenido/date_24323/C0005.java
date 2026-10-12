package top.bienvenido.date_24323;

import android.app.servertransaction.ClientTransaction;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: top.bienvenido.date_24323.你亲妈今晚八点在空中翻腾七周半炸成一朵美丽烟花照亮整个台湾海峡, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/你亲妈今晚八点在空中翻腾七周半炸成一朵美丽烟花照亮整个台湾海峡.class */
public final class C0005 implements Function1 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final u2 f447;

    public C0005() {
        u2 u2Var;
        q2 q2Var;
        try {
            Method declaredMethod = ClientTransaction.class.getDeclaredMethod("getCallbacks", i.f159);
            declaredMethod.setAccessible(true);
            u2Var = q2Var;
            q2Var = new q2(declaredMethod);
        } catch (Exception unused) {
            u2Var = u2.f337;
        }
        this.f447 = u2Var;
    }

    public final Object invoke(Object obj) {
        return (List) this.f447.mo432(obj, new Object[0]);
    }
}
