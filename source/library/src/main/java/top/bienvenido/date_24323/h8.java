package top.bienvenido.date_24323;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/h8.class */
public final /* synthetic */ class h8 extends FunctionReferenceImpl implements Function1 {
    public h8() {
        super(1, C0051.f482, C0051.class, "modifyPackageInfo", "modifyPackageInfo(Landroid/content/pm/PackageInfo;)V", 0);
    }

    public final Object invoke(Object obj) {
        PackageInfo packageInfo = (PackageInfo) obj;
        ((C0051) ((FunctionReferenceImpl) this).receiver).getClass();
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        if (applicationInfo != null && C0051.m649(applicationInfo)) {
            C0051.m650(packageInfo.activities, applicationInfo);
            C0051.m650(packageInfo.receivers, applicationInfo);
            C0051.m650(packageInfo.services, applicationInfo);
            C0051.m650(packageInfo.providers, applicationInfo);
        }
        return Unit.INSTANCE;
    }
}
