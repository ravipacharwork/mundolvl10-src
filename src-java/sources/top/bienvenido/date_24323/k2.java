package top.bienvenido.date_24323;

import android.content.pm.ServiceInfo;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/k2.class */
public final /* synthetic */ class k2 extends FunctionReferenceImpl implements Function1 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final k2 f196 = new k2();

    public k2() {
        super(1, ArraysKt.class, "toTypedArray", "toTypedArray(Ljava/util/Collection;)[Ljava/lang/Object;", 1);
    }

    public final Object invoke(Object obj) {
        return (ServiceInfo[]) ((List) obj).toArray(new ServiceInfo[0]);
    }
}
