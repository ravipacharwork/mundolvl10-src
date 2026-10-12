package top.bienvenido.date_24323;

import android.app.NotificationManager;
import android.widget.Toast;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/t6.class */
public final class t6 extends AbstractC0057 {

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final t6 f332 = new t6();

    @Override // top.bienvenido.date_24323.AbstractC0057
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo10() {
        o oVar = o.f256;
        this.f485 = oVar;
        d1 d1VarM71 = b9.m71("notification", oVar, null);
        if (d1VarM71 == null) {
            return;
        }
        t2.m483(NotificationManager.class, "sService").mo394((Object) null, d1VarM71.f57);
        t2.m483(Toast.class, "sService").mo394((Object) null, d1VarM71.f57);
        d1VarM71.m118(new int[]{396339264, 1115161719}, u4.f3475);
        if (AbstractC0065x6082d607.f502xaa30c2c7) {
            d1VarM71.f54.m386(-1035691422, new p6());
            d1VarM71.f54.m386(-282102537, new q6());
            d1VarM71.f54.m386(-2041662895, new r6());
            d1VarM71.f54.m386(1008472557, new s6());
        }
    }
}
