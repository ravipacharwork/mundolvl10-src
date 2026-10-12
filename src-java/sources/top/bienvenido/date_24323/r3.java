package top.bienvenido.date_24323;

import android.content.Intent;
import com.android.internal.content.ReferrerIntent;
import java.util.List;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/r3.class */
public final class r3 implements Function1 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final /* synthetic */ u2 f289;

    public r3(u2 u2Var) {
        this.f289 = u2Var;
    }

    public final Object invoke(Object obj) {
        Intent intent;
        try {
            List list = (List) this.f289.mo393(obj);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ReferrerIntent referrerIntent = (Intent) list.get(i);
                Triple tripleM570 = xxx.m570(referrerIntent);
                if (tripleM570 != null) {
                    if (AbstractC0065x6082d607.f498) {
                        Intent intent2 = (Intent) tripleM570.getFirst();
                        String str = (String) tripleM570.getThird();
                        String str2 = str;
                        if (str == null) {
                            str2 = referrerIntent.mReferrer;
                        }
                        new ReferrerIntent(intent2, str2);
                    } else {
                        intent = (Intent) tripleM570.getFirst();
                    }
                    list.set(i, intent);
                }
            }
        } catch (Throwable unused) {
        }
        return Unit.INSTANCE;
    }
}
