package top.bienvenido.date_24323;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import top.bienvenido.mundo.manifest.MundoService$Companion$STUB;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/j4.class */
public abstract class j4 {

    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public static final ArrayList f182 = new ArrayList();

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final Function1 f183;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final String f184;

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public Object f185;

    public j4(Function1 function1, String str) {
        this.f183 = function1;
        this.f184 = str;
        try {
            f182.add((v1) -> {
                return m219(r1, v1);
            });
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Unit m219(j4 j4Var, Bundle bundle) throws RemoteException {
        IBinder binder = bundle.getBinder(j4Var.f184);
        if (binder != null) {
            Object objInvoke = j4Var.f183.invoke(binder);
            Object obj = objInvoke;
            if (objInvoke != null) {
                binder.linkToDeath(new g4(binder, j4Var), 0);
            } else {
                obj = null;
            }
            j4Var.f185 = obj;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final Object m221() {
        Object obj = this.f185;
        if (obj != null) {
            return obj;
        }
        i4.m211();
        return this.f185;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final Object m222(Function1 function1) {
        try {
            return function1.invoke(m221());
        } catch (Exception unused) {
            try {
                Context context = b3.f17;
                context.startService(new Intent(context, (Class<?>) MundoService$Companion$STUB.class));
                return null;
            } catch (Exception unused2) {
                return null;
            }
        }
    }
}
