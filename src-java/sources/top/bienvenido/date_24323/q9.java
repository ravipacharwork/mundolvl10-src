package top.bienvenido.date_24323;

import android.content.res.ObbInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.KMutableProperty1;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/q9.class */
public final /* synthetic */ class q9 extends FunctionReferenceImpl implements Function2 {
    public q9(Object obj) {
        super(2, obj, KMutableProperty1.class, "set", "set(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
    }

    public final Object invoke(Object obj, Object obj2) {
        ((KMutableProperty1) ((FunctionReferenceImpl) this).receiver).set((ObbInfo) obj, (String) obj2);
        return Unit.INSTANCE;
    }
}
