package top.bienvenido.date_24323;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/a1.class */
public abstract class a1 {
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static Intent m4(IBinder iBinder, Intent intent) {
        Intent intent2 = new Intent();
        if (intent != null) {
            intent2.putExtra("mundo_base_bundle", intent);
        }
        if (iBinder == null) {
            return intent2;
        }
        Bundle bundle = new Bundle();
        bundle.putBinder("mundo_base_string", iBinder);
        intent2.putExtras(bundle);
        return intent2;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static IBinder m5(Intent intent, Intent intent2) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        Intent intent3 = (Intent) intent.getParcelableExtra("mundo_base_bundle");
        if (intent3 != null) {
            try {
                intent2.fillIn(intent3, -1);
            } catch (Exception unused) {
            }
        }
        return extras.getBinder("mundo_base_string");
    }
}
