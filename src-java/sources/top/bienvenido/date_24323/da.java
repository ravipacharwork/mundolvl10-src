package top.bienvenido.date_24323;

import android.content.pm.UserInfo;
import android.os.PersistableBundle;
import kotlin.collections.CollectionsKt;
import top.bienvenido.mundo.blockade.sm.C0082;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/da.class */
public final class da extends AbstractC0057 {

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final da f66 = new da();

    @Override // top.bienvenido.date_24323.AbstractC0057
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo10() {
        UserInfo userInfo;
        C0082 c0082 = u4.f341;
        this.f485 = c0082;
        d1 d1VarM71 = b9.m71("user", c0082, null);
        if (d1VarM71 == null) {
            return;
        }
        d1VarM71.f54.m386(1811233388, new t4("user"));
        if (AbstractC0065x6082d607.f505) {
            userInfo = userInfo;
            UserInfo userInfo2 = new UserInfo(0, "user", (String) null, 16387, "android.os.usertype.profile.MANAGED");
        } else {
            userInfo = userInfo;
            UserInfo userInfo3 = new UserInfo(0, "user", (String) null, 16387);
        }
        d1VarM71.f54.m386(1967404114, new t4(CollectionsKt.arrayListOf(new UserInfo[]{userInfo})));
        d1VarM71.m118(new int[]{2016450557, 1811096719}, new t4(userInfo));
        d1VarM71.f54.m386(223144277, u4.f342);
        if (AbstractC0065x6082d607.f500) {
            d1VarM71.f54.m386(-255616392, new t4(PersistableBundle.EMPTY));
        }
    }
}
