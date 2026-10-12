package top.bienvenido.date_24323;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import kotlin.Triple;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/q3.class */
public abstract class q3 extends Activity {
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Unit m433(Intent intent, String str, s0 s0Var) {
        s0Var.mo330(intent, str);
        return Unit.INSTANCE;
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(null);
        finishAndRemoveTask();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        String stringExtra;
        super.onDestroy();
        try {
            Intent intent = getIntent();
            if (AbstractC0065x6082d607.f5065) {
                C0063.m664();
            }
            try {
                stringExtra = intent.getStringExtra("user");
            } catch (Exception unused) {
                stringExtra = null;
            }
            if (stringExtra == null) {
                return;
            }
            Triple tripleM570 = xxx.m570(intent);
            if (tripleM570 != null) {
                Intent intent2 = (Intent) tripleM570.getFirst();
                if (intent2 != null) {
                    String str = stringExtra;
                }
            }
        } catch (Throwable unused2) {
        }
    }
}
