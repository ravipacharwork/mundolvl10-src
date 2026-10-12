package top.bienvenido.date_24323;

import android.accounts.Account;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/ba.class */
public final class ba {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final z9 f31 = new z9();

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final aa m73(Account account, String str) {
        aa aaVar = (aa) this.f31.get(new x9(account, str));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (aaVar != null && jCurrentTimeMillis < aaVar.f10) {
            return aaVar;
        }
        if (aaVar == null) {
            return null;
        }
        this.f31.m585(account.type, aaVar.f9);
        return null;
    }
}
