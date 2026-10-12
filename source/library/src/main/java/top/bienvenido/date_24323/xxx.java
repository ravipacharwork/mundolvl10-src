package top.bienvenido.date_24323;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import kotlin.Triple;
import top.bienvenido.mundo.manifest.MundoActivity$Companion$STUB;
import top.bienvenido.mundo.manifest.MundoReceiver;

/* JADX INFO: renamed from: top.bienvenido.date_24323.xxx烂得过你妈的骚逼么, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/xxx烂得过你妈的骚逼么.class */
public abstract class xxx {
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static Intent m568(Intent intent, int i, x3 x3Var, boolean z, String str) {
        String str2 = MundoActivity$Companion$STUB.class.getName() + i;
        Intent intent2 = new Intent();
        String str3 = b3.f18;
        if (z) {
            str2 = str2 + "H";
        }
        Intent component = intent2.setComponent(new ComponentName(str3, str2));
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.intent.extra.INTENT", intent);
        bundle.putBinder(x3.class.getName(), x3Var);
        if (str != null) {
            bundle.putString(String.class.getName(), str);
        }
        bundle.putString("user", x3Var.f404.f310);
        return component.putExtras(bundle).setType(String.valueOf(intent.filterHashCode()));
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static Intent m569(Intent intent, String str) {
        if (intent.getComponent() == null && intent.getPackage() == null) {
            return null;
        }
        String str2 = b3.f18;
        Intent intentPutExtra = new Intent(str2 + ".mundo.receiver.stub").setComponent(new ComponentName(str2, MundoReceiver.class.getName())).putExtra("android.intent.extra.INTENT", intent);
        if (str == null) {
            return intentPutExtra;
        }
        intentPutExtra.putExtra(String.class.getName(), str);
        return intentPutExtra;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static Triple m570(Intent intent) {
        try {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return null;
            }
            Intent intent2 = (Intent) extras.getParcelable("android.intent.extra.INTENT");
            if (intent2 == null) {
                return null;
            }
            return new Triple(intent2, extras.getBinder(x3.class.getName()), extras.getString(String.class.getName()));
        } catch (Exception unused) {
            return null;
        }
    }
}
