package top.bienvenido.mundo.manifest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import top.bienvenido.date_24323.w3;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/mundo/manifest/MundoReceiver.class */
@Metadata(mv = {2, 2, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/bienvenido/mundo/manifest/MundoReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "mundo"}, xi = 48)
public final class MundoReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            w3 w3Var = w3.f375;
            if (intent != null) {
                Intent intent2 = (Intent) intent.getParcelableExtra("android.intent.extra.INTENT");
                if (intent2 == null) {
                    return;
                }
                String stringExtra = intent.getStringExtra(String.class.getName());
                String str = stringExtra;
                if (stringExtra == null) {
                    str = "0";
                }
                w3Var.mo87(intent2, str);
            }
        } catch (Exception unused) {
        }
    }
}
