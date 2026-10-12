package top.bienvenido.date_24323;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/n3.class */
public final /* synthetic */ class n3 extends FunctionReferenceImpl implements Function1 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final n3 f236 = new n3();

    public n3() {
        super(1, z.class, "asInterface", "asInterface(Landroid/os/IBinder;)Ltop/bienvenido/mundo/IMundoAccountManagerService;", 0);
    }

    public final Object invoke(Object obj) {
        IBinder iBinder = (IBinder) obj;
        int i = z.f430;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("MundoAccountManagerService");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b0)) ? new y(iBinder) : (b0) iInterfaceQueryLocalInterface;
    }
}
