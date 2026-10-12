package top.bienvenido.date_24323;

import android.content.pm.ParceledListSlice;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/g1.class */
public abstract class g1 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Function1 f114;

    static {
        Function1 function1;
        if (AbstractC0065x6082d607.f503) {
            function1 = e1.f68;
        } else {
            function1 = f1Var;
            f1 f1Var = new f1();
        }
        f114 = function1;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static List m157(Object obj) {
        try {
            return !(obj instanceof ParceledListSlice) ? (List) obj : (List) f114.invoke(obj);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static ParceledListSlice m158(List list) {
        try {
            return new ParceledListSlice(list);
        } catch (Throwable unused) {
            return null;
        }
    }
}
