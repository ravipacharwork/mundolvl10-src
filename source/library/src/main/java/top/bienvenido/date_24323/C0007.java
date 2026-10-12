package top.bienvenido.date_24323;

import android.app.servertransaction.ClientTransaction;
import android.app.servertransaction.ClientTransactionItem;
import android.app.servertransaction.LaunchActivityItem;
import android.app.servertransaction.NewIntentItem;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: top.bienvenido.date_24323.你再这样火葬场那边要打电话问你妈几分熟的了, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/你再这样火葬场那边要打电话问你妈几分熟的了.class */
public final class C0007 extends AbstractC0057 {

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final C0007 f448 = new C0007();

    @Override // top.bienvenido.date_24323.AbstractC0057
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo10() {
        Function1 function1;
        boolean z = AbstractC0065x6082d607.f509dj;
        boolean zIsInterface = z;
        if (!z && AbstractC0065x6082d607.f508) {
            try {
                Method declaredMethod = ClientTransactionItem.class.getDeclaredMethod("getActivityToken", i.f159);
                declaredMethod.setAccessible(true);
                zIsInterface = declaredMethod.getReturnType().isInterface();
            } catch (Throwable unused) {
                zIsInterface = false;
            }
        }
        s3 s3Var = s3Var;
        s3 s3Var2 = new s3(t2.m483(LaunchActivityItem.class, "mIntent"), t2.m483(LaunchActivityItem.class, "mInfo"), t2.m483(LaunchActivityItem.class, "mReferrer"));
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Object c0022 = s3Var;
        if (AbstractC0065x6082d607.f5065) {
            c0022 = new C0022(objectRef, s3Var);
        }
        boolean z2 = zIsInterface;
        objectRef.element = c0022;
        r3 r3Var = new r3(t2.m483(NewIntentItem.class, "mIntents"));
        if (z2) {
            l4.m255(LaunchActivityItem.class, (v1) -> {
                return m591(r0, v1);
            });
            l4.m255(NewIntentItem.class, r3Var);
            return;
        }
        if (AbstractC0065x6082d607.f505) {
            function1 = C0036.f474;
        } else {
            function1 = c0005;
            C0005 c0005 = new C0005();
        }
        Function1 function2 = function1;
        l4.m255(ClientTransaction.class, (v3) -> {
            return m592(r0, r1, r2, v3);
        });
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Unit m591(Ref.ObjectRef objectRef, LaunchActivityItem launchActivityItem) {
        try {
            ((Function2) objectRef.element).invoke(launchActivityItem, launchActivityItem.getActivityToken());
        } catch (Throwable unused) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Unit m592(Function1 function1, Ref.ObjectRef objectRef, Function1 function2, ClientTransaction clientTransaction) {
        try {
            List list = (List) function1.invoke(clientTransaction);
            if (list != null) {
                Object objFirstOrNull = CollectionsKt.firstOrNull(list);
                if (objFirstOrNull != null) {
                    if (objFirstOrNull instanceof LaunchActivityItem) {
                        ((Function2) objectRef.element).invoke(objFirstOrNull, clientTransaction.getActivityToken());
                    } else if (objFirstOrNull instanceof NewIntentItem) {
                        function2.invoke(objFirstOrNull);
                    }
                    return Unit.INSTANCE;
                }
            }
            return Unit.INSTANCE;
        } catch (Throwable unused) {
        }
    }
}
