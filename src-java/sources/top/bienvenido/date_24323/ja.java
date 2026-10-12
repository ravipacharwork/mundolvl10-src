package top.bienvenido.date_24323;

import android.view.WindowManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.KMutableProperty1;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/ja.class */
public final /* synthetic */ class ja extends FunctionReferenceImpl implements Function2 {
    public ja(Object obj) {
        super(2, obj, KMutableProperty1.class, "set", "set(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
    }

    public final Object invoke(Object obj, Object obj2) {
        ((KMutableProperty1) ((FunctionReferenceImpl) this).receiver).set((WindowManager.LayoutParams) obj, (String) obj2);
        return Unit.INSTANCE;
    }
}
