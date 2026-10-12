package top.bienvenido.date_24323;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/d4.class */
public final /* synthetic */ class d4 extends FunctionReferenceImpl implements Function1 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final d4 f60 = new d4();

    public d4() {
        super(1, d0.class, "asInterface", "asInterface(Landroid/os/IBinder;)Ltop/bienvenido/mundo/IMundoActivityManagerService;", 0);
    }

    public final Object invoke(Object obj) {
        IBinder iBinder = (IBinder) obj;
        int i = d0.f52;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("MundoActivityManagerService");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof f0)) ? new c0(iBinder) : (f0) iInterfaceQueryLocalInterface;
    }
}
